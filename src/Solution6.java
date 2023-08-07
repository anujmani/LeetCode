import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution6 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int n = 1;
        System.out.println(solution.isHappy(n));
    }
}

class Solution1 {
    public boolean isHappy(int n) {
        int count = 0;
        boolean see=false;
        if(n==1){
            see=true;
        }
        while (n != 1) {
            if (count < 114) {
                count++;
                ArrayList<Integer> arr = new ArrayList();
                int a = n;
                int sum = 0;
                while (a != 0) {
                    int b = a % 10;
                    a = a / 10;

                    arr.add(b);
                }
                for (int c : arr) {
                    sum += Math.pow(c, 2);

                }
                n = sum;
                if (n == 1) {
                    see= true;
                } else {
                    see= false;
                }

            }
            else{
                see=false;
                break;
            }

        }
        return see;


    }
}
