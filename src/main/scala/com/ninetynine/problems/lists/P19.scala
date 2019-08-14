package com.ninetynine.problems.lists

import scala.annotation.tailrec

object P19 {

  def rotate[A](places: Int, list: List[A]): List[A] = {
    @tailrec
    def loop(places: Int, list: List[A]): List[A] = list match {
      case Nil => Nil
      case xs: List[A] if places == 0 => xs
      case h :: tail if places > 0 => loop(places - 1, tail ::: List(h))
      case xs: List[A] if places < 0 => loop(places + 1, xs.last :: xs.dropRight(1))
    }
    loop(places, list)
  }

}
