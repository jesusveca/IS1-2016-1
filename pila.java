package pila;
public class pila<T>{
	private T[] elems;
	private int position = -1;
	public pila(){
		this(100);
	}
	public pila(int size) {
		elems = (T[]) new Object[size];
		
	}
	public T pop() throws Exception{
		if(position < 0){
			throw new Exception("Underflow");
		}
		return elems[position--];
	}
	public void push(T elem) throws Exception{
		if(position > elems.length-1){
			throw new Exception("Overflow");
		}
		elems[++position] = elem;
	}
}