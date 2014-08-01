def length(list: List[A]): Int = {
    if(list.isEmpty) 0
    else 1 + length(list.tail)
}
