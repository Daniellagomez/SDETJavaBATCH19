package Class11;
/*
Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
 */

public class Task4 {
    public static void main(String[] args) {
        String fathersName="Christian";
        String mothersName="Daniella";
        boolean itsaBoy=true;
        if (itsaBoy){
            String firstHalf=fathersName.substring(0,fathersName.length()/2);
            String lastHalf=mothersName.substring(mothersName.length()/2,mothersName.length());
            System.out.println(firstHalf+lastHalf);
        }else {
            String firstHalf=mothersName.substring(0,mothersName.length()/2);
            String lasHalf=fathersName.substring(fathersName.length()/2,fathersName.length());
            System.out.println(firstHalf+lasHalf);
        }

    }
}
