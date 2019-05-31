package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P05Test extends FunSuite with Matchers {

  val inputList = List(1, 1, 2, 3, 5, 8)

  test("reverse() should return input list reversed") {
    P05.reverse(inputList) shouldBe List(8, 5, 3, 2, 1, 1)
  }
}
