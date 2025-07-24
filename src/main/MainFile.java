package main;

import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		BirdSound bs = new BirdSound();
		
		Sparrow p = new Sparrow(); // polymorphism hw
		p.sing(1);				  // polymorphism hw

		System.out.println(" ");
		
		// ----------------------------------------------------------
//		
//// method overloading hw
		
		
		MyClass c = new MyClass();
		int result2 = c.addNum(4, 5);  // method overloading hw
		System.out.println(result2);
		
		MyClass d = new MyClass();		// method overloading hw
		double result3 = d.addNum(2.3,3.4,4.5);
		System.out.println(result3);		
	
		MyClass m = new MyClass();		// method overloading hw
		m.addNum();
	

		
		System.out.println("Please enter source: ");	// method overloading hw
		String source = "Hyderabad";
		System.out.println("Please enter destination: ");	// method overloading hw
		String destination = "Punjab";
		
		BookTicket bt =  new BookTicket(source, destination);	// method overloading hw
		
		
		bt.displayInfo(); // Inheritance acquired here ? or only when extends word is used?
		bt.confirmBooking(); // Inheritance acquired here
		
		System.out.println(" ");
		// ----------------------------------------------------------
		// method overriding hw
		
		
		Trixy x = new Trixy();
		x.dog();
		System.out.println(x.getAvgSize());
		
		System.out.println(" ");
		// ----------------------------------------------------------
	
		// Ascending Descending order of user entered input.
//
//		AscDsc asds = new AscDsc();
//		
//		 int digitCount;
//		 
//		 System.out.print("Enter an integer: ");
//		 
//		 int number = 20	;
//		 digitCount =0;
//		 int tempNum = number;
////		 number = tempNum; 
//		 if(tempNum ==0 || tempNum<=9) {
//			 System.out.println("It's a single number. It's neither ascending or descending!");
//		 }
//		 
//		 if (tempNum == 0) {
//			 digitCount =1;
//		 } else { 
//			 int n= tempNum;
//			 while (n > 0) {
//				 n/=10;
//				 digitCount ++;	
//			 }
//		 }
//		 if (digitCount == 0) { // Should not happen for positive numbers unless input was 0
//	            System.out.println("No digits to check.");
//	            return;
//	        }
//
//		 int[] digit = new int[digitCount];
//		 for (int i=0; i< digitCount; i++) {
//			 digit[i] = tempNum % 10;
//			 tempNum /= 10;
//		 }
//		 System.out.println("Extracted digits: ");
//		 asds.printArray(digit);
//		 
//		 boolean isAscendingOrder = asds.isAscending(digit);
//		 boolean isDescendingOrder = asds.isDescending(digit);
//		 
//		 System.out.println("\nThe number " + number + " (digits: )");
//	        if (isAscendingOrder && isDescendingOrder) {
//	            System.out.println("Its digits are in both ascending and descending order (e.g., all digits are same).");
//	        } else if (isAscendingOrder) {
//	            System.out.println("Its digits are in ascending order.");
//	        } else if (isDescendingOrder) {
//	            System.out.println("Its digits are in descending order.");
//	        } else {
//	            System.out.println("Its digits are in neither ascending nor descending order.");
//	        }

//	        System.out.println(" ");
//	
		// ----------------------------------------------------------
		// need to work on adding elemet to node

//		
//		Shivani_Java_Class sjc = new Shivani_Java_Class(5);
//		
//		System.out.println("Enter a number: ");
//		sjc.addingFirst(2, sc.nextInt());
//		
//		sjc.printArray();
//		
//		
	        System.out.println(" ");
	        
	     // ----------------------------------------------------------
			// Implementing Dynamic Array HW
	        
//	        ArrayImplentation ai = new ArrayImplentation();
//	        
//	        ai.add(10);
//	        ai.add(20);
//	        ai.add(30);
//	        ai.add(40);
//	        ai.add(50);
//	        
//	        System.out.println("The list after adding numbers: ");
//	        ai.printList();
//	        
//	        System.out.println("The value at index 2 is "+ ai.get(2));
//	        
//	        
//	        System.out.println(" ");
	     // ----------------------------------------------------------
			// Dynamic single linked list example.
	        
	        SinglyLinkedList sll = new SinglyLinkedList();
			
			sll.printList();
			System.out.println("The size of list is " + sll.size());
			
			sll.add("Apple");
			sll.add("Banana");
			sll.add("Apple34");
			
			sll.printList();
			System.out.println("The data at the 0 index of list is " + sll.get(0));
			System.out.println("Is the list empty? " + sll.isEmpty());
			
			System.out.println(" ");
			
		     // ----------------------------------------------------------
				// Dynamic doubly linked list example.
		        
			DoublyLinkedList myList = new DoublyLinkedList();

            System.out.println("List initially:");
            myList.displayForward();
            System.out.println("Is empty? " + myList.isEmpty());
            System.out.println("Size: " + myList.getSize());
            System.out.println("---");

            System.out.println("Adding 10 to front.");
            myList.addFirst(10);
            myList.displayForward();
            myList.displayBackward();
            System.out.println("Size: " + myList.getSize());
            System.out.println("---");

            System.out.println("Adding 20 to end.");
            myList.addLast(20);
            myList.displayForward();
            myList.displayBackward();
            System.out.println("Size: " + myList.getSize());
            System.out.println("---");

            System.out.println("Adding 5 to front.");
            myList.addFirst(5);
            myList.displayForward();
            myList.displayBackward();
            System.out.println("Size: " + myList.getSize());
            System.out.println("---");

            System.out.println("Removing first element.");
            int removed1 = myList.removeFirst();
            System.out.println("Removed: " + removed1);
            myList.displayForward();
            myList.displayBackward();
            System.out.println("Size: " + myList.getSize());
            System.out.println("---");

            System.out.println("Removing last element.");
            int removed2 = myList.removeLast();
            System.out.println("Removed: " + removed2);
            myList.displayForward();
            myList.displayBackward();
            System.out.println("Size: " + myList.getSize());
            System.out.println("---");

            System.out.println("Removing last element again (should be 10).");
            int removed3 = myList.removeLast();
            System.out.println("Removed: " + removed3);
            myList.displayForward();
            myList.displayBackward();
            System.out.println("Size: " + myList.getSize());
            System.out.println("---");

            System.out.println("Trying to remove from empty list.");
            myList.removeFirst();
            System.out.println("---");
        
				System.out.println(" ");
				
				System.out.println(" ");
				
	  // ----------------------------------------------------------
		// Reverse list example.
				
				ReverseList rl = new ReverseList();
				
