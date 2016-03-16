package main

object Watch {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val a = in.nextInt
    val hour = a / 3600
    val b = a - hour*3600
    val minute = b/ 60
    val second = b - minute*60
    println(hour+":"+minute+":"+second)
  }
}