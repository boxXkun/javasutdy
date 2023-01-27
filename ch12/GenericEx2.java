package ch12;

interface Pair<K, V> {

	public K getkey();

	public V getValue();

}

class OrderPair<K, V> implements Pair<K, V> {

	public K key;
	public V value;

	public OrderPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getkey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

}

public class GenericEx2 {

	public static void main(String[] args) {
		OrderPair<String, Integer> p1 =
				new OrderPair<String, Integer>("Even", 8);
		OrderPair<String, String> p2 =
				new OrderPair<String, String>("Hello", "world");
		

	}

}
