package com.ninetynine.problems.lists

import scala.annotation.tailrec

object P23 {

  def randomSelect[A](num: Int, list: List[A]): List[A] = {
    val random = scala.util.Random
    @tailrec
    def loop(num: Int, list: List[A], res: List[A]): List[A] = (num, list) match {
      case (n, _) if n <= 0 => res
      case (_, Nil) => res
      case (n, xs) => {
        val nextRandom = random.nextInt(xs.size)
        val (l, removed) = P20.removeAt(nextRandom, xs)
        loop(n - 1, l, removed :: res)
      }
    }
    loop(num, list, List.empty[A])
  }

  def randomSelectShorter[A](num: Int, list: List[A]): List[A] = {
    if (num <= 0) Nil
    else {
      val random = scala.util.Random
      val (l, removed) = P20.removeAt(random.nextInt(list.size), list)
      removed :: randomSelectShorter(num - 1, l)
    }
  }
}
