

public class LinkedBookList {

	private BookNode head;
	private int size;
	
	public LinkedBookList(){
		head = null;
		size = 0;
	}
	
	//returns size of the list
	public int size(){
		return size;
	}
	
	//IMPLEMENT -- adds a book to the end of the linked list
	public void add(Book b){
		if(size == 0) {
		head = new BookNode(b, head);
	}
		else {
		BookNode cur = head;
		for(int i = 0; i < size-1; i++) {
			cur = cur.getNext();
		}
		cur.setNext(new BookNode(b, cur.getNext()));
	}
	size++;
}
	
	//IMPLEMENT -- adds a book at the specific index, 
	//  or at the end if index is greater than size
	public void add(Book b, int index){
		if(index > size) {
			BookNode cur = head;
			for(int i = 0; i < size-1; i++) {
				cur = cur.getNext();
			}
			cur.setNext(new BookNode(b, cur.getNext()));
		}
		if(index == 0) {
			head = new BookNode(b, head);
		}
		else {
			BookNode cur = head;
			for(int i = 0; i < index-1; i++) {
				cur = cur.getNext();
			}
			cur.setNext(new BookNode(b, cur.getNext()));
		}
		size++;
	}
	
	//IMPLEMENT -- removes a book and returns it, or 
	//	returns null if book is not present
	public Book remove(Book b){
		BookNode cur = head;
		Book ret = null;
		if(head.getBook().equals(b)) {
			ret = b;
			head = head.getNext();
			size--;
			return ret;
		}
		else {
			for(int i = 0; i < size-1; i ++) {
				cur = cur.getNext();
				if(cur.getNext().getBook().equals(b)) {
					ret = b;
					break;
				}
			}
			cur.setNext(cur.getNext().getNext());
			size--;
			return ret;
		}
	}

	//IMPLEMENT -- removes a book at a specific index and returns it, 
	//	or returns null if index is not present
	public Book remove(int index){
		if(index >= size || index < 0) {
			return null;
		}
		if(index == 0) {
			Book ret = head.getBook();
			head = head.getNext();
			size--;
			return ret;
		}
		else {
			BookNode cur = head;
			Book ret = null;
			for(int i = 0; i < index-1; i ++) {
				cur = cur.getNext();
				ret = cur.getNext().getBook();
			}
			cur.setNext(cur.getNext().getNext());
			size--;
			return ret;
		}
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){
		int total = 0;
		total += head.getNumPages();
		BookNode cur = head;
		for(int i = 0; i < size-1; i++) {
			cur = cur.getNext();
			total += cur.getNumPages();
		}
		return total;
	}
	

        public String toString()
        {
                String res = "";
                for (BookNode pos = head; pos != null; pos = pos.getNext()) {
                        if (pos.getBook() == null) {
                                res += "null";
                        } else {
                                res += pos.getBook();
                        }

                        if (pos.getNext() != null) res += "\n";
                }
                return res;
        }

}



