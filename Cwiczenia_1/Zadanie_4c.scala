object Zadanie_4c {

  def main(args: Array[String]) {
    // zdefiniowanie listy z nazwami tygodnia
    var DniTygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    // użycie filtrowania do wybrania dni tygodnia zaczynających się na "P"
    // użycie metody foldLeft
    // dodanie anonimowej funkcji do zsumowania elementów tablicy
    println(DniTygodnia.filter(_.startsWith("P")).foldLeft("") {(str1, str2) => str1 + str2 + ", "})

  }
}
