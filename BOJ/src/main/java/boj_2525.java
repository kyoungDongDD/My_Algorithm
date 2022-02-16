import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2525 {
  public static void main(String []args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String []nums=bf.readLine().split(" ");
    int num1 = Integer.parseInt(nums[0]);
    int num2 = Integer.parseInt(nums[1]);
    int num3 = Integer.parseInt(bf.readLine());
    num2=num2+num3;
    while(num2>=60){
      num2=num2-60;
      num1++;
      if(num1==24)num1=0;
    }
    System.out.println(num1+" "+num2);

  }
}
