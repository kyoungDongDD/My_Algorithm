import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {

    public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(bf.readLine());
      int count=1;

      for(int i=1;i<n/2 +1 ;i++){
        int sum=i;
        int j=i+1;
        while(true){
          sum+=j;
          if(sum==n){
            count++;
            break;
          }
          if(sum>n) break;
          j++;
        }
        }
      System.out.println(count);
      }

    }


