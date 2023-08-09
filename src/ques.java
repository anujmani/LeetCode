import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ques {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        LinkedList<Integer> linkedList2= new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);
        Solutions solutions= new Solutions();
        solutions.merge(linkedList2,linkedList);
    }
}
class Solutions {
//    public boolean rotateString(String s, String goal) {
//        if(s==goal){
//            return true;
//        }
//        else{
//            char[]arr=new char[s.length()];
//
//        }
//
//
//    }

    public LinkedList merge(LinkedList<Integer> linkedList2, LinkedList<Integer> linkedList) {
        linkedList.addAll(linkedList2);
        System.out.println(linkedList);

        System.out.println(linkedList.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList()));
        return linkedList;

    }
}
