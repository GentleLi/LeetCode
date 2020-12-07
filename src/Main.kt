import utils.printArray

/**
 * 主方法
 */
class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val cbrt = Math.cbrt(0.1)
            println("cbrt : " + cbrt)
            val student = Student()
            student.say()

            // 大小为 5、值为 [0, 0, 0, 0, 0] 的整型数组
            val arr: IntArray = intArrayOf(32, 5, 8, 65, 98, 53, 4, 7, 6, 12, 9)

            printArray(arr)
            println("bubble sort operation ")
//            BubbleSort.sort(arr)
            QuickSort.sort(arr, 0, arr.size-1)
            printArray(arr)


        }
    }

}