package Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Queue;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 //  Exceptions 
		try {
			int[] myNumber = {1,2,3};
			System.out.println("myNumber[10]");
		}catch (Exception e) {
			System.out.println("Somthins went wrong!");
		}finally {
			System.out.println("The 'try catch' is finished.");
		}
	    System.out.println();
	    
  // Warpper Object to initialized the code block		
		Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	    System.out.println();
	    
// Regular Expression
	    Pattern pattern = Pattern.compile("Jon");
	   Matcher matcher = pattern.matcher("Maxwell");
	   boolean matchFound = matcher.find();
	   if(matchFound) {
		   System.out.println("Match Found");
	   }else {
		   System.out.println("Not Match Found");
	   }
	   System.out.println();
		
// Create the Scanner Object to the read
		Scanner scanner = new Scanner(System.in);
		
// Create the ArrayList store the data type and adda the data
		ArrayList<String > items = new ArrayList<>();
		items.add("Apple");
		items.add("Banana");
		items.add("Orange");
		items.add("Cheary");
		System.out.println("Invaild ArrayList:" + items);
		
// 1st step Remove the banna at the ArrayList 
		items.remove("Banana");  
		System.out.println("\nAfter the removing 'banana':" + items);
 
// 2nd step Remove the banana index for the ArrayList
		items.remove(1);
		System.out.println("\nAfter the removing at the banana index'1':" + items);
		
// 3rd step clone of the ArrayList
		ArrayList<String> clonedList = (ArrayList<String>) items.clone();
	    System.out.println("Cloned ArrayList:" + clonedList);
	    System.out.println();
	    
// 4st step by the clear the ArrayList
	    items.clear();
	    System.out.println("ArrayList after Cleaning:" + items);
	    System.out.println();
	    
// 5st step by the get the size of the ArrayList
	    System.out.println("Size of the Original ArrayList After Clearning:" + items.size());
	    System.out.println("Size of the Cloned ArrayList After Clearning:" + clonedList.size());
	    System.out.println();
	    
// 6st step by the add the new value of the ArrayList
	    items.add("grapse");
	    System.out.println("Original ArrayList After adding new element:" + items);
	    System.out.println("Original ArrayList remains unchange:" + clonedList);
	    System.out.println();
	    
// 7st step by the Collections of the ArrayList for the sort path
	   Collections.sort(items);
	   System.out.println("After the sorting:" + items);
	   System.out.println();
	    
// 8st step by the get the value of the ArrayList
	   items.get(0);
	   System.out.println("After the adding the ArrayList"+ items);
	   System.out.println();
	   
// 9st step by the set the value of the ArrayList
	  HashSet<String> fruits = new HashSet<>();
	  
// Adding the elements for the methods
	  boolean isAdded1 = fruits.add("Apple");
	  boolean isAdded2 = fruits.add("Banana");
	  boolean isAdded3 = fruits.add("Apple");
	
// print the results adding the elements
	  System.out.println("Was Apple added:" + isAdded1); 
	  System.out.println("Was Banana added:" + isAdded2); 
	  System.out.println("Was Apple added again:" + isAdded3); 
	  
// print the element of the display
	  System.out.println("Fruits Set:" + fruits);
	  System.out.println();
	  
// cheak whether of the empty
	  System.out.println("Is the fruits:" + fruits.isEmpty());
	  System.out.println();
	  
// if the cheak whether for Contains
	  System.out.println("contains :" + fruits.contains("Apple"));
	  System.out.println("contains :" + fruits.contains("Mango"));
	  System.out.println();
	  
	  
// if the queue of the step of the value
	  Queue<String> queue = new LinkedList<>();
	  queue.add("Apple");
	  queue.add("Banana");
	  queue.add("Mango");
	  
// Display the Results
	  System.out.println(queue.poll());
	  System.out.println(queue.peek());
	  System.out.println();
	  
// If you take the Integer number Intialized value of the System
	  Queue<Integer> value = new LinkedList<>();
	  value.add(10);
	  value.add(20);
	  
// Display the results
	  System.out.println(queue);
	  System.out.println();
	  
// If the take this offer 
	  Queue<Integer> data = new ArrayBlockingQueue<>(2);
	  data.offer(10);
	  data.offer(20);
	  data.offer(30);
	  
// Display the Results
	  System.out.println(queue);
	  System.out.println();
	  
// If you take the List Interface
	  ArrayList<String> names = new ArrayList<>();
	  names.add("jon");
	  names.add("Maxwell");
	  names.add("jon");
	  names.add(1,"Smith");
	  System.out.println();
	  
// Display the results
	  System.out.println(names);
	  names.get(0);
	  System.out.println(names.get(0));
	  names.set(1, "Bhanuka");
	  System.out.println(names.set(1, "Bhanuka"));
	  names.remove(0);
	  System.out.println(names.remove(0));
	  names.contains(names);
	  System.out.println(names.contains(names));
	  names.size();
	  System.out.println(names.size());
	  System.out.println();
	  
// Get the Iterator 
	  Iterator <String > it = names.iterator();
	  while(it.hasNext()) {
		  String i = it.next();
		
		}
	    it.remove();
	  System.out.println(names);
	  
	  }
	
	}


