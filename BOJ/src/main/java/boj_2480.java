import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2480 {

  public static void main(String []args) throws IOException {
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    String [] nums = bf.readLine().split(" ");
    int k=0;
    if(nums[0].equals(nums[1])){
      if(nums[0].equals(nums[2])){
        k=10000;
        System.out.println(k+1000*Integer.parseInt(nums[0]));
        return;
      }
      else {
        k=1000;
        System.out.println(k+100*Integer.parseInt(nums[0]));
        return;
      }
    }
    else if(nums[0].equals(nums[2])){
      k=1000;
      System.out.println(k+100*Integer.parseInt(nums[0]));
      return;
    }
    else if(nums[1].equals(nums[2])){
      k=1000;
      System.out.println(k+100*Integer.parseInt(nums[1]));
      return;
    }
    else {
      k=Math.max(Integer.parseInt(nums[0]),Integer.parseInt(nums[1]));
      k=Math.max(k,Integer.parseInt(nums[2]));
      System.out.println(100*k);
      return;
    }
  }
}
