package com.ninetynine.problems.lists

import com.ninetynine.problems.lists.P10.encode

object P11 {

  def encodeModified[A](list: List[A]): List[Any] = {
    encode(list) map {
      case (int, x) => if (int == 1) x else (int, x)
    }
  }

}
