package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P24Test extends FunSuite with Matchers {

  test("lotto()") {
    val result = P24.lotto(6, 49)
    val inRange = (x: Int, end: Int) => x > 0 && x <= end
    result.size shouldBe (6)
    result.foreach {
      num => inRange(num, 49) shouldBe (true)
    }
  }

}
