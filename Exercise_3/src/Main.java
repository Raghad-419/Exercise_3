import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Question 1 (Fizz And Buzz)
        for(int i=1 ; i<=100 ; i++){

            if(i%3 ==0 && i%5==0 ){
                System.out.println("FizzBuzz");
            }else
                if(i%3==0){
                 System.out.println("Fizz");
             }else
                 if(i%5==0){
                 System.out.println("Buzz");
             }
                 else System.out.println(i);
        }
        //*******************************************************************88
        //Question 2 (Revers String)

        System.out.println("Please enter any String");
        String str = input.nextLine();

        String revers="" ;
        char ch = 0;

        for(int i=0 ; i< str.length() ; i++)
        { ch = str.charAt(i);
        revers = ch+revers;
        }
        System.out.println(revers);

        //*******************************************************
       // Question 3 (Factorial)

        System.out.println("Please enter any number");
        int num = input.nextInt();
        int factorial =1;


        while (num>0){
            factorial =factorial*num;
            num=num-1;
        }
        System.out.println(factorial);

        //******************************************************************
        //Question 4

        System.out.println("Please enter first number");
        int num1 = input.nextInt();
        System.out.println("Please enter second number");
        int num2 = input.nextInt();

        int result=1;

        for (int i = 0 ; i <num2 ; i++) {
            result =num1*result;
        }
        System.out.println(num1 +" raised to the power of "+num2 +" = "+result);

//************************************************************************************
    //    Question 5 (add and even numbers)

         int num ;
         int odd =0;
         int even =0 ;
            do {
                     System.out.println("Please enter numbers or 0 to exit");
                      num = input.nextInt();

                      if(num%2==0){
                          even=even+num;
                      }else
                         odd=odd+num;

                        }while(num!=0);
        System.out.println("The sum of odd numbers= "+odd+ "\nThe sum of even numbers = "+even);

       // ************************************************************************************
      //  Question 6 (Prime numbers)

        System.out.println("please enter number");
        int num = input.nextInt();

        if(num==1){
            System.out.println(num+" is not prime number.");
            return;}

        for (int i = 2; i <= num ; i++) {
            if (num % i == 0) {
                System.out.println("The number " + num + " is not prime number");
                break;}
            else
                System.out.println(num + " is prime number");
            break;
        }

//************************************************************************************
  //      Question 7 (weeks and days )

        int weaks=0 ;
        int days =0 ;
        for (int i = 1; i <=4; i++) {
            System.out.println("Weak"+ i);

            for (int j = 1; j <=7; j++) {
                System.out.println("Day"+ j );
            }

        }

//************************************************************************************
        //Question 8 (Palindrome )

        System.out.println("Please enter word");
        String word = input.nextLine();
        int i=0;
        String revers ="";
        while (i<word.length()){
        revers = word.charAt(i)+revers;
        i++;
        }
        if (word.equalsIgnoreCase(revers)){
            System.out.println("The word "+word+" is palindrome");
        }else System.out.println("The word "+word+" is not palindrome");



    }



    }
