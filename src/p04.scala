def length[A](list: List[A]): Int = {
    if(list.isEmpty) 0
    else 1 + length(list.tail)
}

def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
}
