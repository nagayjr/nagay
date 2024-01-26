package support;

public class JavaHomework {
    public static void main(String[] args) {
//        printString();
//        printBoolean();
//        sumOfStrings();
//        MathResults();
//        comparisonResults();
//        logicalOperators();

        Car car1 = new Car();
        Car car2 = new Car();

        car1.drive(50);
        car1.fuelUp();
        car1.drive(80);

        car2.drive(100);
        car2.drive(10);
    }
}

//
//    private static void sumOfStrings() {
//
//        public static void printStringSum(String str1, String str2) {
//            String result = str1 + str2;
//            System.out.println(result);
//        }
//
//        public static void main(String[] args) {
//
//            String firstString = "Homework";
//            String secondString = "01/17/24";
//            printStringSum(firstString, secondString);
//        }
//    }
//    }
//    }
//
//    private static void printBoolean() {
//            boolean myBoolean = true;
//            printBoolean("Homework");
//
//    }
//
//    static void printString() {
//        System.out.println("This is a string ... ");
//
//        public static int addiction(int x, int y) {
//        return x + y;
//    }
//
//    public static int calculate(int x, int y, String op) {
//        if (op.equals("+")) {
//            return x + y;
//        }
//        if (op.equals("-")) {
//            return x - y;
//        }
//        if (op.equals("/")) {
//            return x / y;
//        }
//        if (op.equals("*")) {
//            return x * y;
//        }
//        return 0;
//
//
//        public class IntPrinter {
//
//            public static void printInt() {
//                System.out.println(5);
//            }
//
//            public static void main(String[] args) {
//                int myNumber = 42;
//                printInt(myNumber);
//            }
//        }
//
//
//
//        public class Mathresult {
//
//            public static void main(String[] args) {
//                int operand1 = 10;
//                int operand2 = 5;
//
//                // Addition
//                int sum = operand1 + operand2;
//                System.out.println("Sum: " + sum);
//
//                // Subtraction
//                int difference = operand1 - operand2;
//                System.out.println("Difference: " + difference);
//
//                // Multiplication
//                int product = operand1 * operand2;
//                System.out.println("Product: " + product);
//
//                // Division
//                if (operand2 != 0) {
//                    int quotient = operand1 / operand2;
//                    System.out.println("Quotient: " + quotient);
//                } else {
//                    System.out.println("Cannot divide by zero.");
//                }
//
//                // Modulus (Remainder)
//                if (operand2 != 0) {
//                    int remainder = operand1 % operand2;
//                    System.out.println("Remainder: " + remainder);
//                } else {
//                    System.out.println("Cannot calculate remainder when divisor is zero.");
//                }
//            }
//        }
//        public class StringSumPrinter {
//
//            public static void printStringSum(String str1, String str2) {
//                String result = str1 + str2;
//                System.out.println(result);
//            }
//
//            public static void main(String[] args) {
//                // Example of using the printStringSum method
//                String firstString = "Hello, ";
//                String secondString = "World!";
//                printStringSum(firstString, secondString);
//            }
//        }
//
//
//        public class MathResults {
//
//            public static void main(String[] args) {
//                int operand1 = 10;
//                int operand2 = 5;
//
//
//                int sum = operand1 + operand2;
//                System.out.println("Sum: " + sum);
//
//
//                int difference = operand1 - operand2;
//                System.out.println("Difference: " + difference);
//
//
//                int product = operand1 * operand2;
//                System.out.println("Product: " + product);
//
//
//                if (operand2 != 0) {
//                    int quotient = operand1 / operand2;
//                    System.out.println("Quotient: " + quotient);
//                } else {
//                    System.out.println("Cannot divide by zero.");
//                }
//
//            }
//        }
//
//        public class ComparisonOperators {
//
//            public static void main(String[] args) {
//                int x = 10;
//                int y = 5;
//
//                // Equal to
//                boolean isEqual = x == y;
//                System.out.println("Equal to: " + isEqual);
//
//                // Not equal to
//                boolean isNotEqual = x != y;
//                System.out.println("Not equal to: " + isNotEqual);
//
//                // Greater than
//                boolean isGreaterThan = x > y;
//                System.out.println("Greater than: " + isGreaterThan);
//
//                // Less than
//                boolean isLessThan = x < y;
//                System.out.println("Less than: " + isLessThan);
//
//                // Greater than or equal to
//                boolean isGreaterOrEqual = x >= y;
//                System.out.println("Greater than or equal to: " + isGreaterOrEqual);
//
//                // Less than or equal to
//                boolean isLessOrEqual = x <= y;
//                System.out.println("Less than or equal to: " + isLessOrEqual);
//            }
//        }
//
//
//
//        public class LogicalOperators {
//
//            public static void main(String[] args) {
//                boolean bool1 = true;
//                boolean bool2 = false;
//
//                // Logical AND
//                boolean andResult = bool1 && bool2;
//                System.out.println("Logical AND: " + andResult);
//
//                // Logical OR
//                boolean orResult = bool1 || bool2;
//                System.out.println("Logical OR: " + orResult);
//
//                // Logical NOT
//                boolean notResult1 = !bool1;
//                boolean notResult2 = !bool2;
//                System.out.println("Logical NOT for bool1: " + notResult1);
//                System.out.println("Logical NOT for bool2: " + notResult2);
//            }
//        }
//
//    }
