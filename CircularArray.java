import java.util.Iterator;

public class CircularArray<T> implements Iterable<T> {
	private T[] items;
	private int head = 0;
	
	public CircularArray (int size){
		items = (T[]) new Object[size];
	}
	
	private int convert (int index){ //index is the shift right value
		if(index < 0){ //if less than zero we add items.length because no modulus
			index += items.length;
		}
		return (head+index) % items.length; //otherwise we get the modulo functions
		}
	
	public void rotate (int shiftRight){
		head = convert(shiftRight); //calls the convert function and sends the shiftright value. 
	}
	
	public T get(int i){
		if(i < 0 || i>items.length){
			throw new java.lang.IndexOutOfBoundsException("...");
		}
		return items[convert(i)];
	}
	
	public void set(int i, T item){
		items[convert(i)] = item;
	}
	
	public Iterator<T> iterator(){
		return new CircularArrayIterator<T>(this);
	}
	
	private class CircularArrayIterator<TI> implements Iterator<TI>{
		/*current reflects the offset from the current head, not from the actual raw array */
		private int _current = -1;
		private TI[] _items;
		
		public CircularArrayIterator(CircularArray<TI> array){
			_items = array.items;
		}
		
		public boolean hasNext(){
			return _current<items.length-1;
		}
		
		public TI next(){
			_current++;
			TI item = (TI) _items[convert(_current)];
			return item;
		}
		
		public void remove(){
			throw new UnsupportedOperationException("...");
		}
		
	}
	
}