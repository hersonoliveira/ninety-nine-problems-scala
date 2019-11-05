package com.ninetynine.problems

import com.ninetynine.problems.arithmetic.P32._

package object arithmetic {

  implicit class IntSolutions(num: Int) {

    def isPrime: Boolean = {
      val nums = (2 to num / 2).toList
      num > 1 && !nums.exists(num % _ == 0)
    }

    def isCoprimeTo(x: Int): Boolean = gcd(num, x) == 1

    def totient: Int = {
      def loop(x: Int, acc: Int): Int = {
        if (x < 0) acc
        else {
          val sum = if (x.isCoprimeTo(num)) 1 else 0
          loop(x - 1, acc + sum)
        }
      }

      loop(num, 0)
    }
  }

}
