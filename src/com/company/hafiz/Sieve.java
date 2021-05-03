package com.company.hafiz;

public class Sieve {

    private static int initPrimeOrNotPrimeList[] = new int[100000];


    private static void initSieve(int n){
        int i,j;
        for(i=2;i*i<=n;i++){
            if(initPrimeOrNotPrimeList[i]==0){
                for(j=i*i;j<=n;j=j+i){
                    initPrimeOrNotPrimeList[j]=1;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        initSieve(n);
        return checkPrimeOrNot(n);

    }
    private static boolean  checkPrimeOrNot(int n){
        if(initPrimeOrNotPrimeList[n] ==1 || n<2){
            System.out.println("Not Prime");
            return false;
        }

        else{
            System.out.println("Prime");
            return true;
        }

    }



}