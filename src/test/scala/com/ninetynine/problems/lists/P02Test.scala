package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P02Test extends FunSuite with Matchers {

  test("penultimate() should return penultimate element of the list") {
    val input = List(1, 1, 2, 3, 5, 8)
    P02.penultimate(input) shouldBe 5
  }

}
