fun main() {
    titulo()
    suma( 3, 4 )
}

fun titulo(){
    println("=====================")
    println(" MANEJO DE FUNCIONES")
    println("=====================")
}

fun suma( x: Int, y: Int ){
    var z = x + y
    println("La suma es $z")
}