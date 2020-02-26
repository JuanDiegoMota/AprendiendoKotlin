fun saludar(saludo : String = "Hello everybody!!") {
    println(saludo)
}

// Se puede definir parametros por defecto en una funcion
fun otraFuncion(edad : Int = 0, esAdulto : Boolean = false, tieneRopa : Boolean = true) {
    println("El usuario tiene la edad de $edad, y es un adulto? $esAdulto" +
            " y ademas tiene ropa? $tieneRopa")
}

// Se puede ademas definir valores por defecto para una clase
data class Punto(val posX : Int = 0)

fun main(args : Array<String>) {
    saludar("Hola... Que tal todo!")
    saludar()

    otraFuncion(esAdulto = true, edad = 39, tieneRopa = true)
    otraFuncion(esAdulto = true, edad = 39)
    otraFuncion(esAdulto = true, tieneRopa = true)
    otraFuncion(edad = 39, tieneRopa = true)
    otraFuncion()

    val objPunto = Punto(5)
    println(objPunto)
}
