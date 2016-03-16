package main

object Range {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val a = in.nextInt()
    val b = in.nextInt()
    val c = in.nextInt()
    if(a < b && b < c){
      println("Yes")
    }else{
      println("No")
    }
  
  }
}