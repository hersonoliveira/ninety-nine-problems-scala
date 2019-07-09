package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P08Test extends FunSuite with Matchers {

  val inputList: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  test("compress() should return List") {
    P08.compress(inputList) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
  }

  test("compress() should return only element") {
    P08.compress(List('a)) shouldBe List('a)
  }

  test("compress() should return empty List") {
    P08.compress(Nil) shouldBe Nil
  }
}
