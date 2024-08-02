class KotlinProblems {

    fun main() {
        //problem 2
        println("Use the val keyword when the value doesn't change.");
        println("Use the var keyword when the value can change.");
        println("When you define a function, you define the parameters that can be passed to it.")
        println("When you call a function, you pass arguments for the parameters.")

        //problem 3
        println("New chat message from a friend")

        //problem 4

        var discountPercentage: Int = 0
        var offer: String = ""
        var item = "Google Chromecast"
        discountPercentage = 20
        offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

        println(offer)

        //problem 5

        val numberOfAdults = "20"
        val numberOfKids = "30"
        val total = numberOfAdults + numberOfKids
        println("The total party size is: $total")

        //problem 6

        val baseSalary = 5000
        val bonusAmount = 1000
        val totalSalary = "$baseSalary + $bonusAmount"
        println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

        //problem 7

        val firstNumber = 10
        val secondNumber = 5
        val thirdNumber = 8

        val result = add(firstNumber, secondNumber)
        val anotherResult = add(firstNumber, thirdNumber)

        println("$firstNumber + $secondNumber = $result")
        println("$firstNumber + $thirdNumber = $anotherResult")
    }
}