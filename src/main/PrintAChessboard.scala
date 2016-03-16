package main

object PrintAChessboard {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    rec(in)
  }
  def rec(in: java.util.Scanner):Unit ={
    val a = in.nextInt
    val b = in.nextInt
    if(a == 0 && b == 0) return
    for(i <- 1 to a){
      for(j <- 1 to b){
        if((i+j)%2 == 0){
          printf("#")
        }else{
          printf(".")
        }
      }
      println("")
    }
    println("")
    rec(in)
  }
  
}