package main

object OfficialHouse {
  def main(args: Array[String]): Unit = {
    val house = Array.ofDim[Int](4,3,10)
    val in = new java.util.Scanner(System.in)
    val n = in.nextInt
    for(i <- 1 to n){
       val b = in.nextInt()
       val f = in.nextInt()
       val r = in.nextInt()
       val v = in.nextInt()
       house(b-1)(f-1)(r-1) +=v 
    }
    printHouse(house)
  }
  def printHouse(house:Array[Array[Array[Int]]]):Unit ={
    for(i <- 0 to 3){
      for(j <- 0 to 2){
        for(k <- 0 to 9){
          print(" "+house(i)(j)(k))
        }
        println("")
      }
      if(i < 3){
        println("####################")
      }
    }
  }
}