fun main(args: Array<String>) {
    //3) Réaliser un programme qui permet à l'utilisateur de compléter un formulaire
    var rue:String?
    var numero:String?
    var code:String?
    var ville:String?
    rue=null
    numero=null
    ville=null
    code=null



    println("information personnelle ")
    println("ECRIRE NOM ")
    val nom:String=readLine()!!.toString()
    println("ECRIRE PRENOM  ")
    val prenom:String=readLine()!!.toString()
    println("ECRIRE PSEUDO  ")
    val pseudo:String=readLine().toString()
    println("ECRIRE EMAIL ")
    val email:String=readLine()!!.toString()
    println("adresse oui/non ")
    var adresseB:String?
    adresseB=null
    if(readLine()!!.toString()=="oui"){

        println("ECRIRE RUE ")
        rue=readLine()!!.toString()
        println("ECRIRE NUMERO ")
        numero=readLine()!!.toString()
        println("ECRIRE VILLE ")
        ville=readLine()!!.toString()
        println("ECRIRE CP")
        code=readLine()!!.toString()
        if(code.length!=4){
            println("MAUVAIS CP")
            code=readLine()!!.toString()
        }

        adresseB="oui"
    }
    println("$nom $prenom")
    if(pseudo!=null){
        println("$pseudo")
        println("$email ")
        if(adresseB=="oui"){
            println("$rue $numero ")
            println("$code $ville ")}

    }
}
