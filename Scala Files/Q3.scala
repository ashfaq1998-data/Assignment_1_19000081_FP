object Q3 extends App {

  def original_price(x: Int): Double = (x * 24.95 * 0.6) + 3

  def extra_copies(x : Int) : Double = (x - 50) * 0.75

  def wholesale_price(x : Int) : Double = if(x <= 50){
    original_price(x)
  }else{
    original_price(x) + extra_copies(x)
  }

  println("The final wholesale price of the copies are : " + wholesale_price(60))
}



