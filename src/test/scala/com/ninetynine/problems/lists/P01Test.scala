package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P01Test extends FunSuite with Matchers {

  test("last() should return last element of list") {
    val input = List(1, 1, 2, 3, 5, 8)
    P01.last(input) shouldBe 8
  }

}
