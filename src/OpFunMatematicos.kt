
fun main( args: Array<String> ){
    var n1 = 53
    var n2 = 5

    // Operadores Matemáticos

    println( "Suma:  ${n1 + n2}" )
    println( "Resta: ${n1 - n2}" )
    println( "Multiplicación: ${n1 * n2}" )
    println( "División: ${n1 / n2}" )
    println( "Módulo: ${n1 % n2}" )

    // Funciones matemáticas
    var opS = n1.plus(n2)
    var opR = n1.minus(n2)
    var opM = n1.times(n2)
    var opMo = n1.rem(n2)

    println( opS )
    println( opR )
    println( opM )
    println ( opMo )
}