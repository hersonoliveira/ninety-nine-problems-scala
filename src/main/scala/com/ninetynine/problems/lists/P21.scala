package com.ninetynine.problems.lists

object P21 {

  def insertAt[A](elem: A, pos: Int, list: List[A]): List[A] = list.splitAt(pos) match {
    case (pre, post) => pre ::: elem :: post
  }
}
