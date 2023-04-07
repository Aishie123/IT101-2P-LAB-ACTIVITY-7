// Aisha Nicole L. Dones
// Section A122

import java.util.Arrays;

@SuppressWarnings("DuplicatedCode")
public class SetOperations {
    private static final int[] U = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        final int[] A = {1, 2, 3};
        final int[] B = {2, 3, 4};

        System.out.println("\n-- SET OPERATIONS --\nCreated by: Aisha Nicole L. Dones");
        displaySet(unionOfSet(unionAllOfSet(A, B)), "\nUnion:\nA ∪ B = ");
        displaySet(unionAllOfSet(A, B), "\nUnion All:\nA ∪ B = ");
        displaySet(intersectionOfSet(A, B), "\nIntersection:\nA ∩ B = ");
        displaySet(differenceOfSet(A, B), "\nDifference:\nA \\ B = ");
        displaySet(complementOfSet(A), "\nComplement of A:\nA' = ");
        displaySet(complementOfSet(B), "\nComplement of B:\nB' = ");
        displaySet(symmetricDiffOfSet(A, B), "\nSymmetric difference:\nA △ B = ");

    } // end of main

    private static void displaySet(int[] set, String text){
        StringBuilder strDisplay = new StringBuilder(text);
        strDisplay.append("{");
        for (int element: set){ strDisplay.append(element).append(", "); }
        strDisplay = new StringBuilder(strDisplay.substring(0, strDisplay.length() - 2)); // removes last 2 characters
        strDisplay.append("}");
        System.out.println(strDisplay);
    } // end of displaySet method

    private static int[] unionAllOfSet(int[] A, int[] B){
        StringBuilder strUnionAll = new StringBuilder();
        for (int element : A){ strUnionAll.append(element).append(" "); }
        for (int element : B){ strUnionAll.append(element).append(" "); }
        return strToInt(strUnionAll);
    } // end of unionAllOfSet

    private static int[] unionOfSet(int[] set){
        StringBuilder strUnion = new StringBuilder();
        int num = set[0];
        boolean duplicate = false;

        for (int element : set) {
            if (num == element && !duplicate) { duplicate = true; }
            else if (num != element) {
                strUnion.append(num).append(" ");
                num = element;
                duplicate = false;
            }
        } strUnion.append(num).append(" ");
        return strToInt(strUnion);
    } // end of unionOfSet method

    private static int[] intersectionOfSet(int[] A, int[] B){
        StringBuilder strInter = new StringBuilder();
        for (int elementA : A) {
            for (int elementB : B) {
                if (elementA == elementB) { strInter.append(elementA).append(" "); break; }
            }
        } return strToInt(strInter);
    } // end of intersectionOfSet method

    private static int[] differenceOfSet(int[] A, int[] B){
        StringBuilder strDiff = new StringBuilder();
        for (int elementA : A) {
            boolean common = false;
            for (int elementB : B) { if (elementA == elementB) { common = true; break; } }
            if (!common){ strDiff.append(elementA).append(" "); }
        } return strToInt(strDiff);
    } // end of differenceOfSet method

    private static int[] symmetricDiffOfSet(int[] A, int[] B){
        return unionAllOfSet(differenceOfSet(A, B), differenceOfSet(B, A)); } // end of symmetricDiffOfSet method

    private static int[] complementOfSet(int[] set){
        StringBuilder strComp = new StringBuilder();
        for (int elementU : U) {
            boolean found = false;
            for (int element : set) { if (element == elementU) { found = true; break; } }
            if (!found){ strComp.append(elementU).append(" "); }
        } return strToInt(strComp);
    } // end of complementOfSet method

    private static int[] strToInt(StringBuilder str){
        String[] strArray = String.valueOf(str).split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++){ intArray[i] = Integer.parseInt(strArray[i]); }
        Arrays.sort(intArray);
        return intArray;
    } // end of strToInt method

} // end of class