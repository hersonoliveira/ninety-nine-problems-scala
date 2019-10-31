package com.ninetynine.problems

package object arithmetic {

  implicit class IntSolutions(num: Int) {

    def isPrime: Boolean = {
      val nums = (2 to num / 2).toList
      num > 1 && !nums.exists(num % _ == 0)
    }
  }

}
