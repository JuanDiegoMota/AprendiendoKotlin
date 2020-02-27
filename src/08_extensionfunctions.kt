fun main(args : Array<String>) {
    "Hi Using Extension Functions".print()
    println("Usando otra extension function para ${4.multiply(3)}")
    println("Usando un infix function para ${4 powForTwo 5}")

    val moviesList = mutableListOf("Crazy and stupid love", "Harry Potter and the secret chamber", "Creed", "Rocky IV")
    moviesList.swap(0, 2)
    println("La lista de pelicules es {${moviesList.toString()}}")
}

fun <T> MutableList<T>.swap(firstIndex : Int, finalIndex : Int) {
    val temp = this[firstIndex]
    this[firstIndex] = this[finalIndex]
    this[finalIndex] = temp
}

infix fun Int.powForTwo( value : Int) : Int {
    return this * 2 * value
}

fun Int.multiply(miNum : Int) : Int {
    return this * miNum
}

fun String.print() {
    println("Este es un nuevo print -> $this")
}