package com.ninetynine.problems.lists

object P08 {

  def compress(list: List[Symbol]): List[Symbol] = list match {
    case List() => Nil
    case h :: tail if !tail.isEmpty && h != tail.head => h :: compress(tail)
    case h :: Nil => h :: compress(Nil)
    case _ :: tail => compress(tail)
  }

}
