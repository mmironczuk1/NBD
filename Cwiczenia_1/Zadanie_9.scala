object Zadanie_9 {
  // zdefiniowanie funkcji do mapowania innej funkcji (zwracającej liczby całkowite)
  def applyf(list: List[Int], func:Int=>Int): List[Int]= list map func
  def main(args: Array[String]): Unit ={
    // utworzenie listy testowej
    val test_list = List(1, 3, 6, -5, 2, -4, 10, 71, -3, 0)
    // wywołanie funkcji applyf na liście testowej z funkcją zwiększającą każdą wartość o 1
    println(applyf(test_list, x => x + 1))
  }
}
