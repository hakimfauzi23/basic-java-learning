public class JavaWhileLoop {
    /*
     * Loops can execute a block of code as specified condition is reached
     * While loop will repeat a block of code as long the specified condition is
     * true.
     */
    public static void main(String[] args) {
        // int i = 0;
        // while (i < 5) {
        // // These block of code wil be executed when the condition is true
        // // If the condition is false, it will stop
        // System.out.println(i);

        // i++; // this called an increment, this is important makes the code is not
        // forever
        // // loop
        // }

        /*
         * DO WHILE LOOP
         * Same as While loop, but the difference is this loop executed the code once in
         * the Do block.
         */

        int num = 0;
        do {
            System.out.println(num); // do this code first even condition not matches.
            num++;
        } while (num > 5);

    }
}
