package com.ninetynine.problems.lists

object P13 {

  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    list.foldRight(List.empty[List[A]]) {
      (elem, acc) =>
        if (acc.isEmpty || acc.head.head != elem)
          List(elem) :: acc
        else
          (elem :: acc.head) :: acc.tail
    }.map(xs => (xs.size, xs.head))
  }
}
