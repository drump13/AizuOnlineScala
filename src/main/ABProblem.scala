package main

object ABProblem {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val a = in.nextInt
    val b = in.nextInt
    val c = a.toDouble/b
    println(a/b+" "+a%b+" "+c)
     
  }
}