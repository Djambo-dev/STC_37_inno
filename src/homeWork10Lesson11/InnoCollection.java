package homeWork10Lesson11;

public interface InnoCollection {
    /**
     * Добавляет элемент в коллекцию
     * @param element добавляемый элемент
     */
    void add(int element);

    /**
     * Удаляет элемент из коллекции
     * @param element удаляемый элемент
     */
    void remove(int element);

    /**
     * Проверяет наличие элемента в коллекции
     * @param element искомый элемент
     * @return true, если элемент найден, false в противном случае
     */
    boolean contains(int element);

    /**
     * Количество элементов коллекции
     * @return значение, равное количеству элементов
     */
    int size();

    /**
     * Метод для получения итератора текущей коллекции
     * @return объект-итератор
     */
    InnoIterator iterator();

}

