// INTERFACE CASE

/*

class Parent(override val name: String, override val age: Int) : fam{}
class FirstChild(override val name: String, override val age: Int) : fam{}
class SecondChild(override val name: String, override val age: Int) : fam{}
interface fam{
    val name : String
    val age : Int
    fun ciao() : String {
        return "The name is $name and the age is $age"
    }
}
fun main(){

    val par = Parent("Giuseppe",54)

    val child1 = FirstChild("Ale",23)

    val child2 = SecondChild("Michi",18)

    println("PARENT: " + par.ciao())
    println("FIRST CHILD: " + child1.ciao())
    println("SECOND CHILD: " + child2.ciao())
}
*/

// INHERITANCE CASE

class Parent(override val name: String, override val age: Int) : fam(name, age){}
class FirstChild(override val name: String, override val age: Int) : fam(name, age){}
class SecondChild(override val name: String, override val age: Int) : fam(name, age){}
open class fam(open val name: String, open val age: Int){
    fun ciao() : String {
        return "The name is $name and the age is $age"
    }
}
fun main(){

    val par = Parent("Giuseppe",54)

    val child1 = FirstChild("Ale",23)

    val child2 = SecondChild("Michi",18)

    println("PARENT: " + par.ciao())
    println("FIRST CHILD: " + child1.ciao())
    println("SECOND CHILD: " + child2.ciao())
}

