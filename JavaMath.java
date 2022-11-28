public class JavaMath {

    /*
     * Java has a class named Math
     * Allows to perform mathematical tasks on numbers
     * There are many useful method on this class
     */
    public static void main(String[] args) {

        // max(x,y) method is for find highest value inside the args
        int maxNumber = Math.max(5, 10);
        System.out.println(maxNumber);

        // min(x,y) method is for find lowest value inside the args
        int minNumber = Math.min(1, 10);
        System.out.println(minNumber);

        // sqrt(x) method is to returns square root of x
        double squareRootNum = Math.sqrt(81);
        System.out.println(squareRootNum);

        // abs(x) method is to returns absolute number of x
        // absolute means always positives
        // in your life, your mind must be absolute.
        int absoluteNum = Math.abs(-992);
        System.out.println(absoluteNum);
    }

    /*
     * And there are still many useful methods in this Math class
     * here's the reference : https://www.w3schools.com/java/java_ref_math.asp
     */

}
