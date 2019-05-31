package com.ninetynine.problems.lists

object P04 {

  def length[A](list: List[A]): Int = list match {
    case _ :: tail => 1 + length(tail)
    case Nil => 0
  }
}
