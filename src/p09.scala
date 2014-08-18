/*scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))*/

def pact[A](list: List[A]): List[List[A]] = {
  if(list.isEmpty) List(List())
  else
    val (packed, next) = list.span(_ == list.head)
    if (packed == Nil) pack(next)
    else
      packed :: pack(next)
}

def pact[A](list: List[A]):List[List[A]] = {
  list.distinc.map {x => list.filter(_ == x)}
}
