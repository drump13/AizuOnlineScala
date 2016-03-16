package main

object PrintManyHelloWorld {
  def main(args: Array[String]): Unit = {
    for(i <-1 to 1000){
      println("Hello World")
    }
  }
}