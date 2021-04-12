import java.util.*
import kotlin.math.abs


operator fun Point.plus(other:Point):Point{
    return Point(x+other.x,y+other.y)
}
fun main(){
//    val listOf = listOf(1, 2, 3, 4, 5)
//    println(listOf.sortedDescending())
//    println("42".toInt());
    println(Point(10,20)+Point(20,30))


}
data class Point(val x:Int,val y:Int){
    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }

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