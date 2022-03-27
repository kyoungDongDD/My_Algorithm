import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2566 {
  public static void main(String[] args) throws IOException {
    int max=0;
    int x=0;
    int y=0;
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    String [][] nums= new String[9][9];
    for(int i=0;i<9;i++){
      nums[i]=bf.readLine().split(" ");
    }
    for(int i=0;i<9;i++) {
      for(int j=0;j<9;j++){
        if(Integer.parseInt(nums[i][j])>max){
          max=Integer.parseInt(nums[i][j]);
          x=j;
          y=i;
        }
      }
    }
    System.out.println(+max);
    System.out.println((y+1)+" "+(x+1));

  }
}
