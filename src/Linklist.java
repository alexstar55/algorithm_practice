
public class Linklist {
	node head = new node();
	node temp = new node();
	boolean first = true;
	public void add(int data) {
		if(first) {
			head.data = data;
			head.next = null;
			first = false;
		}else {
			temp.data = data;
			temp.next = head;
			head = temp;
		}
	}
	public void insert(int data,int index) {
		
	}
}

