package com.ninetynine.problems.lists

object P24 {

  def lotto(n: Int, end: Int): List[Int] = {
    P23.randomSelect(n, List.range(1, end))
  }
}
