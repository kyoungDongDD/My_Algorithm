import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1085 {

  public static void main(String []args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String [] nums= bf.readLine().split(" ");
    int k=Integer.parseInt(nums[0]);
    k=Math.min(k,Integer.parseInt(nums[2])-k);
    k=Math.min(k,Integer.parseInt(nums[1]));
    k=Math.min(k,Integer.parseInt(nums[3])-Integer.parseInt(nums[1]));
    System.out.println(k);

  }
}
