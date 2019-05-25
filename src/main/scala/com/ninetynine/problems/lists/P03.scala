package com.ninetynine.problems.lists

object P03 {

  def nth[A](pos: Int, list: List[A]): A = (pos, list) match {
    case (0, n :: _) => n
    case (_, _ :: tail) => nth(pos - 1, tail)
    case (_, List()) => throw new NoSuchElementException
  }

}
