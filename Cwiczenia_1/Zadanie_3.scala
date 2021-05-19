import scala.annotation.tailrec

object Zadanie_3 {

  def wypElemOgon(list: List[String]): String = {
    @tailrec
    def wypElem(list: List[String], currentStr: String): String = {
      if (list.isEmpty) currentStr
      else wypElem(list.tail, currentStr + list.head+ ", ")
    }

    wypElem(list, "")
  }

  def main(args: Array[String]) {
    // zdefiniowanie listy z nazwami tygodnia
    var DniTygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    // wywołanie funkcji
    println(wypElemOgon(DniTygodnia))
  }
}
