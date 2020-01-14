package cs146F19.Bedi.project1;

public class CircularLinkedList {

	public static class Node {
		int data;
		Node next;
		public Node (int data) {
			this.data = data;
		}
	}

	public static int findWinner(int n, int k) {

		//start counting time to create list
		long begin = System.currentTimeMillis();

		Node head = new Node(1);
		Node prev = head;

		// add n number of nodes
		for(int i = 2; i <= n; i++) {
			prev.next = new Node(i);
			prev = prev.next;
		}

		// the last added node should have the head as the next node to make it a circular linked list
		prev.next = head;

		//end counting time and calculate total time to create list
		long end = System.currentTimeMillis();
		long totalTime = end - begin;
		System.out.println("The total time to create list: " + totalTime + " milliseconds.");

		// two placeholder variables as heads
		Node temp1 = head;
		Node temp2 = head;

		//start time to delete node and find winner
		long start = System.currentTimeMillis();

		//elimination process
		while(temp1.next != temp1) //check to see if only one node is remaining
		{
			int i = 0;

			while(i != k) //run until you have counted forward k number of elements 
			{
				temp2 = temp1;
				temp1 = temp1.next;
				i++;
			}

			//eliminate the node at k
			temp2.next = temp1.next;
			temp1 = temp2.next;
			
		}
		
		//end counting and calculate total time to delete node and find winner
		long ending = System.currentTimeMillis();
		long deleteTime = ending - start;
		System.out.println("Total time to delete Node: " + deleteTime + " milliseconds.");
		
		
		return temp1.data;
	}

	public static void main(String args[]) {

		System.out.println("Lucky winner is " + findWinner(6, 2));


	}

}
