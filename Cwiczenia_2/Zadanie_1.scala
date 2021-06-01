object Zadanie_1 {
  // funkcja dopasowująca dzień tygodnia do dnia pracującego albo weekendu
  def dniTyg(x : String)= x match {
    case "Poniedziałek" => "Praca"
    case "Wtorek" => "Praca"
    case "Środa" => "Praca"
    case "Czwartek" => "Praca"
    case "Piątek" => "Praca"
    case "Sobota" => "Weekend"
    case "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
  def main(args: Array[String]): Unit ={
    // zmienne testowe
    val s = "Środa"
    val n = "Niedziela"
    val na = "Nieistniejący dzień tygodnia"
    // wynik dla zmiennych testowych
    println(s+": "+dniTyg(s))
    println(n+": "+dniTyg(n))
    println(na+": "+dniTyg(na))


  }

}
