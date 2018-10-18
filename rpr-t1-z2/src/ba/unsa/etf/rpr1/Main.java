package ba.unsa.etf.rpr1;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){

        int suma=0,cifra=0;
        do{

            cifra=n%10;
            n/=10;
            suma+=cifra;


        }while(n>0);
        return suma;
    }

    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj n");
        int n=ulaz.nextInt();

        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0) System.out.print(i+" ");
        }

    }
}
