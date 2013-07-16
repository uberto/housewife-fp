
case class Zucchini(length: Double){

  def slice(): List[ZucchiniSlice] = List(new ZucchiniSlice())

}

case class ZucchiniSlice()

type AQuantityOf[A] = List[A]



def sliceZucchini(z: Zucchini): AQuantityOf[ZucchiniSlice] = {
   z.slice().take(5)
}

