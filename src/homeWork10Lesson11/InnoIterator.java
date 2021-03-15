package homeWork10Lesson11;

public interface InnoIterator {
    /**
     * Возвращает следующий элемент коллекции
     * @return элемент
     */
    int next();

    /**
     * Проверяет, есть ли следующий элемент коллекции
     * @return true - если есть, false - если нет
     */
    boolean hasNext();

}

