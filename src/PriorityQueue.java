
public class PriorityQueue {
	private int maxSize;
	private int[] arr;
	private int front;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public PriorityQueue(int size) {
		this.maxSize = size;
		this.arr = new int[this.maxSize];
		this.front = 0;
		this.nItems = 0;
	}
	
	
	/**
	 * Inserting values by prioritizing the size
	 * @param value
	 */
	public void insert(int value) {
		int j;
		if(this.nItems == 0) {
			this.arr[this.nItems++] = value;
		}else {
			for(j = this.nItems - 1; j >= 0; j--) {
				if(value > this.arr[j]) {
					this.arr[j+1] = this.arr[j];
				}else {
					break;
				}
			}
			this.arr[j+1] = value;
			this.nItems ++;
		}
	}
	
	
	/**
	 * Removing the front value out of the queue
	 * @return integer
	 */
	public int remove() {
		int temp = this.arr[this.front++];
		if(this.front == this.maxSize) {
			this.front = 0;
		}
		this.nItems--;
		return temp;
	}
	
	/**
	 * Checking the queue front value
	 * @return integer
	 */
	public int peekFront() {
		return this.arr[this.front];
	}
	
	
	/**
	 * Checking if the queue is empty
	 * @return boolean
	 */
	public boolean isEmpty() {
		return this.nItems == 0;
	}
	
	/**
	 * Checking if the queue is full
	 * @return boolean
	 */
	public boolean isFull() {
		return this.nItems == this.maxSize;
	}
	
	
	/**
	 * Checking the size of the queue
	 * @return integer
	 */
	public int size() {
		return this.nItems;
	}
	
	
	/**
	 * Displaying all queue values
	 */
	public void displayQueue() {
		while(!this.isEmpty()) {
			int front = this.remove();
			System.out.println(front);
		}
	}
}
