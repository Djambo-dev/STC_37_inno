package homeWork12Lesson14;

public interface Map<K, V> {
    // положить значение value под ключом key
    // a[5] = 7 <-> map.put(5, 7);
    void put(K key, V value);
    // получить значение по ключу
    // int i = a[5] <-> int i = map.get(5);
    V get(K key);
}

