// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5
object p02 {
  def penultimate(list: List[A]): A = {
    if (list.isEmpty) throw NoSuchElementException
    list.drop(2).head
  }

  def penultimateRecursive(list: List[A]): A = {
    if (list.isEmpty) throw NoSuchElementException
    if (list.size == 1) throw NoSuchElementException
    if (list.size == 2) list.head
    else penultimateRecursive(list.tail)
  }
}
