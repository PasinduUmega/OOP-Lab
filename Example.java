package Example;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Create the Scanner object the the read
		Scanner scanner = new Scanner(System.in);

// If the take the stack methods
		Stack<Integer>  stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
// Display the results		
		System.out.println("Popped element:" + stack.pop());
		System.out.println("Top elements After the pop:" + stack.peek());
		System.out.println("Is the stack empty:" + stack.empty());
		System.out.println();
		
// If the take the Deque methods
		Deque<String>  deque = new ArrayDeque<>();
		deque.addFirst("Start");
		deque.addFirst("Middel");
		deque.addFirst("End");
		
// Display the results
		System.out.println(deque.pollFirst());
		System.out.println(deque.peekLast());
		
// If the take the TreeSet Methods
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
// Display the results
		System.out.println();
		System.out.println(numbers.first());
		System.out.println(numbers.last());
		System.out.println();
				
// If the take the LinkedHashSet
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		
// Display the results
		System.out.println(hashSet);
		

	}

}
