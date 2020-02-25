fun main() {
    val nombre = "Andrea"
    val edad = 35
    val mensajeString = "Bienvenido a strings en Kotlin! :)"
    val mensajeConcatenado = "Ella es " + nombre + " y tiene " + edad + " años"

    println(mensajeString)
    println(mensajeConcatenado)

    //Usando template
    val birthday = "$nombre cumple ${edad + 1} años!"
    println(birthday)

    val text = """
        | Este es un parrafo que se esta trabajando
        | directamente como una variable en Kotlin, utilizando la posibilidad
        | de identar con el metodo trimMargin(), ya que me permite sin importar
        | como este escribiendo, la posibilidad de identar el parrafo.
    """.trimMargin()

    val otherText = """
        < Este es un texto adicional
        < que nos permite utilizar un delimitador
        < para poder imprimir un texto con multiples lineas
        < separadas por un delimitador como es el <.
    """.trimMargin("<")

    println(text)
    println(otherText)
}