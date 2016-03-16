package main

object HowManyDivisors {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val a = in.nextInt
    val b = in.nextInt
    val c = in.nextInt
    var count =0
    for(i <- a to b){
      if(c%i == 0) count+=1
    }
    println(count)
  }
}