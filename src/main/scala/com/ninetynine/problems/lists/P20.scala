package com.ninetynine.problems.lists

object P20 {

  def removeAt[A](pos: Int, list: List[A]): (List[A], A) = {
    (list.filter(list.indexOf(_) != pos), list(pos))
  }
}
