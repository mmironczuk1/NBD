object Zadanie_6 {
  // zdefiniowanie funkcji przyjmującej 3-elementową krotkę
  def mytuple(tuple3: (Any, Any, Any)): Unit ={
    print(tuple3._1+", "+tuple3._2+", "+tuple3._3)
  }

  def main(args: Array[String]): Unit ={
    // zdefiniowanie krotki trzyelementowej
    val tuple = Tuple3("One", 1000, 1.54)
    // wywołanie funkcji + wynik
    println("Elementy krotki:")
    mytuple(tuple)

  }

}
