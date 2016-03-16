package main

object MaxMinAndSum {
	def main(args: Array[String]): Unit = {
		val in = new java.util.Scanner(System.in)
		val n = in.nextInt()
		val buffer = scala.collection.mutable.MutableList[Int]()
		for(i <- 1 to n){  
		  val a = in.nextInt()
			buffer += a
			println(i)
		}
		val list = buffer.toList
		println(list.min+" " +list.max+" "+list.sum)   
	}

}


