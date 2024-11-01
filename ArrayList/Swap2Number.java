import java.util.ArrayList;
public class Swap2Number {
public static void swap(ArrayList<Integer> list,int idx1,int idx2){
   int temp =list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
}
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(4);
    list.add(6);
    list.add(3);
    list.add(16);

    int idx1 = 1,idx2 = 3;
    swap(list,idx1,idx2);
    System.out.println(list);
    }
}
