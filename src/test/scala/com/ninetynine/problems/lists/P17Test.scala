package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P17Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  test("split()") {
    val expected = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    P17.split(3, inputList) shouldBe expected
  }

  test("splitTailRecursive() length = 3") {
    val expected = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    P17.splitTailRecursive(3, inputList) shouldBe expected
  }

  test("splitTailRecursive() length = 0") {
    val expected = (Nil, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    P17.splitTailRecursive(0, inputList) shouldBe expected
  }

  test("splitTailRecursive() inputList = Nil") {
    val expected = (Nil, Nil)
    P17.splitTailRecursive(3, Nil) shouldBe expected
  }

}
