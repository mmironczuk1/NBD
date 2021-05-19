object Zadanie_1a {
  def petlafor(list:List[String]):String= {
    var str = ""
    for (i <- list.indices) {
      if (i < list.length - 1) str += (list(i)+", ")
      else str += list(i)
    }
    str
  }

    def main(args: Array[String]): Unit = {

      // zdefiniowanie listy z nazwami tygodnia
      var DniTygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
      // wywołanie funkcji
      println(petlafor(DniTygodnia))

    }

}
