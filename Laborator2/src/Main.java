/*
* 1 Scrieți un program Java care afișează numerele divizibile cu 3 de la 1 la 99.

2 Scrieti un program java care citeste 3 numere de la tastatura si le compara


3
Scrieți o metodă care returnează elementul N al secvenței Fibonacci. N este citit de la tastatura
Exemplu de secventa Fibonacci 1 2 3 5 8
Cum se formeaza secventa Fibonacci:
1 2 (suma anterioarelor doua numere) ...
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cerinta;
        Scanner cerintaScanner = new Scanner(System.in);
        System.out.println("Introduceti numarul exercitiului: ");
        cerinta = cerintaScanner.nextInt();
        //1
        if(cerinta == 1){
            for(int i = 1;i <= 99;i ++){
                if(i % 3 == 0){
                    System.out.println(i);
                }
            }
        }
        //2
        if(cerinta == 2){
            int a,b,c;

            Scanner scanner = new Scanner(System.in);
            a=scanner.nextInt();
            b=scanner.nextInt();
            c=scanner.nextInt();
            if(a > b && a > c){
                if(b > c)
                    System.out.println("a > b > c");
                else
                    System.out.println("a > c > b");
            }
            else if(b > a && b > c){
                if(a > c)
                    System.out.println("b > a > c");
                else
                    System.out.println("b > c > a");
            }
            else if(c > a && c > b){
                if(a > b)
                    System.out.println("c > a > b");
                else
                    System.out.println("c > b > a");
            }
        }
        //3
        else{

        }

    }
}