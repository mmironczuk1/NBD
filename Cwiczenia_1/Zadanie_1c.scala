object Zadanie_1c {
  def petlawhile (list:List[String]):String= {
    var str = ""
    var a = 0
    while (a < list.length){
      if (a < list.length-1) str += (list(a)+", ")
      else str += list(a)
      a += 1
    }
    str
  }

  def main(args: Array[String]): Unit = {

    // zdefiniowanie listy z nazwami tygodnia
    var DniTygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    // wywołanie funkcji
    println(petlawhile(DniTygodnia))

  }

}

