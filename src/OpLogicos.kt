fun main(args: Array<String>){
    println( "=====================================")
    println( "               AND                   ")
    println( "=====================================")
    println( "false && false : ${ false && false }")
    println( "false && true  : ${ false && true }")
    println( "true  && false : ${ true && false }")
    println( "true  && true  : ${ true && true }")

    println( "=====================================")
    println( "               OR                   ")
    println( "=====================================")
    println( "false || false : ${ false || false }")
    println( "false || true  : ${ false || true }")
    println( "true  || false : ${ true || false }")
    println( "true  || true  : ${ true || true }")

    println( "=====================================")
    println( "               NOT                   ")
    println( "=====================================")
    println( "!false : ${ !false }")
    println( "!true  : ${ !true }")
}