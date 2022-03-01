import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj_11653 {
  public static void main (String []args) throws IOException {
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    List<Integer> nums = new ArrayList<>();
    int k= Integer.parseInt(bf.readLine());
    while(k!=1){
      int i=2;
      while (true){
        if(k%i==0){
          nums.add(i);
          k=k/i;
          break;
        }
        i++;
      }
    }
    for(int j=0;j<nums.size();j++)
      System.out.println(nums.get(j));
  }
}
