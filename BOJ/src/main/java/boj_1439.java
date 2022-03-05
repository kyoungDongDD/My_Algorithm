import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1439 {
  public static void main (String[]args) throws IOException {
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    char[] nums= bf.readLine().toCharArray();
    int count0=0;
    int count1=0;

    for(int i=0;i<nums.length;i++){
      if(nums[i]=='0'){
        if(i==0||nums[i-1]!='0') count0++;
      }

      else if(nums[i]=='1'){
        if(i==0||nums[i-1]!='1') count1++;
      }
    }

    System.out.println(Math.min(count0,count1));
  }


}
