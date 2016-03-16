package main

object StructuredProgramming {
	def main(args: Array[String]): Unit = {
	  val in = new java.util.Scanner(System.in)
	  val n =  in.nextInt
	  call(1,n)
	}
	def call(n : Int,lim:Int): Unit = {
	  if (lim < n){
	    println("")
	    return
	  }
	  val i = n
	  if(i % 3 == 0){
	    printf(" "+i)
	  }else{
	    callRec(i,i)
	  }
	  call(i+1,lim)
	}
	def callRec(ori:Int,n:Int):Unit={
	  if(n == 0) return
	  if(n % 10 == 3) {
	    printf(" "+ori)
	    return
	  }
	  callRec(ori,n/10)
	}
}