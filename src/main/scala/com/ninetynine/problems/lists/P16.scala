package com.ninetynine.problems.lists

object P16 {

  def drop[A](pos: Int, list: List[A]): List[A] = list diff List(list(pos - 1))

}
