fun main() {
    var a  = "abc"
    //No es posible hacer ->  a = null

    var definirString : String? = "Nuevo String"
    definirString = null

    val longitudDelPrimerString = a.length
    val longitudDelSegundoString = definirString?.length ?: 0 // Esto es equivalente a if (definirString != null) return definirString.length y else 0.

    println("La longitud del primer String es : $longitudDelPrimerString")
    println("La longitud del segundo String es : $longitudDelSegundoString")

    val primerPersona : Person? = Person("Sebastian", 25, "Ojo Azul")
    val nombrePersona = primerPersona?.name // Esto es equivalente a if (primerPersona != null)

    /*
    Ejemplo de let
     */
    primerPersona?.let {
        // Persona inicializada
        println("Se ejecuta el cuerpo del Let.")
    }

    primerPersona.let {
        //Persona es null
        println("Se ejecuta el cuerpo del Let para un objeto Null.")
    }

}