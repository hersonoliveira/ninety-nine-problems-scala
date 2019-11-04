package com.ninetynine.problems.arithmetic

object P32 {

  def gcd(x: Int, y: Int): Int = y match {
    case 0 => x
    case _ => gcd(y, x % y)
  }

}
