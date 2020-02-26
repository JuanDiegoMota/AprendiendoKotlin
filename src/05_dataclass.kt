data class Auto(var marca : String, private var puertas : Int) {
    var numPuertas = puertas
    get() {
        return if (field > 0) field else 1
    }
}


data class Person(var name : String, val age : Int, val colorOjos : String)

fun main(args: Array<String>) {
    val auto = Auto("Ford", 0)

    var marca = auto.marca
    auto.marca = "Chevrolet"
    println(auto.toString())
    auto.numPuertas = 4
    println("El numero de puertas de mi auto es ${auto.numPuertas}")

    var andre = Person("Andrea", 28, "Azules")
    var daya = andre.copy("Dayana")

    println("Esta es Andrea: $andre")
    println("Esta es Dayana: $daya")

    // Se asigna la referencia al objeto cristina del objeto andre
    val cristina = andre
    cristina.name = "Cristina"
    println("Esta es Cristina: $cristina")

    println("----------------------")
    println("Esta es Andrea: $andre")
    println("Esta es Dayana: $daya")
    println("Esta es Cristina: $cristina")
}