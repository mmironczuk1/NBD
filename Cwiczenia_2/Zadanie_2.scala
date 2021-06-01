// domyślna wartość konstruktora ustawiona na 0, jeśli nie zostanie wskazana inna wartość
class KontoBankowe(val StanKonta : Double = 0) {

  def wplata(x:Double): Double = StanKonta + x
  def wyplata(x:Double): Double = StanKonta - x

}
object Zadanie_2 {

  def main(args: Array[String]): Unit ={
    // uwtorzenie instacji klasy
    val RICH = new KontoBankowe(1000)
    val POOR = new KontoBankowe
    // dane testowe
    val wyplata = 250
    val wplata = 54.99
    println("Konto RICH")
    println(s"Kwota wypłaty: $wyplata\tDostępne środki: "+RICH.wyplata(wyplata)+"\tSaldo: "+RICH.StanKonta)
    println()
    println("Konto POOR")
    println(s"Kwota wpłaty: $wplata\tDostępne środki: "+POOR.wplata(wplata)+"\tSaldo: "+POOR.StanKonta)


  }
}
