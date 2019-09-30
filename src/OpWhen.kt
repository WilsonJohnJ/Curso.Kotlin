fun main( args: Array<String>){
    println("Ingrese su edad")
    var edad = readLine()!!.toInt()

    when{
        edad > 18 -> println("eres demasiado mayor")
        edad == 18 -> println("Ya eres mayor")
        edad == 17 -> println("Bienvenido/a")
        edad <= 16 -> println("Eres demasiado joven")
    }
}