package java_week_4_writinghw_humaira;

import java.util.Scanner;

public class P8_SymbolTriangle {

    public static void symbolTriangle(int n){
        for(int i = 0; i<= n; i++){
            for(int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration to read input from the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        symbolTriangle(scanner.nextInt());
        //closing scanner object
        scanner.close();
    }
}
