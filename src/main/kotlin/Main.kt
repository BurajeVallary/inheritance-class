fun main() {
    val banker=Banker("Buraje",22)
    banker.talk("Hello customer")
    banker.eat()
    banker.sleep()
    banker.countMoney(arrayOf(100,100,500,50,200))
    banker.introduction()

    val doctor=Doctor("Mike",29)
    doctor.eat()
    doctor.sleep()
    doctor.talk("Hi how are you feeling?")
    doctor.treatPatient("Vallary","covid",23)
    doctor.introduction()

    val farm = Farmer("Lavin",30)
    farm.eat()
    farm.sleep()
    farm.talk("I love farming")
    farm.cultivateLand()
    farm.introduction()



}
 open class Person(var name:String, var age:Int){
    fun talk(words:String){
        println(words)
    }
     open fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzzz")
    }
 open fun introduction(){
    println("Hi my name is $name")
}
}

class Banker(name:String, age:Int):Person(name,age){
    fun countMoney(notes:Array<Int>):Int{
        return notes.sum()
    }
}
class Doctor ( name:String, age:Int):Person(name,age){

    fun treatPatient(patientName:String, disease:String, age:Int){
        println("Treating $patientName for $disease")
    }
    override fun introduction() {
//        super.introduction()
        println("Hi my name is Dr $name")
    }

}
class Farmer ( name:String,  age:Int):Person(name,age){
    fun cultivateLand(){
        println("dig dig dig")
        }

    override fun eat() {
        super.eat()
        println("I am eating the beans from my farm")
    }


    }
