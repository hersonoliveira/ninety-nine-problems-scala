package com.ninetynine.problems.lists

object P16 {

  def drop[A](pos: Int, list: List[A]): List[A] = {
    list filterNot {
      x => ((list indexOf (x)) + 1) % pos == 0
    }
  }

}
