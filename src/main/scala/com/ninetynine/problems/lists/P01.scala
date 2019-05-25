package com.ninetynine.problems.lists

object P01 {

  def last[A](list: List[A]): A = list match {
    case last :: Nil => last
    case _ :: tail => last(tail)
  }
}
