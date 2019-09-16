package com.bdd2.jbehave;

import org.jbehave.core.annotations.Given;

import org.jbehave.core.annotations.Then;

import org.jbehave.core.annotations.When;

import com.bdd2.karatsuba.Karatsuba;

import junit.framework.Assert;

public class KaratsubaSteps {

  private String res;
  private Karatsuba kar;

  //private Karatsuba karatsuba;

  @Given("o A é $num e B $num2")
  public void numOfNodes(int num, int num2) {
	  kar = new Karatsuba();
	  kar.setA(num);
	  kar.setB(num2);
	  System.out.println("Números naturais setados "+ num+" e "+num2);

  }


  @When("quando é solicitado a multipliacação de A e B")
  public void addThemInList() {

    System.out.println(">>>> Adding into the list...");

    res = kar.karatsuba();

  }


  @Then("obtemos o resultado de $res2")
  public void getTheListSize(String res2) {

    System.out.println(">>>> Número esperado é - "+res2);

    Assert.assertTrue(res2.equals(res));

  }

}