fun main(){

    var notas: IntArray
    notas = IntArray(10)

    /**
     * Arreglos unidimiensionales
     */

    // Carga los elementos por teclado

    for( i in 0..9 ){
        print("Ingrese nota: ")
        notas[i] = readLine()!!.toInt()
    }

    // Impresión de los elementos del array

    for( i in 0..9 ){
        println( notas[i] )
    }

    var dias = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(dias.get(0))
    println(dias.get(1))
    println(dias.get(2))
    println(dias.get(3))
    println(dias.get(4))
    println(dias.get(5))
    println(dias.get(6))

    println( "cantidad de  dias " + dias.size )

    /**
     * Arreglos bidimensionales
     */

    var enteros = arrayOf({ 3 ; 5, 6, 8, 9},{3, 5,6,7,8})

}