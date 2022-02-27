import java.io.*;
import java.util.*;

public class boj_20149 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    Point p1 = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())), p2 = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    st = new StringTokenizer(br.readLine(), " ");
    Point p3 = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())), p4 = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

    System.out.println(solve(p1, p2, p3, p4));
    br.close();
  }

  private static String solve(Point p1, Point p2, Point p3, Point p4) {
    StringBuilder sb = new StringBuilder();

    int S1, S2, S3, S4, S12, S34;
    S1 = CCW(p1, p2, p3); S2 = CCW(p1, p2, p4); S3 = CCW(p3, p4, p1); S4 = CCW(p3, p4, p2);
    S12 = S1 * S2; S34 = S3 * S4;

    if (S12 <= 0 && S34 < 0 || S12 < 0 && S34 <= 0) {
      sb.append(1).append('\n');
      String T1 = getSlope(p1, p2), T2 = getSlope(p3, p4);
      double x, y;
      if (T1.equals("INF")) {
        x = p1.x;
        double sl2 = Double.parseDouble(T2);
        y = sl2 * (x - p3.x) + p3.y;
      } else if (T2.equals("INF")) {
        x = p3.x;
        double sl1 = Double.parseDouble(T1);
        y = sl1 * (x - p1.x) + p1.y;
      } else {
        double sl1 = Double.parseDouble(T1), sl2 = Double.parseDouble(T2);
        x = (sl1 * p1.x - sl2 * p3.x + p3.y - p1.y) / (sl1 - sl2);
        y = sl1 * (x - p1.x) + p1.y;
      }
      sb.append(x).append(' ').append(y);
    } else if (S12 == 0 && S34 == 0) {
      if (S1 == 0 && S2 == 0 && S3 == 0 && S4 == 0) {
        int n = isCrossed(p1, p2, p3, p4);
        if (n > 0) sb.append(1);
        else sb.append(0);

        if (n == 2) {
          sb.append('\n');
          if (p1.x == p3.x && p1.y == p3.y || p1.x == p4.x && p1.y == p4.y) sb.append(p1.x).append(' ').append(p1.y);
          else if (p2.x == p3.x && p2.y == p3.y || p2.x == p4.x && p2.y == p4.y) sb.append(p2.x).append(' ').append(p2.y);
        }
      }
      else {
        sb.append(1).append('\n');
        if (p1.x == p3.x && p1.y == p3.y || p1.x == p4.x && p1.y == p4.y) sb.append(p1.x).append(' ').append(p1.y);
        else if (p2.x == p3.x && p2.y == p3.y || p2.x == p4.x && p2.y == p4.y) sb.append(p2.x).append(' ').append(p2.y);
      }
    } else sb.append(0);

    return sb.toString();
  }

  private static String getSlope(Point p1, Point p2) {
    if (p1.x == p2.x) return "INF";
    double s = ((double) p2.y - p1.y) / (p2.x - p1.x);
    return String.valueOf(s);
  }

  private static int isCrossed(Point p1, Point p2, Point p3, Point p4) {
    int A, B, C, D;
    if (p1.x == p2.x) {
      A = Min(p1.y, p2.y); B = Max(p1.y, p2.y);
      C = Min(p3.y, p4.y); D = Max(p3.y, p4.y);
    } else {
      A = Min(p1.x, p2.x); B = Max(p1.x, p2.x);
      C = Min(p3.x, p4.x); D = Max(p3.x, p4.x);
    }

    if (A == D || B == C) return 2;
    else if (A < D && C < B) return 1;
    else return 0;
  }

  private static int CCW(Point p1, Point p2, Point p3) {
    long S = (long) p1.x * p2.y + (long) p2.x * p3.y + (long) p3.x * p1.y;
    S -= (long) p1.y * p2.x + (long) p2.y * p3.x + (long) p3.y * p1.x;
    if (S == 0) return 0;
    return S > 0 ? 1 : -1;
  }

  private static int Max(int a, int b) {
    return a <= b ? b : a;
  }

  private static int Min(int a, int b) {
    return a <= b ? a : b;
  }

  private static class Point {
    int x, y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}