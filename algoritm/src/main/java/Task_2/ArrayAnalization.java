package Task_2;

public class ArrayAnalization {

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int totalCount = intArray[intArray.length - 1];
        int expectedSum = totalCount * (totalCount + 1) / 2;
        int actualSum = 0;
        for(int i : intArray) {
            actualSum += i;
        }

        System.out.println(expectedSum - actualSum);
    }
}
