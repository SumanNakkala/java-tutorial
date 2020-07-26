package com.suman.loop.example;

public class MyNumber {

   private  int number;


   public MyNumber(int number){

       this.number = number;
   }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean checkForPrime()
    {
        boolean isPrime = false;

        int c = this.number;

        for (int i = 2 ; i< c-1 ;i++)
        {
            System.out.println(" Chevking if number is dviisble by " + i) ;
            if(c%i ==0)
            {

                isPrime = true;
                break; // We want to break the loop so using break
            }
        }

        if(isPrime)
        {
            return false;
        }
        else{
            return true;
        }


    }

}
