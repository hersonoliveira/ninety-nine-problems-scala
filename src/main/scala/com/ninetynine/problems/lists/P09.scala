package com.ninetynine.problems.lists

object P09 {

  def pack[A](list: List[A]): List[List[A]] = {
    def loop(xs: List[A], acc: List[List[A]]): List[List[A]] = xs match {
      case Nil => acc
      case h :: tail =>
        if (acc.isEmpty || h != acc.head.head) loop(tail, List(h) :: acc)
        else loop(tail, (h :: acc.head) :: acc.tail)
    }

    loop(list, List.empty[List[A]]).reverse
  }
}
