import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj_9020 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    // ArrayList로 구현
    int k = Integer.parseInt(bf.readLine());
    int[] num1 = new int[k];
    int[] num2 = new int[k];
    int[] nums = new int[k];
    int max = 0;
    for (int z = 0; z < k; z++) {
      nums[z] = Integer.parseInt(bf.readLine());
      max = Math.max(nums[z], max);
    }
    ArrayList<Boolean> primeList;

    // 사용자로부터의 콘솔 입력

    // n <= 1 일 때 종료
    if (max <= 1) return;
    //에라토스 테네스 체 만들기
    // n+1만큼 할당
    primeList = new ArrayList<Boolean>(max + 1);
    // 0번째와 1번째를 소수 아님으로 처리
    primeList.add(false);
    primeList.add(false);
    // 2~ n 까지 소수로 설정
    for (int i = 2; i <= max; i++)
      primeList.add(i, true);

    // 2 부터  ~ i*i <= n
    // 각각의 배수들을 지워간다.
    for (int i = 2; (i * i) <= max; i++) {
      if (primeList.get(i)) {
        for (int j = i * i; j <= max; j += i) primeList.set(j, false);
        //i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
      }
    }
    //에라토스 종료

    
    for (int z = 0; z < k; z++) {
//max 변경하기
      loop:
      for (int i = nums[z]/2; i >= 0; i--) {
        if (primeList.get(i) == true) {
          for (int j = nums[z]/2; j < nums[z]; j++) {
            if (primeList.get(j) == true) {

              if (nums[z] == i + j) {
                num1[z] = i;
                num2[z] = j;
                break loop;
              }
            }
          }
        }
      }
      //2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
      System.out.println(num1[z] + " " + num2[z]);
    }
  }
}

