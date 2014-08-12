def reverse[A](list: List[A]): List[A] = {
  if(list.isEmpty) List()
  else
    reverse(list.tail) :+ list.head
}


def isPalindrome[A](list: List[A]): Boolean = {
  list == reverse(list)
}
