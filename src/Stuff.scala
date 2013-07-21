
class Stuff {

  // Trait Lotsof

}


trait Veg {

  def name: String

  def weight: Double

  def unit(weight: Double): Veg

  def slice: (Veg, Slice[Veg]) = {
    if (this.weight > 5)
      (unit(weight - 5), new Slice())
    else
      (unit(0), new Slice())
  }
}

case class Zucchini(weight: Double) extends Veg{
  val name = "zucchini"

  def unit(weight: Double): Veg =  new Zucchini(weight)
}

case class Slice[+Veg]()





