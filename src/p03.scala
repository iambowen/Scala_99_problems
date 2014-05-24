/*Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:*/
object P03 {

  def nth(n: Int, list: List[A]): A = {
    if (list.isEmpty || list.length < n + 1) throw new NoSuchElementExcepmtion
    list(n)
  }


  def nthRecursive[A](n: Int, list: List[A]): A = {
    if (list.isEmpty || list.length < n + 1) throw new NoSuchElementException
    if (n == 0) list.head
    else nthRecursive(n - 1, list.tail)
  }

  def nthRecursiveTwo[A](n: Int, list: List[A]): A = (n, list) match {
    case (0, h :: tail) => h
    case (n, _ :: tail) => nthRecursiveTwo(n - 1, tail)
    case (_, List()) => throw new NoSuchElementException
  }
}
