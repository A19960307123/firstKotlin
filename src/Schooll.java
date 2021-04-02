import java.util.LinkedList;

/**
 * @author 宋浩
 * @version 1.0
 * @Classname Schooll
 * @Description TODO
 * @Date 2021/1/6 9:57
 */
public class Schooll {
    int num;
    String  name;

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addLast(1);
        if (max(2,1)>3){
            System.out.println("2");
        }else {
            System.out.println("1");
        }
    }
    public static int max(int a,int b){
        return a>b?a:b;
    }

    public Schooll() {
        num =0;
        name = "haha";
    }

    public Schooll(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    interface Myse{
        default public void intm(){
            System.out.println(1);
        };
    }
}
