object Zadanie_1b {
  def petlaforP (list: List[String]):String={
    var str = ""
    for (i <- list.indices) {
    // dodanie metody .startsWith w celu znalezienia nazw dni tygodnia zaczynających się na "P"
    if (list(i).startsWith("P")) str += (list(i)+", ")
  }
    str
  }

  def main(args: Array[String]): Unit = {

    // zdefiniowanie listy z nazwami tygodnia
    var DniTygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    // wywołanie funkcji
    println(petlaforP(DniTygodnia))

  }

}