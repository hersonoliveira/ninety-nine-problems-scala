package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P23Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'd, 'f, 'g, 'h)

  test("randomSelect()") {
    val num = 3
    P23.randomSelect(num, inputList).size shouldBe num
  }

  test("randomSelect() list = Nil") {
    val num = 3
    P23.randomSelect(num, Nil).size shouldBe 0
  }

  test("randomSelectShorter()") {
    val num = 3
    P23.randomSelect(num, inputList).size shouldBe num
  }

  test("randomSelectShorter() list = Nil") {
    val num = 3
    P23.randomSelect(num, Nil).size shouldBe 0
  }
}
