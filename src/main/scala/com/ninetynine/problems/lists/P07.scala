package com.ninetynine.problems.lists

object P07 {

  def flatten(list: List[Any]): List[Any] = list match {
    case (x: List[_]) :: tail => flatten(x) ::: flatten(tail)
    case y :: tail => y :: flatten(tail)
    case List() => Nil
  }
}
