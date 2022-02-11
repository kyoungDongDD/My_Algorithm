import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14652 {
  public static void main(String[]args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String[]num = bf.readLine().split(" ");
    int r1=Integer.parseInt(num[2])%Integer.parseInt(num[1]);
    int r2=Integer.parseInt(num[2])/Integer.parseInt(num[1]);

    System.out.println(r2 + " " + r1);


  }
}
