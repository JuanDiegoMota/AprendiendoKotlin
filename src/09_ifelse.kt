fun main() {
    val mayor = esMayor(6)
    println("El valor 6 es mayor a cero? : $mayor")
    defineTipo("Hey!!")
    defineTipo(10)
    defineTipo(Person("Carlos", 29, "Cafe oscuro"))
}

fun esMayor(data : Int) : Boolean =
    if (data > 0) {
        println("El dato es mayor : $data")
        true
    } else {
        println("El dato")
        false
    }

fun defineTipo(data : Any) {
    if (data is String) {
        println("Es un string con tamaño: ${data.length}")
    } else if (data is Int) {
        println("Es un entero.")
    } else if (data is Person) {
        println("La variable data es una persona con nombre: ${data.name}")
    }
}
