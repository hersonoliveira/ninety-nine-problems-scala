package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P26Test extends FunSuite with Matchers {

  val inputList: List[Symbol] = List('a, 'b, 'c, 'd, 'e)

  test("combinations()") {
    val expected = List(List('a, 'b), List('a, 'c), List('a, 'd), List('a, 'e), List('b, 'c), List('b, 'd), List('b, 'e), List('c, 'd), List('c, 'e), List('d, 'e))
    P26.combinations(2, inputList) shouldBe expected
  }

}
