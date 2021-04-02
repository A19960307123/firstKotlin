import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author 宋浩
 * @version 1.0
 * @Classname MyData
 * @Description TODO
 * @Date 2021/1/20 17:42
 */
public class MyData {
    public static void main(String[] args) {
        int num = 20;//数据结果个数
        double average= 1.05;//平均结果
        double maxData = 1.37;//最高结果
        getData(num, average, maxData);
    }

    private static void getData(int num, double average, double maxData) {
        double[] result = new double[num];
        Random random = new Random();
        double randx;
        for (int i = 0; i < num; i++) {
            randx = (100-random.nextInt(200))/100.0;
            result[i] = randx*(maxData - average)+ average;
//            System.out.println(result[i]);
        }
        result[random.nextInt(num)-1]= maxData;
        DecimalFormat df = new DecimalFormat("#0.000");
        try {
            File file = new File("C:\\Users\\mada\\Desktop\\result.txt");
            boolean newFile = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (double v : result) {
                bufferedWriter.write(df.format(v)+"\r\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
