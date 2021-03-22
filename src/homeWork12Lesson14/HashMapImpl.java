package homeWork12Lesson14;

class HashMapImpl<K, V> implements Map<K, V> {
    private static final int DEFAULT_SIZE = 16;

    private MapEntry<K, V> entries[];

    public HashMapImpl() {
        this.entries = new MapEntry[DEFAULT_SIZE];
    }

    private static class MapEntry<K, V> {
        K key;
        V value;
        MapEntry<K, V> next;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public void put(K key, V value) {
        // получаем хеш-код у ключа - это и будет индекс массива, где лежит значение
        // 4232 -> 1
        //  1010010101010011
        // &            1111
        //  0000000000000011

        // посчитали индекс, в который мы хотим положить элемент
        int index = key.hashCode() & (entries.length - 1);

        // проверяем, а не лежит ли там уже какой-то элемент?

        if (entries[index] != null) {
            // проверить, нет ли там аналогичного ключа
            MapEntry<K, V> current = entries[index];
            while (current != null) {
                // если мы нашли ключ, который совпал с тем, который мы подали на вход - делаем замену значения
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                // если не совпал - идем дальше
                current = current.next;
            }
            // если мы оказали здесь - значит ни разу такого ключа не встретили
            // положить текущую пару ключ-значение в таблицу

            // создали новую пару
            MapEntry<K, V> newMapEntry = new MapEntry<>(key, value);
            // текущая пара стала первой - следующий для нее элемент - это тот, который был в начале списке
            newMapEntry.next = entries[index];
            // делаем его первым в таблице
            entries[index] = newMapEntry;
        } else {
            entries[index] = new MapEntry<>(key, value);
        }
    }

    @Override
    public V get(K key) {

        MapEntry<K, V> current;
        int index = key.hashCode() & (entries.length - 1);
        if(entries[index] != null){
            current = entries[index];

            while (!key.equals(current.key)){
                current = current.next;
                if(current == null){

                    return null;
                }

            }
            return current.value;
        } else {

            return null;
        }

    }
}