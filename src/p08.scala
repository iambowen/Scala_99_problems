/*scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)*/


def compress[A](list: List[A]): List[A] = {
  if(list.isEmpty) List()
  else if(list.tail.contains(list.head))
    compress(list.tail)
  else
    list.head :: compress(list.tail)
}

def compress(list: List[A]): List[A] = {
  list.distinct
}

def compress(list: List[A]): List[A] = {
  list.toSet.toList
}
