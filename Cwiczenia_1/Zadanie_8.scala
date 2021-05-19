import scala.::

object Zadanie_8 {
  // funkcja tworząca nową listę pozbawioną 0
  def nozero(int_list: List[Int]): List[Int]={
    if (int_list.isEmpty) int_list
    else if (int_list.head!=0) int_list.head :: nozero(int_list.tail)
    else nozero(int_list.tail)
    }

  def main(args: Array[String]): Unit ={
    // utworzenie testowej listy
    val test_list = List(1, 2, -4, 0, 6, 0, 0, 0, 0, -7, 12)
    // wynik
    print(nozero(test_list))
  }


}
