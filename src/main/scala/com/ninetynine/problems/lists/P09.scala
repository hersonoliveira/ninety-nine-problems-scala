package com.ninetynine.problems.lists

object P09 {

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    def loop(xs: List[Symbol], acc: List[List[Symbol]]): List[List[Symbol]] = xs match {
      case Nil => acc
      case h :: tail =>
        if (acc.isEmpty || h != acc.head.head) loop(tail, List(h) :: acc)
        else loop(tail, (h :: acc.head) :: acc.tail)
    }

    loop(list, List.empty[List[Symbol]]).reverse
  }
}
