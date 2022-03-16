import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj_4948 {

  public static void main(String[] args) throws IOException {
    // ArrayList로 구현
    ArrayList<Boolean> primeList;

    // 사용자로부터의 콘솔 입력

    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));


    while (true) {
      int p = Integer.parseInt(bf.readLine());
      int n = 2*p;
      if(n==0) break;

      // n <= 1 일 때 종료
      if (p == 1) {
        System.out.println("1");
        continue;
      }


      // n+1만큼 할당
      primeList = new ArrayList<Boolean>(n + 1);
      // 0번째와 1번째를 소수 아님으로 처리
      primeList.add(false);
      primeList.add(false);
      // 2~ n 까지 소수로 설정
      for (int i = 2; i <= n; i++)
        primeList.add(i, true);

      // 2 부터  ~ i*i <= n
      // 각각의 배수들을 지워간다.
      for (int i = 2; (i * i) <=n; i++) {
        if (primeList.get(i)) {
          for (int j = i * i; j <= n; j += i)
            primeList.set(j, false);
          //i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
        }
      }
      int count = 0;

      for (int i = p+1; i < n; i++) {
        if (primeList.get(i) == true) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
