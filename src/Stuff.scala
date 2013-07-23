package myStuff

object Stuff {

  // Trait Lotsof


  trait Veg {

    def name: String

    def weight: Double


    def slice: (Veg, Slice[Veg]) = {
      if (this.weight > 5)
        (unit(weight - 5), new Slice())
      else
        (unit(0), new Slice())
    }

    def unit(weight: Double): Veg
  }


  case class Zucchini(weight: Double) extends Veg {
    val name = "zucchini"

    def unit(weight: Double): Veg = new Zucchini(weight)
  }


  case class Slice[+Veg]()


  case class Potato(weight: Double) extends Veg {
    def name: String = "potato"

    def unit(weight: Double): Potato = new Potato(weight)
  }

  case class PeeledPotato extends Veg {
    def name: String = "skinned potato"

    def weight: Double = 50

    def unit(weight: Double): PeeledPotato = new PeeledPotato()


  }


  case class Skin()


  def peelPotato(potato: Potato): (PeeledPotato, Skin) = {

    (new PeeledPotato(), Skin())

  }

}







