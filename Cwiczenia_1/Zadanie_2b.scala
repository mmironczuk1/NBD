object Zadanie_2b {

  def wypiszElemOdwrotnie (list: List[String]):String ={
    // zmodyfikowana metoda z wykładów
    if (list.isEmpty) ""
    else wypiszElemOdwrotnie(list.tail) + list.head + s", "
  }
  def main(args: Array[String]) {
    // zdefiniowanie listy z nazwami tygodnia
    var DniTygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    // wywołanie funkcji
    println(wypiszElemOdwrotnie(DniTygodnia))
  }
}
