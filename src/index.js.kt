fun main() {
    var human =Mosa("James","20",40)
    human.eat(2)
    println(human.weight)
    human.speak("I play basket")
    var mary=User("Deng","Achol","dengacholangela@gmail.com","0745850917","4wr")
    println(mary.firstName)
    println(mary.email)
    }
class Mosa(var name:String,var age:String,var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kg of food")
    }
    fun add(weight:Int){
        println(2)
        }

fun speak(speech:String){
    println(speech)
}
fun birthday(age:Int) {
    println(age)
}
}
data class User(val firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){


}









