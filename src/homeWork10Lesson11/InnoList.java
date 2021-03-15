package homeWork10Lesson11;

public interface InnoList extends InnoCollection {
    /**
     * Получение элемента по индексу
     * @param index индекс элемента
     * @return элемент, -1 если вышли за границу
     */
    int get(int index);

    /**
     * Замена элемента в определенном индексе
     * @param index куда хотим вставить элемент
     * @param element сам элемент
     */
    void insert(int index, int element);

    /**
     * Добавление элемента в начало
     * @param element добавляемый элемент
     */
    void addToBegin(int element);

    /**
     * Удаляет элемент в заданной позиции
     * @param index позиция элемента
     */
    void removeByIndex(int index);

}

