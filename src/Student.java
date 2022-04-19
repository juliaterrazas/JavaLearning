import java.util.*;

class PersonD {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    PersonD(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends PersonD{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public String calculate() {
        int sum =0;
        String result = new String();

        for(int i=0; i< testScores.length; i++){
            sum = sum + testScores[i];
        }
        sum = sum/testScores.length;

        if(sum>=90&&sum<=100){
            result = "O";
        }
        if(sum>=80&&sum<90){
            result = "E";
        }
        if(sum>=70&&sum<80){
            result = "A";
        }
        if(sum>=55&&sum<70){
            result = "P";
        }
        if(sum>=40&&sum<55){
            result = "D";
        }
        if(sum<40){
            result = "T";
        }


        return result;
    }

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}