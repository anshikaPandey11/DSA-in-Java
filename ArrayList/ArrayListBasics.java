import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
//ClassName objectName = new ClassName();
ArrayList<Integer> list= new ArrayList<>();
ArrayList<String> list2= new ArrayList<>();
ArrayList<Boolean> list3= new ArrayList<>();
// add element->O(1)
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(1,9); //O(n)

System.out.println(list);

//get operation-> O(1)
int element=list.get(2);
System.out.println(element);

//delete-> O(n);
list.remove(2);
System.out.println(list);

//set element at index-> O(n);
list.set(2,10);
System.out.println(list);

//contains elemeny-> O(n)
System.out.println(list.contains(1));
System.out.println(list.contains(11));

//Size of Al(method)
System.out.println(list.size());
   }
}
