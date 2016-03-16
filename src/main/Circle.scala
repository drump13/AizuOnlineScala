package main

object Circle {
	def main(args: Array[String]): Unit = {
   	val in = new java.util.Scanner(System.in)
   	val r = in.nextDouble
   	val menseki = r * r * java.lang.Math.PI
   	val ensyu = 2* r * java.lang.Math.PI
   	println(menseki +" "+ensyu)
	}

}