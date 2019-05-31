package com.ninetynine.problems.lists

object P06 {

  def isPalindrome[A](list: List[A]): Boolean = {
    if (list.isEmpty) false
    else P05.reverse(list) == list
  }
}
