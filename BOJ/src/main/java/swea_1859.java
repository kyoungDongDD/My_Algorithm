import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1859 {
  static String[]nums;
  static int maxPoint;
  static int max;
  static int pointer;
  static Long sum;
  public static void main(String [] args) throws IOException {
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    int k=Integer.parseInt(bf.readLine());
    for(int i=1;i<=k;i++){
      int p = Integer.parseInt(bf.readLine());
      nums= bf.readLine().split(" ");

      sum=0L;
      pointer=0;
      while(pointer!= nums.length) {
        find_max(pointer);
        addFromPointerToMaX();
        pointer = maxPoint + 1;
      }
      System.out.println("#"+i+" "+sum);
    }
  }

  private static void addFromPointerToMaX() {
    for(int i=pointer;i<maxPoint;i++)
      sum+=Integer.parseInt(nums[maxPoint])-Integer.parseInt(nums[i]);
  }

  private static void find_max(int startPoint){
    max=0;
    for(int i=startPoint;i< nums.length;i++){
      if(max<Integer.parseInt(nums[i])){
        max=Integer.parseInt(nums[i]);
        maxPoint=i;
      }
    }
  }
}
