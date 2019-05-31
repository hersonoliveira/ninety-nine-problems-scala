package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P06Test extends FunSuite with Matchers {

  val inputList = List(1, 2, 3, 2, 1)

  test("isPalindrome() should return true if input is a palindrome") {
    P06.isPalindrome(inputList) shouldBe true
  }

  test("isPalindrome() should return false if input is not a palindrome") {
    P06.isPalindrome(List(1,3)) shouldBe false
  }

  test("isPalindrome() should return false if input is empty List") {
    P06.isPalindrome(List()) shouldBe false
  }
}
