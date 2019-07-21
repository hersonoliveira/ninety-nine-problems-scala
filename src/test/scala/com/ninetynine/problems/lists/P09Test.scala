package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P09Test extends FunSuite with Matchers {

  val inputList: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  test("pack()") {
    val expected = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    P09.pack(inputList) shouldBe (expected)
  }

}
