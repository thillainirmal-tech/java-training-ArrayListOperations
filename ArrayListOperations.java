import java.util.ArrayList;
public class ArrayListOperations {
public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(5);
System.out.println("Original ArrayList: " + numbers);
numbers.add(6);
System.out.println("After adding 6: " + numbers);
numbers.add(2, 10);
System.out.println("After inserting 10 at index 2: " + numbers);
numbers.remove(3);
System.out.println("After removing element at index 3: " + numbers);
}
}
