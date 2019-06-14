package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P07Test extends FunSuite with Matchers {

  val inputList = List(List(1, 1), 2, List(3, List(5, 8)))

  test("flatten()") {
    P07.flatten(inputList) shouldBe List(1, 1, 2, 3, 5, 8)
  }
}
