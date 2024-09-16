import java.util.Scanner;


public class converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //gather first num and base
        System.out.print("Input your number: ");
        int num1 = scan.nextInt();
        int num1Copy = num1;
        System.out.print("Input the base it is in: ");
        int base = scan.nextInt();
        //gather second base
        System.out.print("Please input the base you would like to convert to: ");
        int baseConvert = scan.nextInt();
        System.out.println();


        //converting to base 10
        int base10 = 0; //number converted to base 10
        int length = (int) (Math.log10(num1) + 1); //how many digits
        int expo = 0; //keep tracking of expo
        for (int i = 0; i < length; i++) {
            base10 += ((num1 % 10) * (int) Math.pow(base, expo));
            num1 /= 10;
            expo++;
        }

        //convert to new base
        int remainder;
        String result = "";
        while (base10 > 0) {
            remainder = base10 % baseConvert;
            result = remainder + result; // append remainder to front
            base10 /= baseConvert; // update base10 for next iteration
        }

        System.out.println(num1Copy + " in base " + base + " is equal to " + result + " in base " + baseConvert);
    }
}


