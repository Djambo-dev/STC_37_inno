package homeWork9;

public class Main {
    public static void main(String[] args) {


        int[] nums = new int[]{10523, 1030506, 23};
        String[] lines = new String[]{"Developer", "Java", "Inno37polis"};
        NumbersAndStringProcessor nas = new NumbersAndStringProcessor(nums, lines);


        //1ая реализация Int
        NumbersProcess numbersProcess1 = number -> {
            String num = "";
            int xLength = String.valueOf(number).length();
            for (int i = 0; i < xLength; i++) {
                num = num + number % 10;
                number = number / 10;
            }
            return Integer.parseInt(num);
        };
        int[] testArray1 = nas.processNums(numbersProcess1);
        for (int i : testArray1)
            System.out.print(i + " ");
        System.out.println();

        //2ая реализация Int
        NumbersProcess numbersProcess2 = number -> {
            char[] chars = String.valueOf(number).toCharArray();
            String s = "";
            for (char num : chars) {
                if (num == '0') {
                    continue;
                }
                s = s + num;
            }
            return Integer.parseInt(s);
        };
        int[] testArray2 = nas.processNums(numbersProcess2);
        for (int i : testArray2)
            System.out.print(i + " ");
        System.out.println();


        //3ая реализация Int
        int[] testArray3 = nas.processNums(number -> {
            if (number % 2 == 1)
                number = number - 1;
            return number;
        });
        for (int i : testArray3)
            System.out.print(i + " ");
        System.out.println();

        //1 реализция String
        StringsProcess stringsProcess1 = word -> {
            char[] chars = word.toCharArray();
            String s1 = "";
            for (int i = chars.length - 1; i >= 0; i--) {
                s1 = s1 + chars[i];
            }
            return s1;
        };
        String[] test1 = nas.processStrings(stringsProcess1);
        for (String s : test1)
            System.out.print(s + " ");
        System.out.println();

        //2ая реализация String
        StringsProcess stringsProcess2 = word -> {
            char[] chars = word.toCharArray();
            String s1 = "";
            for (char aChar : chars) {
                if (!Character.isDigit(aChar))
                    s1 = s1 + aChar;
            }
            return s1;
        };
        String[] test2 = nas.processStrings(stringsProcess2);
        for (String s : test2)
            System.out.print(s + " ");
        System.out.println();


        //3ая реализация String
        StringsProcess stringsProcess3 = String::toUpperCase;
        String[] test3 = nas.processStrings(stringsProcess3);
        for (String s : test3)
            System.out.print(s + " ");
        System.out.println();
    }

}
