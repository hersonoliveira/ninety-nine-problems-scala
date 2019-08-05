package com.ninetynine.problems.lists

object P14 {

  def duplicate[A](list: List[A]): List[A] = list flatMap (x => List(x, x))
}
