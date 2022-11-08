public class Harshad {
    //Recursive Step
    public static int sum(int number){

        if(number >= 0 && number <= 9){
            return number;
        }

        int newNum = number/10;

        return sum(newNum) + (number % 10);
    }
    
    public static boolean isHarshad(int number){
        if(number % sum(number) == 0){
            return true;
        }

        return false;
    }
}
