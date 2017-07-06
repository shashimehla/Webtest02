/**
 * Created by E6500 on 3/07/2017.
 */
//package nz.co.webtest;

public class Printdigits {  //class

    public static void main(String[] args) {

        System.out.println("Print digits 1 to 10");

        //Printdigits test = new Printdigits();
         int i = 0;

         for (i=0;i<=10;i++) {

             System.out.println(i+"\n");
         }
        System.out.println("****Printdigits class execution over****\n");
           }

}

 class PrintEvenNumbers {  //class

    public static void main(String[] args) {

        System.out.println("Print Even numbers between 1 and 30");

        //PrintEvenNumbers test = new PrintEvenNumbers();
        int i = 0;

        while (i<=30) {

            if(i%2==0) {
                System.out.println(i + "\n");

            }
            i++;
        }
        System.out.println("** EVEN NUMBER printing done **");

        String[] Animals = new String[] {"Cat", "Mouse", "dog","cow","buffalo"};
        int j =0;
        do {

                System.out.println(Animals[j]);
                j++;
        } while(j<5);


      //  String[] Animals = { 'Rabbit', 'horse', 'cow', 'buffalo', 'lion', 'snake' };


    }

}

class Motorfeature {  //class

    public static void main(String[] args) {

        if(args.equals("car"))
            System.out.println("Ferrari car");

        else
            System.out.println("U r a bad programmer");


    }
}
