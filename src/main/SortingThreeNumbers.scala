package main

object SortingThreeNumbers {
	def main(args: Array[String]): Unit = {
			val in = new java.util.Scanner(System.in)
			val a = in.nextInt()
			val b = in.nextInt()
		  val c = in.nextInt()
		  val ls = a::b::c::Nil
			val re = ls.sorted
			println(re.apply(0)+" "+re.apply(1)+" "+re.apply(2))

	}
}