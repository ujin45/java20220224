package chap13.book.exercise.p3;

public class Container<T, U> {

	private T Key;
	private U Value;
	
	
	public T getKey() {
		return Key;
	}
	
	public U getValue() {
		return Value;
	}
	public void set(T Key, U Value) {
		this.Key = Key;
		this.Value = Value;
	}		
	
}
