//2) Réaliser un programme qui permet de détecter si un texte est un palindrome.
//NB: L'algorithme doit se baser sur l'utilisation de boucle et de collection.


fun main(args: Array<String>) {


    var myList: MutableList<Char> = mutableListOf()
    println("Entrez un mot polindrome")
    var ispolindrome: String = readLine()!!.toString()



    for (i in 0 until ispolindrome.count()) {
        myList.add(ispolindrome.get(i))
    }
    var estunpolindrome: Boolean = true
    for (i in 0 until ispolindrome.count()) {
        if (myList[i] != myList[(ispolindrome.count() - 1) - i]) {
            estunpolindrome = false
        }
    }
    if (estunpolindrome == true) {
        println("c'est un polindrome")
    } else {
        println("ce n'est pas un polindrome")
    }

}