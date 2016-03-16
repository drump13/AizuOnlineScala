package main

object MatrixVectorMultiplication {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(System.in)
    val height = in.nextInt()
    val width = in.nextInt()
    val array = Array.ofDim[Int](height,width)
    for(i <- 0 to height-1){
      for(j <- 0 to width -1){
        array(i)(j) = in.nextInt()
      }
    }
    val vec = Array.ofDim[Int](width)
    for(i <- 0 to width-1){
      vec(i) = in.nextInt()
    }
    val result =mul(array,vec,height,width)
    for(r <- result){
       println(r)
    }
  }
  def mul(array:Array[Array[Int]],vec:Array[Int],height:Int,width:Int):Array[Int]={
    val res = new Array[Int](height)
    for(i <- 0 to height-1){
      var temp = 0
      for(j <- 0 to width -1){
        temp += array(i)(j) *vec(j)
      }
      res(i) = temp
    }
    return res
  }
}