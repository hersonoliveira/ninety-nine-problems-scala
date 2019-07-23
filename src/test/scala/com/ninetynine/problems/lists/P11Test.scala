package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P11Test extends FunSuite with Matchers {

  val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  test("encodeModified()") {
    val expected: List[Any] = List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
    P11.encodeModified(inputList) shouldBe (expected)
  }

}
