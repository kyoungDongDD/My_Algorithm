import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_4153 {
  public static void main(String []args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    while (true){
      String [] nums = bf.readLine().split(" ");
      if(nums[0].equals("0")&&nums[1].equals("0")&&nums[2].equals("0")) break;
      if(Integer.parseInt(nums[0])*Integer.parseInt(nums[0])+Integer.parseInt(nums[1])*Integer.parseInt(nums[1])==Integer.parseInt(nums[2])*Integer.parseInt(nums[2])||
        Integer.parseInt(nums[0])*Integer.parseInt(nums[0])+Integer.parseInt(nums[2])*Integer.parseInt(nums[2])==Integer.parseInt(nums[1])*Integer.parseInt(nums[1])||
        Integer.parseInt(nums[2])*Integer.parseInt(nums[2])+Integer.parseInt(nums[1])*Integer.parseInt(nums[1])==Integer.parseInt(nums[0])*Integer.parseInt(nums[0])
      ){
        System.out.println("right");
      }
      else System.out.println("wrong");
    }
  }
}
