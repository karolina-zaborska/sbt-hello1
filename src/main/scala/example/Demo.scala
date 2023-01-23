package example

object Demo {

  def weeklyFunction(number: Int): String =  number match {
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case 7 => "Sunday"
    case _ => "OutOfBounds"
  }
}
