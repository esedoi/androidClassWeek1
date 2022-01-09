
fun main(args: Array<String>) {

    var mega= Mega("mage").attack()
    var human= Human("human").attack()

}


open class Human(name:String) {
    val name = name
    var humanString = "$name Use Fist Attack"
    open fun attack() {
        print(humanString )
        if(humanString.contains("Fist".toString())){
            println("  dosen't has mana")
        }else if(humanString.contains("Fireball".toString())){
            println("  has mana")
        }
    }
}

class Mega(name:String):Human(name){
    var megaString = "$name Use Fireball"
    override fun attack(){
        print(megaString)
        if(humanString.contains("Fist".toString())){
            println("  dosen't has mana")
        }else if(humanString.contains("Fireball".toString())){
            println("  has mana")
        }

    }
}
