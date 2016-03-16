package main

object SwappingTwoNumbers {
	def main(args: Array[String]): Unit = {
		val in = new java.util.Scanner(System.in)   
		rec(in)
	}
	
	def rec(in:java.util.Scanner){
	  val a = in.nextInt()
	  val b = in.nextInt()
	  if(a==0 && b==0) return
	  else if(a > b) println(b + " "+ a)
	  else println(a +" " + b)
	  rec(in)
	}
}