package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P19Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  test("rotate() places = 3") {
    val expected = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    P19.rotate(3, inputList) shouldBe expected
  }

  test("rotate() places = -2") {
    val expected = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    P19.rotate(-2, inputList) shouldBe expected
  }
}
