import java.util.Scanner;

public class analyzer {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        data dt = new data();


        while (true){

            System.out.println("enter number (Q to quit): ");

            String input = sc.next(); 

            if (input.equalsIgnoreCase("Q")){

                break;

            }

            double value = Double.parseDouble(input);
            dt.add(value);

        }


        System.out.println( "Average = " + dt.getAverage() );
        System.out.println( "Max = " + dt.getMax() );


    }

}
