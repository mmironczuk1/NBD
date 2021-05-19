object Zadanie_5 {
  def main(args: Array[String]): Unit ={
    // stworzenie kolekcji produkt -> cena
    val products = Map("beef" -> 30, "shrimps" -> 50, "chicken" -> 12, "pork" -> 15)
    // wykorzystanie metody transform to utworzenia nowej mapy z obniżonymi cenami
    val products_discount = products.transform((k,v) => v*0.9)
    // wynik
    products_discount.keys.foreach( i =>
      println(i+": "+products_discount(i)) )


  }

}
