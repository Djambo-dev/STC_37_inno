package homeWork10Lesson11;

public class InnoLinkedList implements InnoList {
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private int count;

    // get(7)
    @Override
    public int get(int index) {
        if (index >= 0 && index < count) {
            // начинаем с первого элемента
            Node current = first;
            // отсчитываем элементы с начала списка пока не дойдем до элемента с нужной позицией
            for (int i = 0; i < index; i++) {
                // переходим к следующему
                current = current.next; // семь раз сделаю next
            }
            // возвращаем значение
            return current.value;
        } else {
            return -1;
        }
    }


    @Override
    public void insert(int index, int element) {
        Node current = first;
        Node current1 = current.next;
        Node node = new Node(element);
        if (index <= count && index > 0) {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
                current1 = current.next;
            }
            current.next = node;
            node.next = current1;
            count++;
        } else if (index == 0) {
            addToBegin(element);
        } else System.out.println("Wrong index");
    }

    @Override
    public void addToBegin(int element) {

        count++;
        Node node = new Node(element);
        node.next = first;
        first = node;
    }

    @Override
    public void removeByIndex(int index) {
        // If linked list is empty
        if (first == null)
            return;
        // Store head node
        Node temp = first;
        // If head needs to be removed
        if (index == 0) {
            first = temp.next;   // Change head
            count--;
            return;
        }
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < index - 1; i++)
            temp = temp.next;
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
        temp.next = next;  // Unlink the deleted node from list
        count--;
    }


    @Override
    public void add(int element) {
        Node newNode = new Node(element);
        if (first == null) {
            first = newNode;
        } else {
            // следующий после последнего - новый узел
            last.next = newNode;

        }
        // новый узел - последний
        last = newNode;
        count++;
    }

    @Override
    public void remove(int element) {
        Node current = first, prev = null;
        if (current != null && current.value == element) {
            first = current.next;
            count--;
            return;
        }
        while (current != null && current.value != element) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("No such element");
            return;
        }
        count--;
        prev.next = current.next;
    }

    @Override
    public boolean contains(int element) {

        Node current = first;
        // отсчитываем элементы с начала списка пока не дойдем до элемента
        for (int i = 0; i < count; i++) {
            // переходим к следующему
            if (current.value == element)
                return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public InnoIterator iterator() {
        return new InnoLinkedListIterator();
    }

    private class InnoLinkedListIterator implements InnoIterator {

        // ссылка на текущий узел итератора
        private Node current;

        InnoLinkedListIterator() {
            this.current = first;
        }

        @Override
        public int next() {
            int nextValue = current.value;
            // сдвигаем указатель на следующий узел
            current = current.next;
            return nextValue;
        }

        @Override
        public boolean hasNext() {
            // если следующего узла нет - не идем дальше



            return current != null;
        }
    }

}