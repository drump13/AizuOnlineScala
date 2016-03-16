package main

object Rectangle {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val a = in.nextInt
    val b = in.nextInt
    println(a*b+ " "+(2*a + 2*b))
  }
}