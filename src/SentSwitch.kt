fun main(){
    print( "Ingrese el número de dia: " )
    val mes = readLine()!!.toInt()
    when( mes ){
        1 -> print( "lunes" )
        2 -> print( "martes" )
        3 -> print( "miercoles" )
        4 -> print( "jueves" )
        5 -> print( "viernes" )
        6 -> print( "sabado" )
        7 -> print( "domingo" )
    }
}