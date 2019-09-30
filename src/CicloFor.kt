fun main(){

    // Utilizando un rango con extremos fijo

    for( n in 1..10)
        println( n )

    // Utilizando un rango con el extremo final variable

    var cant = 0
    println("Ingrese el numero de valores:")
    val cantidad = readLine()!!.toInt()
    for( i in 1..cantidad ){
        print("Ingrese valor:")
        val valor = readLine()!!.toInt()
        if( valor % 2 == 0 )
            cant++
    }
    println("Cantidad de pares: $cant")
}