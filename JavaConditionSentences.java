public class JavaConditionSentences {
    /*
     * Conditional sentences has boolean base
     * So there are condition checking
     * and if the condition are matches or unmatches
     * the code will executed in each block (matches or unmatches block)
     */
    public static void main(String[] args) {
        // There are some conditional statements //

        // if condition
        // this condition will execute the code
        // inside the block if the condition is true
        if (100 > 0) // this is condition
        {
            // this code will executed if condition is true.
            System.out.println("100 is greater than 0");
        }

        // else condition
        // this condition will execute the code
        // inside the else block if the condition is false
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening."); // will execute this code
        }

        // else if condition
        // this condition will specify a new condition if
        // the first condition is false
        // this condition must be placed before else condition
        int time1 = 22;
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 24) {
            System.out.println("Good day."); // will execute this code
        } else {
            System.out.println("Good evening.");
        }

        
        /*
         * SO IMPORTANT
         * JAVA SHORT HAND IF ELSE
         * OR YOU MAY CALLED IT TERNARY OPERATOR
         * WHY IT'S CALLED TERNARY OPERATOR
         * BECAUSE IT CONSISTS OF THREE OPERANDS
         * SYNTAX : variable = (condition) ? expressionTrue : expressionFalse;
         */
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

    }

}
