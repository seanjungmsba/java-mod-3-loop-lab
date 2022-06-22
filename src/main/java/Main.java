//Make sure the case that outputs "0 year(s)" doesn't run anymore
// hint: it has to do with the way currentYear is initialized
// Add an if statement inside the while loop so the output 
// can have the right spelling for "year(s)" and "have" for every case.

public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear + 1;
        while (currentYear < targetYear) { // conditional logic based on the current year
            if (currentYear - startingYear == 1)
                System.out.println((currentYear - startingYear) + " year has passed");
            else
                System.out.println((currentYear - startingYear) + " years have passed");
            
            currentYear++;
        }
    }
}