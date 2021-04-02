import java.util.*
import kotlin.math.abs



fun main(){
    val listOf = listOf(1, 2, 3, 4, 5)
    println(listOf.sortedDescending())
}
class School(num:Int ,name:String) {
    var address:String = "haha"
        set(value:String) {
            println("1")
            field = value;
        }

    fun main(args: Array<String>) {
//        if (max(2, 1) > 3) {
//            println(abs(2))
//        } else {
//            println("1")
//        }

    }

    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

}