import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10926 {
    public static void main(String []args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String name=bf.readLine();
        name+="??!";
        System.out.println(name);
    }
}
