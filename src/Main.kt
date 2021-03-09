import model.Person
import sort.QuickSort
import utils.printArray

/**
 * 主方法
 */
class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(20, 24, 9, 7, 14, 18, 90, 6, 3, 26)
            printArray(arr)
            QuickSort.sort(arr, 0, arr.size - 1)
            printArray(arr)
            Person("Lucy")
        }
    }

}