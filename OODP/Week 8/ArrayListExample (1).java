package week8;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> animals=new ArrayList<>();
		
		// adding elements into the list  add()
		animals.add("Lion");
		animals.add("Giraffe");
		animals.add("Tiger");
		animals.add("Monkey");
		animals.add("Dog");
		animals.add("Donkey");
		animals.add("Tiger");
		animals.add("Kangaroo");
		System.out.println(animals);
		
		// accessing the arraylist elements get()
		System.out.print("animal at index 7 is: ");
		System.out.println(animals.get(7));
		
		//updating the element set()
		animals.set(7,"Cat");
		System.out.println(" The arraylist after updates: "+animals);
		
		// removing the elements
		animals.remove(0);
		System.out.println(animals);
		
		//clearing the arraylist
		//animals.clear();
		//System.out.println(animals);
		
		// size() of arryalist
		System.out.println("number of elements in arraylist are "+animals.size());
		
		// looping through the arrayList
		for(int i=0;i<animals.size();i++){
			System.out.println(animals.get(i));
		}
		
		//iterator
		
		Iterator <String> it=animals.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
		// to check if the list is empty
		System.out.println(animals.isEmpty());
		
		//checking for some particular element
		System.out.println(animals.contains("Dog"));
		System.out.println(animals.contains("Kangaroo"));
		
		// indexOf()
		//animals.add("Dog");
		
		System.out.println("The index of dog is: "+animals.indexOf("Dog"));
		System.out.println("The last index of dog is: "+animals.lastIndexOf("Dog"));
		
		System.out.println(animals.indexOf("Cheetah"));
		
		
		
		

	}

}
