package exercises;

public class UnitOne {

    public static int[] lengthOfStrings (String[] arrayOfStrings) {
        int[] arrayOfLengths = new int[arrayOfStrings.length];

        int index = 0;
        for (String s : arrayOfStrings) {
            arrayOfLengths[index++] = s.length();
        }

        return arrayOfLengths;
    }
}
