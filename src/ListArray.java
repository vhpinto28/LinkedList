
public class ListArray <T> implements TDAList<T>{
	private T[] List;
	private int count;
	
	public ListArray(int n) {
		this.count = 0;
		this.List = (T[]) new Object[n];
	}
	
	public boolean isEmptyList() {
		return (this.count == 0);
	}
	
	public boolean isFull() {
		return (this.count == this.List.length);
	}
	
	public int length() {
		return this.count;
	}
	
	public void destroyList() {
		this.count = 0;

	}
	
	public int search(T x) {
		for(int i = 0; i < this.length(); i++)
			if(this.List[i].equals(x))
				return i;
		return -1;
	}
	
	public void insertFirst(T x) {
		if (this.isFull())
			System.out.println("La lista esta llena");
		else {
			for (int i = this.length()-1; i>=0; i--)
				this.List[i+1] = this.List[i];
			this.List[0] = x;
			this.count++;
		}
	}
	
	public void insertLast(T x) {
		if (this.isFull())
			System.out.println("La lista esta llena");
		else {
			this.List[this.count++] = x;
		}
	}
	
	public void remove(T x) {
		int pos = this.search(x);
		if (pos != -1) {
			for (int i = pos; i<this.length(); i++)
				this.List[i] = this.List[i+1];
			this.count--;
		}
		else 
			System.out.println("Item not found ...");
	}
	public String toString() {
		String str = "";
		for (int i=0; i<this.length(); i++)
			str += "[" + i+"] = "+this.List[i]+ "\n";
		return str;
	}
} 

