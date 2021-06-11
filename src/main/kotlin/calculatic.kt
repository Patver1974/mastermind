fun main(args: Array<String>) {
    // 4) Réaliser une calculatrice
    //   Celle-ci permet à l'utilisateur d'effectuer les opérations suivantes :
    //     - Addition
    //     - Soustraction
    //     - Multiplication
    //     - Division entiere
    //     - Division réel
    //     - Le carré d'un nombre
    //     - Si le nombre est pair
    //
    //    Note : gérer les erreurs possible (cf : la division par zéro)

    println("Entrez un chiffre ")
    var nb1 = readLine()!!.toInt()
    println("Entrez une operation")
    var operation = readLine()!!.toString()
    println("Entrez un chiffre ")
    var nb2: String = readLine()!!.toString()

    var resultat = when (operation) {
        "+" -> nb1 + nb2.toInt()
        "-" -> nb1 - nb2.toInt()
        "*" -> nb1 * nb2.toInt()
        "/" ->


            if (nb2.toIntOrNull() != null) {
                if (nb2.toInt()!=0) {nb1 / nb2.toInt()} else { "Division par zero impossible"}

            } else {
                var res :Double = nb1 / nb2.toDouble()
                res.toString()
            }



        else -> "Ce n'est pas une operation connue"
    }
    println("le resultat est $resultat ")

}