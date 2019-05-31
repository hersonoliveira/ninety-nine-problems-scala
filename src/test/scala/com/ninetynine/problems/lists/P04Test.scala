package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P04Test extends FunSuite with Matchers {

  val inputList = List(1, 1, 2, 3, 5, 8)

  test("length() should return 6") {
    P04.length(inputList) shouldBe 6
  }

  test("length() should return 0") {
    P04.length(List()) shouldBe 0
  }

}
