package homeWork10Lesson11;

public class Main {

    public static void main(String[] args) {

        InnoList arrayInno = new InnoArrayList();
        arrayInno.add(-77);
        arrayInno.add(5);
        arrayInno.add(-551);
        arrayInno.add(11);
        arrayInno.add(214);
        arrayInno.add(455);
        arrayInno.removeByIndex(2);
        arrayInno.insert(2,55);

        InnoList list = new InnoLinkedList();

        list.add(7);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(15);
        list.add(20);
        list.add(-77);
        list.add(100);
        list.insert(2,33);
        list.removeByIndex(5);
        list.remove(10);


        InnoIterator iterator1 = arrayInno.iterator();
        while (iterator1.hasNext()) {
            int x = iterator1.next();

                System.out.println(x);

        }

            InnoIterator iterator2 = list.iterator();

                while (iterator2.hasNext())
                    System.out.println(iterator2.next());

    }}

