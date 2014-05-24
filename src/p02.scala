// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5
object p02 {
  def penultimate[A](list: List[A]): A = {
    if (list.isEmpty) throw new NoSuchElementException
    list.drop(2).head
  }

  def penultimateRecursive[A](list: List[A]): A = {
    if (list.isEmpty) throw new NoSuchElementException
    if (list.size == 1) throw new NoSuchElementException
    if (list.size == 2) list.head
    else penultimateRecursive(list.tail)
  }


   def penultimateRecursive[A](list: List[A]): A = list match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimateRecursive(tail)
    case _             => throw new NoSuchElementException
  }

}
