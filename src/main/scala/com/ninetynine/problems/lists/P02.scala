package com.ninetynine.problems.lists

object P02 {

  def penultimate[A](list: List[A]): A = list match {
    case x :: y :: Nil => x
    case _ :: tail => penultimate(tail)
  }
}
