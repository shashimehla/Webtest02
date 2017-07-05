package nz.co.webtest;

public class City {  //class

    public static void main(String[] args) {

        System.out.println("Hello world");

        City test = new City();
        String country = "New Zealand";
        int i = 0;
        final String question1 = "What is capital of ";


        System.out.println(question1 +country+"?");
        System.out.println("Capital of"+country+"is:" + test.getCapitalCityOf(country));

         country = "Australia";
        System.out.println(question1 +country+"?");
        System.out.println("Capital of"+country+"is:" + test.getCapitalCityOf(country));

    }

    public String getCapitalCityOf(String country) //method
    {
        String capital = "Not found";

        if("New Zealand".equals(country)) {
            capital = "Wellington";
        }
            return capital;
        }
}
