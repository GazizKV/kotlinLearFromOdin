import java.math.BigDecimal

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")
    /*
    * Swap two variables
    * */
    var a = 1
    var secondVar = 2
    a = secondVar.also { secondVar = a }
    print("a = $a and secondVar = $secondVar");

}