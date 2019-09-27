
// String
var Name = "John"
var LastName:String = "Smith"

// Char
val letra:Char='S'
val letra2 = 'A'   // Se tiene que usar comillas simples para que el compilador lo considere como char

// Boolean
val bol: Boolean = true

// Números
var n1:Int = 9
var n2:Int = 5
var b1:Byte = 10
var b2:Byte = 5
var precio:Double = 10.05
var interes:Double = 0.05

fun main( args: Array<String> ){
    println( Name )
    println( LastName )
    println( letra )
    println( letra2 )
    println( bol )

    var res = n1 + n2
    println( res )

    var b3 = b1 * b2
    println( "b3 = " + b3 )
    println( "b3 = $b3")

    println( "Precio = $precio , Interes = $interes" )
}