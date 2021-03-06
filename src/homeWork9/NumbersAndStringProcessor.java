package homeWork9;

/**
 * Class that will process Strings and Nums.
 */
public class NumbersAndStringProcessor {
    /**
     * Source arrays.
     */
    int[] processInt;
    String[] processString;

    /**
     *Constructor that accepting arrays with source lines or nums.
     * @param processInt integer array with source nums.
     * @param processString string array with source strings.
     */
    public NumbersAndStringProcessor(int[] processInt, String[] processString) {
        this.processInt = processInt;
        this.processString = processString;
    }

    /**
     * Method that accepting StringsProcess interface.
     * Method will process lines in arrays by interface method.
     * Inside method creating new String array that will contain processed lines.
     * Adding processed lines in new array with for loop
     * @param stringsProcess interface implementation
     * @return array with processed lines.
     */
    public String[] processStrings(StringsProcess stringsProcess){
        String[] array = new String[processString.length];
        for(int i = 0; i < processString.length; i++){
            array[i] = stringsProcess.process(processString[i]);
        }
        return array;
    }

    /**
     * Method that accepting NumbersProcess interface.
     * Method will process nums in arrays by interface method.
     * Inside method creating new int array that will contain processed nums.
     * Adding processed lines in new array with for loop
     * @param numbersProcess interface implementation
     * @return array with processed nums.
     */
    public int[] processNums(NumbersProcess numbersProcess){
        int[] array = new int[processInt.length];
        for(int i = 0; i <processInt.length; i++){
            array[i] = numbersProcess.process(processInt[i]);
        }
        return array;
    }



    }








