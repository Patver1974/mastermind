fun main(args: Array<String>) {

    // Réaliser un programme de cotation d'un eleve
    // L'utilisateur encode une cotation de 0 jusqu'à 20.
    var Score :String?
    Score = null

    println("saisie entre 0 et 20: ")
    val nb1 = readLine()!!.toInt()
    val desc :String = when (nb1) {
        in 0..7 -> "echec"
        8, 9 -> "Insuffisant"
        in 10..12 -> "Suffisant"
        in 13..16 -> "Bien"
        in 17..19 -> "tres bien"
        20 -> "Excellent"
        else -> "La valeur est negative"

    }

    if (Score == null) {println("Affiche un score entre 0 et 20 ")} else {println("ton grade est $desc")}
}