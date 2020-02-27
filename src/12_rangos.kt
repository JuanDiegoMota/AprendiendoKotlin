fun main() {
    for (item in 1..4){
        println("El valor del item es: $item")
    }

    println("---------------------------------")
    for (item in 4 downTo 1){
        println("El valor del item es: $item")
    }

    println("---------------------------------")
    for (item in 1..4 step 2) {
        println("El valor del item aumentando en dos es: $item")
    }

    println("---------------------------------")
    for (item in 4 downTo 1 step 2) {
        println("El valor del item disminuyendo en dos es: $item")
    }
    
    println("---------------------------------")
    for (item in 1 until 5) {
        println("El valor del item usando Until es:  $item")
    }

    val esOnce = (1..12 step 2).last == 12
    println("El valor de esOnce es correcto? : $esOnce")
}