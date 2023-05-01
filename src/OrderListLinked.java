
public class OrderListLinked<T extends Comparable<T>> extends ListLinked<T>{
	public OrderListLinked() {
		super();
	}

	public boolean searchOrder(T item) {
		Node <T> aux = this.first;
		while (aux != null ) {
			if (aux.getData()==item) {
				return false;
			}
			aux = aux.getNext();
		}
		return false;
	}

	public void insert(T item) {
		this.first = new Node<T>(item,this.first);
		this.count ++ ;
	        Node<T> current = this.first, index = null;
	        T temp;
	  
	        if (this.first == null) {
	            return;
	        }
	        else {
	            while (current != null) {
	                
	                index = current.getNext();
	  
	                while (index != null) {
	                    if (current.getData().compareTo(current.getNext().getData())>0) {
	                        temp = current.getData();
	                        current.setData(index.getData()) ;
	                        index.setData(temp) ;
	                    }
	  
	                    index = index.getNext();
	                }
	                current = current.getNext();
	            }
	            
	        }
	        
	}
public void remove(T x) {
		
		Node <T> aux1 =this.first;
		Node <T> prev = null;
		while (aux1 !=null) {
			if(aux1.getData() == x) {
				if (aux1 == this.first)
					this.first = this.first.getNext();
				else {
					prev.setNext(aux1.getNext());
				}
			}
			prev = aux1;
			aux1 = aux1.getNext();
		}
		this.count--;
	}
}

