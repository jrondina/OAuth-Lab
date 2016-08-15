import java.util.Scanner;

public class Main {

    public static boolean evenCheck(int numberToCheck) {
        return ((numberToCheck % 2) == 0);

    }

    public static boolean spellCheck(String string1, String string2){

        return (string1.equals(string2));
    }

    public static void findW(String checkW) {
        for (int i = 0; i < checkW.length(); i++) {
            if (checkW.charAt(i) == 'w') {
                break;
            }
            System.out.println(checkW.charAt(i));
        }
    }

    public static double randomReturn(){
        double randomNum = Math.random() * 100;
        if(randomNum > 50){
            return -1;
        }
        else{
            return randomNum;
        }

    }

    public static boolean leapYear(int year){
        return ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));

    }

    public static String nextDay(int day, int month, int year){
        if (month == 12 && day == 31) { //rollover for end of year
            year = 1; month = 1; day = 1;
        }
        else if(day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) { //rollover for months with 30 days
            day = 1; month++;


        }
        else if(month == 2 && day >= 28) { //special cases for february
            if (leapYear(year)) {
                if (day == 29) {
                    day = 1; month++;
                }
                else if (day == 28) {
                    day++;
                }

            }
            else {
                month = 3 ; day = 1;
            }

        }
        else if(day == 31) { //rollover for months with 31 days
            month++; day = 1;
        }
        else { //any other day just goes up one day
            day++;
        }
        return "day: " + day + " month: " + month + " year: " + year;
    }

    public static void everyOtherLetter(String inputString) {
        StringBuilder newString = new StringBuilder(inputString);
        int offset = 0;
        for(int i = 0; i < newString.length(); i++) {
            if (i % 2 != 0) {
                newString.deleteCharAt(i - offset);
                offset++;

            }

        }
        System.out.println(inputString + " vs. " + newString);
    }

    public static void excludeFour(int overFour){
        if(overFour > 4) {
            int i = 0;
            while (i < overFour) {
                if(i != 4) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }

    public static int twoAdd(int numOne, int numTwo) {
        if (numOne == numTwo) {
            return (numOne + 2) * 2;
        }
        else {
            return (numOne + 1) + (numTwo + 1);
        }
    }
    public static void countryName() {
        System.out.print("Enter two letter country code:");
        Scanner enter = new Scanner(System.in);
        String twoLetter = enter.nextLine();
        switch (twoLetter) {
            case "us":
                System.out.println("United States");
                break;
            case "de":
                System.out.println("Germany");
                break;
            case "hu":
                System.out.println("Hungary");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }

    public static void consOrVow(){
        System.out.print("Enter a letter: ");
        Scanner enter = new Scanner(System.in);
        char inputChar = enter.nextLine().toLowerCase().charAt(0);
        if (inputChar >= 97 && inputChar <= 122) {
            if (inputChar == 97 || inputChar == 101 || inputChar == 105 || inputChar == 111 || inputChar == 117) {
                System.out.println("Vowel");
            } else {
                System.out.print("Consonant");
            }
        }
        else {
            System.out.println("Enter a letter, you dummy!");
            consOrVow();
        }


    }

    public static void main (String[] args) {

        System.out.println("Is 2 Even?: " + evenCheck(2));
        System.out.println("Is 3 Even?: " + evenCheck(3));
        System.out.println("Is Dog the same as Dog?: " + spellCheck("Dog", "Dog"));
        System.out.println("Is Cat the same as Dog?: " + spellCheck("Cat", "Dog"));
        findW("tomorrow");
        findW("power");
        System.out.println(randomReturn());
        System.out.println(nextDay(31, 12, 2000)); // 01/01/2001
        System.out.println(nextDay(29, 2, 2016)); //02/29/2016
        System.out.println(nextDay(28, 2, 2005)); //03/01/2005
        System.out.println(nextDay(28, 2, 2016)); //02/29/2016
        System.out.println(nextDay(30, 11, 2000)); //12/01/2000
        System.out.println(nextDay(31, 5, 2000)); //06/01/2000
        System.out.println(nextDay(5, 5, 2005)); //05/06/2005
        everyOtherLetter("pop"); //pp
        everyOtherLetter("sausagefest"); //suaeet
        excludeFour(8);
        System.out.println(twoAdd(5, 5)); //14
        System.out.println(twoAdd(3, 4)); //9
        countryName();
        consOrVow();

    }
}