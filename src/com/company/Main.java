package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        /*System.out.println("Введите 122");
        int CryptNum = Scan.nextInt();
        boolean Norm = CryptNum == 12;
        if(Norm)
        {
            System.out.println("Норм");
        }
        else
        {
            System.out.println("Не норм");
        }
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        int j = 0;
        while(j < 10){
            System.out.println(j);
            j++;
        }
        float [] name = new float[]{23f, 45f, 63f};
        System.out.println(name[2]);
        char[][] array = new char[3][2];
        array[2][1] = 'A';
        System.out.println(array[2][1]);
        System.out.println(func(4,5));
        int[] a = readArray();
        for(int i = 0; i< a.length; i++){
            System.out.println("The " + (i+1)+ "'s int is "+a[i]);
        }
        ShowVariableLength(1,5,3,2);
        ShowVariableLength(8,4);*/
        Person NewPerson = new Person();
        System.out.println(NewPerson.height);
    }
    public static int func(int a, int b){
        return a+b;
    }

    public static int[] readArray(){
        int arr[];
        int n;
        Scanner Scan = new Scanner(System.in);
        n = Scan.nextInt();
        arr = new int[n];
        for(int i = 0; i< n; i++)
        {
            arr[i]=Scan.nextInt();
        }
        return arr;

    }

    public static void ShowVariableLength(int ... vars){
        for(int i:vars)
        {
            System.out.println("Next variable - "+i);
        }
    }

}


