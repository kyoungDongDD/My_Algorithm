import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10162 {
  public static void main (String[]args) throws IOException {
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    int k=Integer.parseInt(bf.readLine());
    int []pushNum=new int [3];
    pushNum[0]=k/300;
    k=k%300;
    pushNum[1]=k/60;
    k=k%60;
    pushNum[2]=k/10;
    k=k%10;


    if(k!=0) System.out.println("-1");
    else System.out.println(pushNum[0]+" "+pushNum[1]+" "+pushNum[2]);
  }
}
