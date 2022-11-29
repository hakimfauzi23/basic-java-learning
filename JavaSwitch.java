public class JavaSwitch {
    /*
     * Instead of writting many condition statement with if
     * We can use switch statement
     * in the switch statement can selects one of many code blocks to be executed.
     */
    public static void main(String[] args) {
        /*
         * HOW SWITCH WORKS
         * The Switch Expression is Evaluated/Check once
         * The Value of expression is compared with the values of each case
         * If the value of expression match with case
         * The blocks code inside case will be executed
         */

        String order = "Pizza";
        switch (order) {
            case "Coke":
                System.out.println("They order a coke!");
                break;
            case "Chicken":
                System.out.println("Some want to order themself!");
                break;
            case "Pizza":
                System.out.println("Now We're talking! Pizza!!"); // Will execute this
                break;
            default:
                System.out.println("It's so silent heree");
        }

        /*
         * BREAK KEYWORD
         * It used for stop execution of more code and case testing inside the block.
         * When a match is found, the job is done, and i'ts time for a break.
         * 
         * DEFAULT KEYWORD
         * The default keyword specifies some code to run if there is no case match
         * it does not need a break. because used as last statements.
         */
    }

}
