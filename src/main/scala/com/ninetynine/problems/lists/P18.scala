package com.ninetynine.problems.lists

import scala.annotation.tailrec

object P18 {

  def slice[A](from: Int, to: Int, list: List[A]): List[A] = {
    @tailrec
    def loop(from: Int, to: Int, list: List[A], res: List[A]): List[A] = list match {
      case Nil => res.reverse
      case _ if to <= 0 => res.reverse
      case h :: tail if from <= 0 => loop(0, to - 1, tail, h :: res)
      case _ :: tail => loop(from - 1, to - 1, tail, res)
    }
    loop(from, to, list, Nil)
  }

  def sliceFunctional[A](from: Int, to: Int, list: List[A]): List[A] = list slice(from, to)

}
