package pizza_pos

import cats.Show           //the type class
import cats.syntax.show._  //the interface syntax

/**
  * this example is similar to p.254-255 of the “Cat Show” example in
  * “Advanced Scala with Cats”
  */
object Driver extends App {

    implicit val pizzaShow = Show.show[Pizza] { p =>
        s"""|Pizza(${p.crustSize}, ${p.crustType}),
            |      toppings = ${p.toppings}""".stripMargin
    }

    val pizza = Pizza(
        LargeCrustSize,
        ThinCrustType,
        Seq(Cheese, Pepperoni, Sausage)
    )

    println(pizza.show)


}