//				System.out.println("Enter a number: ");
				
				int number = 1264;
				int tempNum = number;
				int digiCount =0;
				
				
				if (tempNum == 0) {
					digiCount =1;
				} else {
					int n = tempNum;
					while (n > 0) {
						n /= 10;
						digiCount++;
					}
				}
				int[] digit = new int[digiCount];
				for (int i=0; i< digiCount; i++) {
					digit[i] = tempNum % 10;
					tempNum /= 10;
				}
				rl.printArr(digit);
				
			
		// ----------------------------------------------------------
		// Finding duplicates in HashMap example.

		HashMap<Integer, Integer> fruits = new HashMap<>();

		int[] array = { 1, 2, 3, 2, 4, 5, 3 };

		for (int i = 0; i < array.length; i++) {

			int n = array[i];

			if (fruits.containsKey(n)) {
				int prev = fruits.get(n);
				fruits.put(n, prev + 1);

			} else {
				fruits.put(n, 1);
			}

		}
		for (int Basket : fruits.keySet()) {
			System.out.println(Basket + " -> " + fruits.get(Basket));

		}
		
		System.out.println(" ");
		// ----------------------------------------------------------
				// stringBuilder practice
		
		StringBuilder sb = new StringBuilder("Hello"); //use sb when fast performance is important
		 
		sb.append(" World!");	//word insertion at last
		System.out.println(sb);
		
		sb.insert(5, 's');	//character insertion at specific index
		System.out.println(sb);
		
		sb.delete(5, 6);	//character insertion at specific index
		System.out.println(sb);
		
		sb.insert(5, " Beautiful");	//character insertion at specific index
		System.out.println(sb);
		
		System.out.println("Character at index is " + sb.charAt(3));
		
		System.out.println(" ");
		StringBuffer sbf = new StringBuffer("Shivani"); //use sbf when thread safety is important
		
		sbf.append(" Ramidi");
		sbf.insert(7, " Reddy");
		System.out.println(sbf);
		
		
		System.out.println(" ");
		//file handling hw: byte Stream ->8bits storage data -> audio,video,txt to store -> Input & Output Stream
						//	character stream -> character data -> unicode convention to store -> Reader & Writer
		
		File f = new File("demo.txt");		//
		
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Demo content");
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);

		System.out.println(" ");
		
		
		
		// ----------------------------------------------------------
//		Implementing Dynamic HashMap without built in functions
		
		
		ShivaniHashMap myMap = new ShivaniHashMap();

		System.out.println(myMap.capacity);
		System.out.println(" ");
		myMap.put("Mother", 1);
		myMap.put("Wife", 2);
		myMap.put("Daughter", 3);
		myMap.put("Friend", 4);
		myMap.put("Sister", 5);
//		myMap.put("Sister", 3); // overridden the sister value

		myMap.printMap();
		
		System.out.println();
		System.out.println("The value for Sister is " + myMap.get("Sister"));
		
		System.out.println();myMap.remove("Friend");
		myMap.printMap();
		
		System.out.println(" ");
		
		// ----------------------------------------------------------	
	// word count using HashMap:
		
		HashMap <String, Integer> word = new HashMap<>();
		
		String[] fruitList = {"apple", "grapes", "apple", "papaya", "papaya", "papaya"};
		
		for (int i=0; i< fruitList.length; i++) {
			String  n = fruitList[i];
			
			if (word.containsKey(n)) {
				int prev = word.get(n);
				word.put(n, prev+1);
				
			}else {
				word.put(n, 1);
			}
		}
		
		for (String wordCount: word.keySet()) {
			System.out.println(wordCount + " -> " + word.get(wordCount));
		}
		
		System.out.println(" ");
		
		// ----------------------------------------------------------	
	// 2sum using HashMap:
		
		
		Solution sum = new Solution();
		int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = sum.twoSum(nums1, target1);
        System.out.println("Nums: [2, 7, 11, 15], Target: 9 -> Result: [" + result1[0] + ", " + result1[1] + "]");

        System.out.println(" ");
        
        
     // ----------------------------------------------------------	
    	// MajorityElement example:
    		
        MajorityElement sol = new MajorityElement();

        
        int[] nums = {3, 2, 3};
        System.out.println("Nums: [3, 2, 3] -> Majority Element: " + sol.majorityElement(nums));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Nums: [2, 2, 1, 1, 1, 2, 2] -> Majority Element: " + sol.majorityElement(nums2));
        
        int[] nums3 = {6, 5, 5};
        System.out.println("Nums: [6, 5, 5] -> Majority Element: " + sol.majorityElement(nums3));
    
        
        System.out.println(" ");
        
        
        // ----------------------------------------------------------	
       	// 
    }
}
