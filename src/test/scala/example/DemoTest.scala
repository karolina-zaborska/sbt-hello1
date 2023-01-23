package example

import org.scalatest.{FlatSpec, Matchers}


class DemoTest extends FlatSpec with Matchers {
  "The Demo object" should "say Monday" in {
    Demo.weeklyFunction(1) shouldEqual "Monday"
  }
  /*test("Passing 1 should return Monday") {
    assert(example.Demo.weeklyFunction(1)=="Monday")
  }*/

  //as you can see the words in line 15 play rather explanatory role
  "The Demo object" should "Say tuesday" in {
    Demo.weeklyFunction(2) shouldEqual("Tuesday")
  }

  "The Demo object" should "say Wednesday" in {
    Demo.weeklyFunction(3) shouldEqual "Wednesday"
  }

  "The Demo object" should "say Thursday" in {
    Demo.weeklyFunction(4) shouldEqual "Thursday"
  }

  "The Demo object" should "say Friday" in {
    Demo.weeklyFunction(5) shouldEqual "Friday"
  }

  "The Demo object" should "say Saturday" in {
    Demo.weeklyFunction(6) shouldEqual "Saturday"
  }

  "The Demo object" should "say Sunday" in {
    Demo.weeklyFunction(7) shouldEqual "Sunday"
  }

  "The Demo object" should "say OutOfBounds" in {
    Demo.weeklyFunction(8) shouldEqual "OutOfBounds"
  }


}


