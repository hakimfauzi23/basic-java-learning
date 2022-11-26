public class JavaVariables {
    public static void main(String[] args) {
        /*
         * There are types of variable in Java
         * Here how to declare the variables with each of diff type
         */
        String name = "Hakim";
        int age = 27;
        char bloodType = 'A';
        double weights = 95.5;
        boolean isMale = true;

        // declare variable without assign a value;
        int myNum;
        myNum = 10;

        /*
         * will generate an error if you try to assign the final variables after
         * declare.
         */
        final int finalVariable = 15;

        /*
         * println() often used to display variables
         * ` + ` character is used for combine both text and variable(s)
         */

        System.out.println("Hello my name is " + name + " I am " + age + " years old ");

        /*
         * for numeric values, + character works as a math operator
         */
        System.out.println(age + weights);

        /*
         * variables can be declare more than one with same type
         * with comma-separated list
         */

        int x, y, z;
        x = 10;
        y = 99;
        z = 12;
        System.out.println(x + y + z);
    }

}
