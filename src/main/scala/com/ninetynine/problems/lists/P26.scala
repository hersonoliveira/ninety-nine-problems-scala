package com.ninetynine.problems.lists

object P26 {

  def combinations[A](n: Int, xs: List[A]): List[List[A]] = {
    xs match {
      case List() => Nil
      case s: List[A] if n == 1 => s map (List(_))
      case h :: tail => (for {
        comb <- combinations(n - 1, tail)
      } yield h :: comb) ::: combinations(n, tail)
    }
  }

}
