package interfaceDeque;

import java.util.*;

public class Pile<T> {
	
	private Deque<T>  datas=new LinkedList<>();

	public void push(T valeur) {
		datas.addFirst(valeur);
	}

	public T pop() {
		
		return datas.removeFirst();
	}

}
