def flatten(list: List[_]): List[Any] = list match {
   case (x: List[_]) :: tail => x ::: flatten(tail)
   case h :: tail => h :: flatten(tail)
   case Nil => Nil
}
