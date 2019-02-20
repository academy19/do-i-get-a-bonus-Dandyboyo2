object Application {

  def toBonusOrNotToBonus(salary : Int, bonus : Boolean) : String = {

    if (bonus) s"You received a bonus, your new salary is: £${(salary * 1.2).toInt}"

    else s"You receive a bonus, you keep your original salary of: $salary"
  }

  def main(args : Array[String]) : Unit = {
    println(toBonusOrNotToBonus(100, true))  // should print £120
    println(toBonusOrNotToBonus(100, false)) // should print £100
    println(toBonusOrNotToBonus(99, true))   // should print £118
  }
}
