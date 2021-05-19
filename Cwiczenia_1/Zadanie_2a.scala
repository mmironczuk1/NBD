object Zadanie_2a {

  def wypiszElem (list: List[String]):String ={
    //metoda z wykładów
    if (list.isEmpty) ""
    else list.head + s", "+ wypiszElem(list.tail)
  }
  def main(args: Array[String]) {
    // zdefiniowanie listy z nazwami tygodnia
    var DniTygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    // wywołanie funkcji
    println(wypiszElem(DniTygodnia))
  }
}
