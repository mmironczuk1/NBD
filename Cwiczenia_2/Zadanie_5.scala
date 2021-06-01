// klasa osoba
class Osoba2(){
  val imie:String = "Michał"
  val nazwisko:String = "Mirończuk"
  def podatek: Double = 5
}


// trait Pracownik
trait Pracownik extends Osoba2 {
  private var _pensja:Double = 10
  def pensja: Double= _pensja
  def pensja_=(value:Double): Unit = _pensja = value
  override def podatek: Double = 0.2*pensja
}
// trait Student
trait Student extends Osoba2 {
  override def podatek = 0
}
// trait Nauczyciel
trait Nauczyciel extends Pracownik{
  override def podatek: Double = 0.1*pensja
}
object Zadanie_5 {
  def main(args: Array[String]): Unit ={
    // stworzenie obiektów
    val pracownik = new Osoba2 with Pracownik
    val student = new Osoba2() with Student
    val nauczyciel = new Osoba2() with Nauczyciel
    // dodanie pensji do pracownika i nauczyciela
    pracownik.pensja = 10000
    nauczyciel.pensja = 10000
    println("Pensja pracownika: "+pracownik.pensja+" Kwota podatku: "+pracownik.podatek)
    println("Pensja nauczyciela: "+nauczyciel.pensja+" Kwota podatku: "+nauczyciel.podatek)
    println("Kwota podatku studenta: "+student.podatek)
    println()

    // stworzenie obiektów
    val prac_stud = new Osoba2() with Pracownik with Student
    val stud_prac = new Osoba2() with Student with Pracownik
    // dodanie pensji
    prac_stud.pensja = 5000
    stud_prac.pensja = 5000
    println("val prac_stud = new Osoba2() with Pracownik with Student")
    println("Pensja studenta: "+prac_stud.pensja+" Kwota podatku: "+prac_stud.podatek)
    println("val stud_prac = new Osoba2() with Student with Pracownik")
    println("Pensja studenta: "+stud_prac.pensja+" Kwota podatku: "+stud_prac.podatek)

  }

}
