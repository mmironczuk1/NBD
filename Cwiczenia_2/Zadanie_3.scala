// stworzenie klasy Osoba
case class Osoba(imie: String, nazwisko: String)

object Zadanie_3 {
  // funkcja dopasowująca powitania do konkretnych osób
  def maczing(osoba: Osoba):String = {
    osoba match {
      case Osoba("Jerzy", "Witos") => "Jurek, kopę lat!"
      case Osoba("Aleksandra", _) => "Dzień dobry Aleksandro."
      case Osoba( _, "Kwiatkowska") => "Witaj, Kwiatuszku!"
      case Osoba(imie, _) => s"Cześć, $imie!"
    }
  }
  def main(args: Array[String]): Unit ={
    // uwtorzenie kilku instancji klasy Osoba
    val jurek = Osoba("Jerzy", "Witos")
    val ola = Osoba("Aleksandra", "Gałązka")
    val kwiatuszek = Osoba("Izabela", "Kwiatkowska")
    val ktokolwiek = Osoba("Miłosz", "Mydełko")

    println(maczing(jurek))
    println(maczing(ola))
    println(maczing(kwiatuszek))
    println(maczing(ktokolwiek))

  }
}
