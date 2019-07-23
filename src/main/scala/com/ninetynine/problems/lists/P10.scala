package com.ninetynine.problems.lists

import com.ninetynine.problems.lists.P09.pack

object P10 {

  def encode[A](list: List[A]): List[(Int, A)] = {
    pack(list) map (list => (list.length, list.head))
  }
}
