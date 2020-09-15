/**
 * a sort method
 */
object QuickSort {


    fun printArray(array: IntArray) {
        for (it in array.indices) {
            print("${array[it]}  ")
        }
        println()
    }

    //test swap
    fun swap(array: IntArray) {
        println("swap the first number with the last number of the Int array")
        var temp = array[0]
        array[0] = array[array.size - 1]
        array[array.size - 1] = temp
    }

    //test swap
    fun swap(array: IntArray, start: Int, end: Int) {
        var temp = array[start]
        array[start] = array[end]
        array[end] = temp
    }

    fun sort(array: IntArray, left: Int, right: Int) {
        if (left >= right) {
            return
        }
        var pivot = array[left]
        var start: Int = left
        var end = right

        while (start < end) {//此处循环为一轮排序
            //从右向左比较
            while (start < end && array[end] > pivot) {
                end--
            }
            //从左向右比较
            while (start < end && array[start] < pivot) {
                start++
            }
            //注：当start==end后还会比较一次 这次交换可以将 pivot 值放在正确的位置上
            if (start < end) {
                var temp = array[start]
                array[start] = array[end]
                array[end] = temp
            }
        }

//        println("start = $start, end = $end")
        //分治思想，递归对左右的区间进行排序
        sort(array, left, end - 1)
        sort(array, end + 1, right)

    }


}