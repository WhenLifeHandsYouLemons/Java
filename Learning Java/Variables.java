public class Variables {
    public static void main(String[] args) {
        System.out.println();

        String name = "James Gosling";
        int yearCreated = 1995;

        // Printing variables
        System.out.println(name);
        System.out.println(yearCreated);

        // Declare variable data type
        // datatype variableName
        int age;
        double salaryRequirement;
        boolean isEmployed;

        // Assign variable value
        age = 85;

        // Declare variable datatype and value!
        int currentYear = 2021;


        // INTEGERS

        // int variable declaration
        int yearJavaWasCreated;
        // Assignment
        yearJavaWasCreated = 1996;
        // Declaration and assignment
        int numberOfPrimitiveTypes = 8;

        // DOUBLES

        // doubles can have decimal places:
        double price = 8.99;
        // doubles can have values bigger than what an int could hold:
        double gdp = 536871000;

        // BOOLEANS

        boolean javaIsACompiledLanguage = true;
        boolean javaIsACupOfCoffee = false;

        // CHARACTERS

        char grade = 'A';
        char firstLetter = 'p';
        String punctuation = "!";

        // STRINGS

        // This is a String literal
        String greeting = "Hello World";

        // New String object
        String salutations = new String("Hello World");

        // Use a backslash to add characters that you wouldn't normally be able to
        // Prints: "Hello World"
        System.out.println("\"Hello World\"");
        // Prints: This is the backslash symbol: \
        System.out.println("This is the backslash symbol: \\");
        /*
        Prints:
        Hello
        Goodbye
        */
        System.out.println("Hello\nGoodbye");

        // MANIPULATING VARIABLES
        
        // declare initial balance
        double balance = 20000.99;
        // declare deposit amount
        double depositAmount = 1000.00;
        // store result of calculation in our original variable
        balance = balance + depositAmount;
    }
}
