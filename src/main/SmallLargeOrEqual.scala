package main

object SmallLargeOrEqual {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val a = in.nextInt
    val b = in.nextInt
    if(a < b){
      println("a < b")
    }else if(a == b){
      println("a == b")
    }else{
      println("a > b")
    }
    
  }
}