import java.util.ArrayList;

public class MaximumInAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(16);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
            // Time Complexity=O(n)
            // we can also write the cond'n as
            // max=Math.max(max,list.get(i));
        } 
        System.out.println("max element = " + max);     
    }
}
