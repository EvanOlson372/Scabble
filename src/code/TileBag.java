package code;

import java.util.Collection;
import java.util.Iterator;

public class TileBag<E> implements Collection<E> {
	
	private E[] _store;
	
	
	private int _size;

	private int DEFAULT_CAPACITY;

	
	public TileBag() {
		clear();
	}
	
	@Override
	public void clear() {
		_store = (E[]) (new Object[10]);
		_size = 0; 
	}

	@Override
	public boolean isEmpty() {
		return _size == 0;
	}

	@Override
	public boolean add(E e) {
		
		ensureCapacity();
		// HERE WE CAN GUARANTEE THAT THERE IS ENOUGH SPACE TO INSERT
		_store[_size] = e;
		// invariants break here
		_size = _size + 1;
		// invariants are restored by incrementing _size
		return true;
		// invariants hold here
	}

	private void ensureCapacity() {
		if (_size == _store.length) {
			// the array is full, so allocate a new larger array:
			int newSize = _store.length * 2;
			resize(newSize);
		}
		else if (_size < _store.length/4  &&  _store.length > DEFAULT_CAPACITY) {
			// array is under-utilized
			int newSize = Math.max(_store.length/4, DEFAULT_CAPACITY);
			resize(newSize);
		}
	}

	private void resize(int newSize) {
		E[] temp = (E[]) (new Object[newSize]);
		// copy data from old array to new array
		for (int i=0; i<_size; i=i+1) {
			temp[i] = _store[i];
		}
		// start using the new array
		_store = temp;
	}

	@Override
	public int size() {
		return _size;
	}

	@Override
	public boolean contains(Object obj) {
		if (obj == null) {
			for (int i=0; i<_size; i=i+1) {
				if (obj == _store[i]) {
					return true;
				}
			}
		}
		else {
			for (int i=0; i<_size; i=i+1) {
				if (obj.equals(_store[i])) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean remove(Object obj) {
		if (obj == null) {
			for (int i=0; i<_size; i=i+1) {
				if (obj == _store[i]) {
					_store[i] = _store[_size-1];
					_store[_size-1] = null;
					_size = _size - 1;
					return true;
				}
			}
		}
		else {
			for (int i=0; i<_size; i=i+1) {
				if (obj.equals(_store[i])) {
					_store[i] = _store[_size-1];
					_store[_size-1] = null;
					_size = _size - 1;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new BagIterator();
	}

	private class BagIterator implements Iterator<E> {

		private int _index;
		
		public BagIterator() {
			_index = 0;
		}
		
		@Override
		public boolean hasNext() {
			return _index < _size;
		}

		@Override
		public E next() {
			E temp = _store[_index];
			_index = _index + 1; 
			return temp;
		}
		
	}

	
}
