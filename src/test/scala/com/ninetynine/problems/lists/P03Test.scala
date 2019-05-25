package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P03Test extends FunSuite with Matchers {

  val inputList = List(1, 1, 2, 3, 5, 8)

  test("nth() should return 2") {
    P03.nth(2, inputList) shouldBe 2
  }

  test("nth() should throw NoSuchElementException if pos > list.length") {
    an[NoSuchElementException] shouldBe thrownBy {
      P03.nth(6, inputList)
    }
  }

}
