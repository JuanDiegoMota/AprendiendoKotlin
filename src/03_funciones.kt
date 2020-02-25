fun greeting() : Unit {
    println("Hello Everybody!! :D")
}

fun add(a: Int, b: Int) {
    println("La suma de a y b es: ${a + b}")
}

/*
fun max(a: Int, b: Int) : Int {
    if(a > b) {
        return a
    } else {
        return b
    }
} */

fun max(a: Int, b: Int) = if (a >  b) a else b

fun main(args : Array<String>) {
    println("El dato mayor entre 4 y 9 es: ${max(4, 9)}")
}