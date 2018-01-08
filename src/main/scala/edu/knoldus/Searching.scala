package edu.knoldus

class Searching {

  def BinarySearch(list : Array[Int], Element : Int, start : Int=0, end: Int)  : Boolean = {
    if (start>end) return false
    val mid = start + (end-start+1)/2
    if (list(mid) == Element)
      return true
    else if (list(mid)>Element)
      return BinarySearch(list, Element,start, mid-1)
    else
      return BinarySearch(list, Element,mid+1, end)
  }

  def binarySearch(array: Array[Int], elem: Int): Boolean = {

    BinarySearch(array,elem,0,array.length-1)


  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    for(x <- array) {
      if(x == elem)
       return true
    }
    false
  }


}
