// java collection framework
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		// add
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
		
		// remove
		arr.remove(1);
		System.out.println(arr);
		
		List<Integer>arr1= new ArrayList<>();
		arr1.add(101);
		arr1.add(102);
		arr1.add(103);
		arr1.add(104);
		arr1.add(105);
		System.out.println(arr1);
		
		// addAll
		arr.addAll(arr1);
		System.out.println(arr);
		
		// i want to traverse list using iterator
		Iterator<Integer> iterator = arr.iterator();
		while(iterator.hasNext()){
		    System.out.println("Element : "+ iterator.next());
		}
		Collections.sort(arr);
		System.out.println(arr);
	}
}
