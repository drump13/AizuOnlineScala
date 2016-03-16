package main

object CircleInARectangle {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val W = in.nextInt()
    val H = in.nextInt()
    val x = in.nextInt()
    val y = in.nextInt()
    val r = in.nextInt()
    if(r <=x && r <= y && r <= W-x && r <= H-y){
      println("Yes")
    }else{
      println("No")
    }
  }
}