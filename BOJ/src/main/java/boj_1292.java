import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1292 {
  public static void main(String []args) throws IOException {
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int a=Integer.parseInt(st.nextToken());
    int b=Integer.parseInt(st.nextToken());
    int k=1;
    int num=1;
    int []nums= new int[b+1];

    Loop1:
    for(int i=1;i<=b;i++){
      for (int j=1; j<=num;j++){
        if(k>b) break Loop1;
        nums[k]=num;
        k++;
      }
      num++;
    }

    int result=0;

    for(int i=a;i<=b;i++){
      result+=nums[i];
    }

    System.out.println(result);
  }
}

