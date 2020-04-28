
public class SimplePair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    /* 
        ? - 
        E - Element
        T - Type
        K - Key
        V - Value
        S, U, V - extra parameters
    */

    public SimplePair(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

}