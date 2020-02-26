fun main(args : Array<String>) {
    val arrayEneros = intArrayOf(1, 232, 435, 5, 21)
    val listaDeStrig = arrayOf("Hola!", "Que tal todo?", "estas bien??")

    val elementoEnArreglo = arrayEneros.get(3)
    val otroElemento = arrayEneros[0]

    arrayEneros.set(2, 100)
    println("Los valores del arreglo son $arrayEneros")

    /*
    Definiendo arreglos mutables.
     */
    val mutableList = mutableListOf(2, 5, 7, 9, 11)
    mutableList.add(13)
    mutableList.add(2, 13)
    mutableList.set(0, 7)

    /*
    Definiendo un mapa
     */
    val map = mutableMapOf<String, Int>(Pair("Key1", 10))
    map.put("Key2", 20)
}