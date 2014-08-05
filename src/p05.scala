def reverse[A](list: List[A]): List[A] = {
  if(list.isEmpty) List()
  else
    reverse(list.tail) :+ list.head
}
