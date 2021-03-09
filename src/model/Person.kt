package model

class Person(name: String) {

    val nickname = "People call me $name".also(::println)

    init {
        println("first init block")
    }

    val age = 18.also(::println)

    init {
        println("second init block")
    }
}