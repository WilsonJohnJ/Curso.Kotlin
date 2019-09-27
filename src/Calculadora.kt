
fun main( args: Array<String> ){
    println("-----------------------")
    println("     CALCULADORA       ")
    println("-----------------------")

    println( "Ingrese el primer número: " )
    var n1 = Integer.valueOf(readLine())
    println( "Ingrese el segundo número " )
    var n2 = Integer.valueOf(readLine())

    var s = n1 + n2
    var r = n1 - n2
    var p = n1 * n2
    var d = n1 / n2

    println( "Resultados:" )
    println( "Suma : $s" )
    println( "Resta : $r" )
    println( "Producto : $p" )
    println( "División : $d" )
}