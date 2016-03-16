package main
object ReversingNumbers {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val n = in.nextInt
    val list:List[Int] = makeList(in,n)
    val re = list.reverse
    printList(re)
    
  }
  def makeList(in:java.util.Scanner,rest:Int):List[Int] = {
    if(rest == 0) return List.empty 
    val a = in.nextInt
     return a :: makeList(in,rest -1)
  }
  def printList(list:List[Int]):Unit = {
    list match{
      case List(n) =>{ println(n); return}
      case n :: ls => {print(n+" ");printList(ls)}
    }
  }
}