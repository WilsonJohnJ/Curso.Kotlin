fun main(){
    do{
        print("Ingrese un número: ")
        val valor = readLine()!!.toInt()
        if( valor < 10 )
            println( "El número ingresado tiene un dígito" )
        else
            if( valor < 100 )
                println( "El valor ingresado tiene dos dígitos" )
            else
                println( "El valor ingresado tiene 3 dígitos" )
    }while (valor != 0)
}