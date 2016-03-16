package main

object Xcubic {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val a =in.nextInt
    val b = a*a*a
    println(b)
  }
}