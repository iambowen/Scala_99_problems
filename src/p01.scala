#List(1, 1, 2, 3, 5, 8).last should also works

def last[A](list: List[A]) : A = {
  list.last
}


def lastRecursive[A](list: List[A]) : A = list match {
  case last :: Nil => last
  case _ :: last => lastRecursive(last)
  case _ => throw new NoSuchElementException
}
