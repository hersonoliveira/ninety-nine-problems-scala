package com.ninetynine.problems.lists

import scala.annotation.tailrec

object P17 {

  def split[A](length: Int, list: List[A]): (List[A], List[A]) = list splitAt length

  def splitTailRecursive[A](length: Int, list: List[A]): (List[A], List[A]) = {
    @tailrec
    def loop(length: Int, list: List[A], res: (List[A], List[A])): (List[A], List[A]) = list match {
      case Nil => (Nil, res._1)
      case l: List[A] if length == 0 => (res._1.reverse, l ::: res._2)
      case h :: tail => loop(length - 1, tail, (h :: res._1, res._2))
    }
    loop(length, list, (Nil, Nil))
  }
}
