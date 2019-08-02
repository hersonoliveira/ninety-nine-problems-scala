package com.ninetynine.problems.lists

import scala.annotation.tailrec

object P12 {

  def decode[A](list: List[(Int, A)]): List[A] = {
    @tailrec
    def _decode(xs: List[(Int, A)], acc: List[A]): List[A] = xs match {
      case Nil => acc
      case h :: tail => _decode(tail, (for {
        _ <- (1 to h._1).toList
      } yield h._2) ::: acc)
    }

    _decode(list, List.empty[A]).reverse
  }

  def decodeFunctional[A](list: List[(Int, A)]): List[A] = {
    list flatMap (x => List.fill(x._1)(x._2))
  }

}
