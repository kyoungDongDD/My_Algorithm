import static jdk.nashorn.internal.objects.Global.print;

public class test {
    public static void main(String[] args) {
      int n = 4;
      int[] arr = new int [n];
      for(int i=0;i<n;i++) arr[i]=i;
      boolean[] visited = new boolean[n];

      for (int i = 1; i <= n; i++) {
        System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
        comb(arr, visited, 0, n, i);
      }
    }



    // 재귀 사용
    // 사용 예시 : comb(arr, visited, 0, n, r)
    static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
      if (r == 0) {
        print(arr, visited, n);
        return;
      }

      if (depth == n) {
        return;
      }

      visited[depth] = true;
      comb(arr, visited, depth + 1, n, r - 1);

      visited[depth] = false;
      comb(arr, visited, depth + 1, n, r);
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited, int n) {
      for (int i = 0; i < n; i++) {
        if (visited[i]) {
          System.out.print(arr[i] + " ");
        }
      }
      System.out.println();
    }
  }

