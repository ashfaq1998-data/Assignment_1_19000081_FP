object Q2 extends App {
  def Volume(y : Int) : Double = (4.0/3.0) * scala.math.Pi * scala.math.pow(y,3)

  println("The volume of sphere if the radius is 5 : " + Volume(5))
}
