object Zadanie_4 {
  def funkcja( x: Int, f: Int => Int): Int = f(f(f(x)))

  def funkcja_wew(x: Int): Int = 2*x + 1

  def main(args: Array[String]): Unit ={
    val zmienna = 4

    println("f(x)=2x+1")
    println(s"f(f(f($zmienna))) = "+funkcja(zmienna, funkcja_wew))

  }
}
