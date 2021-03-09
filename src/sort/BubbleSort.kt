package sort

import utils.swap

/**
 * 冒泡排序算法
 */
object BubbleSort {

    fun sort(array: IntArray) {
        for (index in array.indices) {
            for (j in 0 until array.size - 1) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1)
                }
            }
        }
        println()
    }

}