package utils

fun printArray(array: IntArray) {
    for (it in array.indices) {
        print("${array[it]}  ")
    }
    println()
}

//test swap
fun swap(array: IntArray, start: Int, end: Int) {
    var temp = array[start]
    array[start] = array[end]
    array[end] = temp
}

