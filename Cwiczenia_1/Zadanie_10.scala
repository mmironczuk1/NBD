object Zadanie_10 {
  def main(arg: Array[String]): Unit ={
    //utworzenie listy testowej
    val test_list = List(-1, -3.6, 5.5, 23, 0, 4.333, -76, 40)
    // użycie filtrowania dla przedziału <-5, 12>
    // użycie literal function do zmapowania modułu
    println(test_list.filter(_>=(-5)).filter(_<=12) map {x => x.abs})
  }

}
