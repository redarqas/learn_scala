package team.is.learning.scala.jojax

object Samples {

  def main(args: Array[String]): Unit = {
    inifinite3()
  }

  def myMethode(x: String): String = {
    println(x)
    s"coucou $x"
  }

  def infinite() : Unit = {
    println("csdsdsd")
    infinite()
  }




  def inifinite3() : Unit = {

    def loop(n: Int) : Unit = {
      println("coucou")
      if(n == 2) {

        ()

      } else {

        loop(n + 1)

      }
    }

    loop(0)
  }


















































}
