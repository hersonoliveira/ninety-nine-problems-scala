package com.ninetynine.problems.lists

object P15 {

  def duplicateN[A](multiplier: Int, list: List[A]): List[A] = {
    list flatMap {
      x =>
        for {
          _ <- (1 to multiplier).toList
        } yield x
    }
  }

  def duplicateN2[A](multiplier: Int, list: List[A]): List[A] = {
    list flatMap (x => List.fill(multiplier)(x))
  }

}
