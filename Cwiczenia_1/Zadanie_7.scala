object Zadanie_7 {
  // funkcja dopasowująca wartość Some i None do wskazanych wartości
  def trueoption( value: Option[Any]) = value match {
    case Some(value) => value
    case None => "N/A"
  }

  def main(args: Array[String]): Unit ={
    // zdefiniowanie mapy
    val stolice = Map("Mazowieckie" -> "Warszawa", "Lubelskie" -> "Lublin", "Podkarpackie" -> "Rzeszów")
    println("trueoption(stolice.get(\"Mazowieckie\")) : " + trueoption(stolice.get("Mazowieckie")))
    println("trueoption(stolice.get(\"Podlaskie\")) : " + trueoption(stolice.get("Podlaskie")))
  }

}
