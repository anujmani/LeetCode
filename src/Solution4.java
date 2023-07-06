import java.util.HashSet;
import java.util.Set;

//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//
public class Solution4 {
    public static void main(String[] args) {
        int n=5;
        Solution4 solution4= new Solution4();
        int ways=solution4.noWays(n);
        System.out.println(ways);

    }
    public int noWays(int n) {
        if (n == 1) {
            return n;
        } else if (n == 2) {
            return n;

        } else {

            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 2;


            for (int i = 2; i <= n - 1; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

            return arr[n - 1];
        }
    }

}
