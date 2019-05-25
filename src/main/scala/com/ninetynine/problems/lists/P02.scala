package com.ninetynine.problems.lists

object P02 {

  def penultimate[A](list: List[A]): A = list match {
    case x :: _ :: Nil => x
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}
