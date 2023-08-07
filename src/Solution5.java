import java.util.ArrayList;
import java.util.HashMap;

public class Solution5 {
    public static void main(String[] args) {
        int[] arr= {2,2,1,1,1,2,2};
        Solution5 solution5= new Solution5();
        System.out.println(solution5.majorityElements(arr));

    }
    public int majorityElements(int[]arr){
        int no=arr.length/2;
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for(int a:arr){
            if(hashMap.containsKey(a)){
                hashMap.put(a,hashMap.get(a)+1);
            }
            else{
                hashMap.put(a,1);
            }
        }
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.addAll(hashMap.keySet());
        int finalize=0;
        for(int checkelement:arrayList){
            int lastelement=hashMap.get(checkelement);
            if(lastelement>no){
                finalize=checkelement;
            }
        }
        return finalize;
    }
}
