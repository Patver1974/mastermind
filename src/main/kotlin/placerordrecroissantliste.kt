//1) En utilisant une liste d'entier.
//Réaliser un programme qui permet à l'utilisateur d'encoder des entiers.
//Les valeurs doivent être insérer dans l'ordre croissant.

fun main(args: Array<String>) {
    var myList: MutableList<Int> = mutableListOf()
    var encore: Boolean = true


    do {
        println("Entrez un chiffre ou 0 pour sortir")
        var nb1: Int = readLine()!!.toInt()
        var size: Int = myList.size
        var tmp: Int?
        when (nb1) {
            0 -> encore = false
            else -> {
                if (myList.size == 0) {
                    myList.add(nb1)
                } else {

                    for ((index, value) in myList.withIndex()) {
                        if (nb1 < value) {

                            tmp = value
                            myList.set(index, nb1)
                            nb1 = tmp

                        }

                    }
                    myList.add(nb1)
                }
            }
        }
        for ((index, value) in myList.withIndex()) {
            println("$index  $value")
        }
    } while(encore)
}