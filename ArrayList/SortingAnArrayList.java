import  java.util.ArrayList;
import java.util.Collections;
 public  class SortingAnArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(9);
        System.out.println(list);
        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        }
 }