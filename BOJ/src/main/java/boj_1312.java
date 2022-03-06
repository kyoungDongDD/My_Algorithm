import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1312 {
  public static void main(String[]args) throws IOException {
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    String [] nums = bf.readLine().split(" ");
    float cal_num=Float.parseFloat(nums[0])/Float.parseFloat(nums[1]);
    int k= Integer.parseInt(nums[2]);
    System.out.println("1 = " + cal_num*Math.pow(10,k));
    System.out.println("2 = " + (int)(cal_num*Math.pow(10,k-1))*10);
    int result = (int) (cal_num*Math.pow(10,k) - (int)(cal_num*Math.pow(10,k-1))*10);
    System.out.println( result);
  }
}
