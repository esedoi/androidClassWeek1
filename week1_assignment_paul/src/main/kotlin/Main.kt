

fun main(args: Array<String>) {

    var hasMana = true
    if(hasMana == true) {

        SubHuman("mage").attack()
    }else{
        Human("human").attack()
    }

}

open class Human(name:String) {
    val name = name
    open fun attack() {
        println("$name Use Fist Attack")
    }
}

class SubHuman(name:String):Human(name){
    override fun attack(){
        println("$name use Fireball!")

    }
}
