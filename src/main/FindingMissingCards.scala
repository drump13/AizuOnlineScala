package main

import com.sun.xml.internal.ws.api.pipe.NextAction

object FindingMissingCards {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val n = in.nextInt()
    val list = makeCardList(in,n)
    val ls = list.sorted
    for(s <- List("S","H","C","D")){
      for(i <- 1 to 13){
        if(!ls.contains((s,i))){
          println(s + " " + i)
        }
      }
    }
  }
  def makeCardList(in:java.util.Scanner,rest:Int):List[(String,Int)] ={
    val s = in.next()
    val num = in.nextInt()
    if (rest ==1){
      return List((s,num))
    }else{
      return (s, num) :: makeCardList(in, rest-1)
    }
    
  }
  def printList(ls:List[(java.lang.String,Int)]):Unit = {
    ls match{
      case List(s) => println(s);return
      case n :: ls => println(n);printList(ls)
    }
  }
}