import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1312 {
  public static void main(String[]args) throws IOException {
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    String [] nums = bf.readLine().split(" ");
    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);
    int k = Integer.parseInt(nums[2]);
    int result = 0;
    for(int i=0;i<k+1;i++){
      result = a / b;
      a %= b;
      a = a*10;
    }
    System.out.println(result);
  }
}
