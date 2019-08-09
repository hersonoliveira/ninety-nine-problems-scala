package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P16Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  test("drop()") {
    val expected = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    P16.drop(3, inputList) shouldBe (expected)
  }

}
