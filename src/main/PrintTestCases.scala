package main

object PrintTestCases {
	def main(args: Array[String]): Unit = {
			val in = new java.util.Scanner(System.in)
			rec(in,1)
	}
	def rec(in:java.util.Scanner,count:Int):Unit = {
	  val a = in.nextInt()
	  if(a == 0) return
	  println("Case "+count+": "+a)
	  rec(in,count+1)
	}
}