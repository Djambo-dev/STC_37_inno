package homeWork10Lesson11;

public class InnoArrayList implements InnoList{
    private static final int DEFAULT_SIZE = 10;

    private int[] elements;

    private int count;

    public InnoArrayList() {
        this.elements = new int[DEFAULT_SIZE];
        this.count = 0;
    }

    @Override
    public int get(int index) {
        if (index >= 0 && index < count) {
            return elements[index];
        } else {
            return -1;
        }
    }

    @Override
    public void insert(int index, int element) {

        if (index <= count && index > 0) {
            count++;
            if (count == elements.length) {
                resize();
            }
            int[] x = new int[elements.length];
            x[index] = element;
            System.arraycopy(elements, 0, x, 0, index);
            int newIndex = index + 1;
            for (int i = index; i < elements.length; i++) {
                if (elements[i] == 0)
                    break;
                x[newIndex] = elements[i];
                newIndex++;
            }
            elements = x;
        } else System.out.println("Wrong index");
    }
    @Override
    public void addToBegin(int element) {

        count++;
        if (count == elements.length) {
            resize();
        }
        int[] x = new int[elements.length];
        x[0] = element;
        int newIndex = 1;
        System.arraycopy(elements, 0, x, 1, elements.length - 1);
        elements = x;
    }

    @Override
    public void removeByIndex(int index) {

        if (index > 0 && index <= count) {
            count--;
            elements[index] = 0;
            for (int i = index + 1; i < elements.length; i++) {
                elements[i - 1] = elements[i];
            }
        } else System.out.println("Wrong index");
    }
    @Override
    public void add(int element) {
        // если список переполнен
        if (count == elements.length) {
            resize();
        }

        elements[count++] = element;
    }

    private void resize() {
        // создаем новый массив в полтора раза больший
        int[] newElements = new int[elements.length + elements.length / 2];
        // копируем из старого массива все элементы в новый
        for (int i = 0; i < count; i++) {
            newElements[i] = elements[i];
        }
        // устанавливаем ссылку на новый массив
        this.elements = newElements;
    }

    @Override
    public void remove(int element) {

        if (contains(element)) {
            count--;
            int index = 0;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == element) {
                    elements[i] = 0;
                    index = i;
                }
            }
            for (int i = index + 1; i < elements.length; i++) {
                elements[i - 1] = elements[i];
            }
        } else System.out.println("Wrong element");
    }
    @Override
    public boolean contains(int element) {


        for (int value : elements) {
            if (value == element)
                return true;
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public InnoIterator iterator() {
        // возвращаем новый экземпляр итератора
        return new InnoArrayListIterator();
    }

    // внутренний класс позволяет инкапсулировать логику одного класса внутри класса
    private class InnoArrayListIterator implements InnoIterator {
        // текущая позиция итератора
        private int currentPosition;

        @Override
        public int next() {
            // берем значение под текущей позицией итератора
            int nextValue = elements[currentPosition];
            // увеличиваем позицию итератора
            currentPosition++;
            // возвращаем значение
            return nextValue;
        }

        @Override
        public boolean hasNext() {
            // если текущая позиция не перевалила за общее количество элементов - можно дальше
            return currentPosition < count;
        }
    }

}

