
fun main( args: Array<String> ){
    val numInt: Int = 55
    val numDouble: Double = numInt.toDouble()

    println( numInt )
    println( numDouble )

    val numString: String = numInt.toString()

    println( numString )

    val numString2: String = "56"

    println( numString + numString2 )

    val numInt2: Int = numString2.toInt()

    println( numInt + numInt2 )
}