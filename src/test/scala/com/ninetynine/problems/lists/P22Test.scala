package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P22Test extends FunSuite with Matchers {

  test("range()") {
    val expected = List(4, 5, 6, 7, 8, 9)
    P22.range(4, 9) shouldBe expected
  }
}
