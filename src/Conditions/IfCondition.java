package Conditions;

public class IfCondition {
        public static void main(String[] args) {
            double average = 32.50;
            //IF Statement
            if (average < 25) {
                System.out.println("Average is less that 25");
                System.out.println("Y0u are failed");
                System.out.println("Please try again next month");
            }

            if(average >= 25) {
                System.out.println("Average is greater than 25");
                System.out.println("You are pass");
                System.out.println("Congrate");
            }
        }

}
