import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
       
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

       
        System.out.println("Original List: " + stringList);

     
        Collections.reverse(stringList);
        System.out.println("Reversed List (Using Collections.reverse()): " + stringList);

      
        List<String> reversedList = new ArrayList<>();
        for (int i = stringList.size() - 1; i >= 0; i--) {
            reversedList.add(stringList.get(i));
        }
        System.out.println("Reversed List (Using Manual Loop): " + reversedList);
    }
}
