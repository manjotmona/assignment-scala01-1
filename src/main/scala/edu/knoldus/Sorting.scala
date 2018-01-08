package edu.knoldus

class Sorting {

  def insertionSort(list: Array[Int]): Array[Int] = {
    for(i<-0 to list.length-2)
    {
      for(j<-0 to list.length-2)
      {
        if (list(j)>list(j+1))
        {
          val swap=list(j+1)
          list(j+1)=list(j)
          list(j)=swap
        }
      }
    }
    list

  }

  def selectionSort(list: Array[Int]): Array[Int] = {
    for (i <- 0 to (list.length -1))
    {
      var min = i
      for(j <- (i+1) to list.length)
      {
        if (list(j) < list(min))
          min = j
      }
      if (i != min)
      {
        val swap = list(i);
        list(i) = list(min);
        list(min) = swap;
      }
    }
    return list

  }

  def bubbleSort(list: Array[Int]): Array[Int] = {
    for(i <- 1 to list.length - 1)
    {
      var index = i-1;
      while(index >=0 && list(i)<list(index))
      {
        index = index - 1
      }
      if(index != i-1)
      {
        val swap = list(i);
        list(i) = list(index+1);
        list(index+1) = swap;
      }
    }
    list

  }

}
