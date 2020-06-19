package mavenPackage;

public final class App {
    static int[] outputRange(int min, int max) {
        // initialize counts of integers and keywords: fizz, buzz, fizzbuzz
        int f = 0;
        int b = 0;
        int fb = 0;
        int in = 0;
        
        for (int i = min; i <= max; i++){
            if (i % 15 == 0){
                System.out.print("fizzbuzz");
                fb++; //increment count of keyword fizzbuzz
            }
            else if (i % 5 == 0){
                System.out.print("buzz");
                b++; //increment count of keyword buzz
            }
            else if (i % 3 == 0){
                System.out.print("fizz");
                f++; //increment count of keyword fizz
            }
            else{
                System.out.print(i);
                in++; //increment count of integer output
            }
            System.out.print(" ");
        }
        int res[] = {f,b,fb,in}; // array of keyword counts *for unit testing*
        return res;
    }
}
