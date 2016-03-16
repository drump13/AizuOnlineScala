package main

object SimpleCalclator {
  def main(args: Array[String]): Unit = {
    val in  =new java.util.Scanner(System.in)
    rec(in)
  }
  def rec(in:java.util.Scanner):Unit ={
    val a = in.nextInt
    val op = in.next
    val b = in.nextInt
    op match{
      case "+" => println(a+b);rec(in)
      case "-" => println(a-b);rec(in)
      case "*" => println(a*b);rec(in)
      case "/" => println(a/b);rec(in)
      case "?" => return
    }
  }
}