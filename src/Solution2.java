//this is to find the palindrome number
public class Solution2 {
    public static void main(String[] args) {
        int x=-121;
        int v=x;
        int c=0;
        while(v!=0) {

            int b = v % 10;
            v = v / 10;
            c = c*10+b ;
        }
        if(c==x){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
