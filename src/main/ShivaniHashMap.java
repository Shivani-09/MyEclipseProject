package main;

class map<role, priority> {
	role key;
	priority value;
	map<role, priority> next;

	public map(role key, priority value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
}

public class ShivaniHashMap<role, priority> {

	private map<role, priority>[] table;

	int capacity;

	private int size;

	private static int defaultCapacity = 16;

	public ShivaniHashMap() {
		this(defaultCapacity);
	}

	public ShivaniHashMap(int capacity) {

		if (capacity <= 0) {
			capacity = defaultCapacity;
		} else {
			this.capacity = capacity;
		}

		this.table = (map<role, priority>[]) new map[this.capacity];

		this.size = 0;

		System.out.println("ShivaniHashmap created with capacity: " + capacity);
		System.out.println(" ");
	}

	private int play(role key) {
		if (key == null) {
			System.out.println("In basic hashmaps null keys are not supported!");
		}
		return Math.abs(key.hashCode()) % capacity;
	}

	public void put(role key, priority value) {

		int index = play(key);

		map<role, priority> current = table[index];
		while (current != null) {
			if (current.key.equals(key)) {
				current.value = value;
				System.out.println("Updated key " + key + "with new value" + value);
				return;
			}
			current = current.next;
		}

		map<role, priority> newMap = new map<>(key, value);
		newMap.next = table[index];
		table[index] = newMap;
		size++;
		System.out.println("Key " + key + " is updated with " + value + " value " + "at index " + index);
	}

	public int size() {
		return size;
	}

	public priority get(role key) {

		int index = play(key);

		map<role, priority> current = table[index];
		while (current != null) {
			if (current.key.equals(key)) {
				return current.value;
			}
			current = current.next;
		}

		return null;
	}
	
	public priority remove(role key) {
		
		int index = play(key);
		
		map<role, priority> current = table[index];
		map<role, priority> previous = null;
		while(current != null) {
			if (current.key.equals(key)) {
				
				if (previous == null) {
				table[index] = current.next;
				} else {
					previous.next = current.next;
				}
				size--;
				System.out.println("Removed key "+ current.key + " with the value " + current.value +" from index " + index);
				return current.value;
			}
			previous = current;
			current = current.next;
	
		}
		return null;
	}

	public void printMap() {

		if (size == 0) {
			System.out.println("HashMap is empty!");
		}

		System.out.println("\n--- MyHashMap Contents (Size: " + size + ") ---");
		System.out.println();
		for (int i = 0; i < capacity; i++) {
			map<role, priority> current = table[i];
			if (current != null) {
				System.out.print("Bucket is " + i);

				while (current != null) {
					System.out.print("(" + current.key + " -> " + current.value + ")");
					if (current.next != null) {
						System.out.print(" -> ");
					}
					current = current.next;
				}

				System.out.println();
			}
		}
	}

}
