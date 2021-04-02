/**
 * @Classname First
 * @Description TODO
 * @Date 2021/1/6 11:16
 * @author 宋浩
 * @version 1.0
 */
object First {
    @JvmStatic
    fun main(args: Array<String>) {
        val myListOf = listOf("first", "second", "third")
        for ((index,element) in myListOf.withIndex()){
            println("${index+1},$element")
        }

    }
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }


}
internal interface Myse {
    fun intm() {
        println(1)
    }
}

