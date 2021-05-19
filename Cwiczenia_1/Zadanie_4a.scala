object Zadanie_4a {
  def foldl (str1:String, str2:String):String={
    str1+str2+", "
  }
  def main(args: Array[String]) {
    // zdefiniowanie listy z nazwami tygodnia
    var DniTygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    // użycie metody foldLeft
    println(DniTygodnia.foldLeft("") (foldl))

  }
}
