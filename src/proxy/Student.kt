package proxy

/**
 *
 */
class Student : Human {

    override fun eat() {
        println("I like eating banana")
    }

    override fun say() {
        super.say()
        println("I am a student")
    }
}