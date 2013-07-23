import Stream._

val numbers: Stream[Int] = Stream.from(1)


type FizzBuzzTransf = (Int, String) => String

def num: FizzBuzzTransf = (i, os) => if (os.isEmpty) i.toString() else os

def lift(stream: Stream[Int], f: FizzBuzzTransf): String = stream.map( f(_, "")).mkString(" ")

def ifEmit: (Int, String) => FizzBuzzTransf = (modn, noise) => (i, os) => if (i % modn == 0) noise + os else os

def fizz: FizzBuzzTransf = ifEmit(3, "fizz")

def buzz: FizzBuzzTransf = ifEmit(5, "buzz")


def composed: FizzBuzzTransf = (i, os) => num(i, buzz(i, fizz(i, os)))

val fb5 = lift(numbers.take(20), composed)
















