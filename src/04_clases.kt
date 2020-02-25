class Ejemplo {
    fun greating() {
        println("Hello from Kotlin!!")
    }
}

// Es posible definir un constructor de la siguiente manera
//class Persona constructor(val nombre : String) {}

class Persona(val nombre : String) {
    init {
        println("Nombre: $nombre")
    }
    //Otro constructor
    constructor(name : String, edad : Int) : this(name) {
        println("Nombre $nombre y edad $edad")
    }
}

// Clase padre
open class Base(val inicial : Int) {
    open fun imprimeAlgo() {
        println("Clase base y su inicial es $inicial")
    }
}

// Clase hijo
class General(val value : Int) : Base(value) {
    override fun imprimeAlgo() {
        super.imprimeAlgo()
        val suma = 2 * value
    }
}

fun main(args : Array<String>) {
    val personaAndrea = Persona("Andrea")
    val personaJuliana = Persona("Juliana", 35)
    println(personaAndrea)

    //Nuevo objeto
    val general = General(15)
    general.imprimeAlgo()
}
