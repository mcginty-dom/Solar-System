
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author 951939
 * FEEDBACK: -No longer going past the line with code
 * -input is now lower case
 */
public class FantasySolarSystem {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the name of the solar system: ");
        String SSName= input.nextLine();
        SolarSystem listOfPlanets= new SolarSystem(SSName);
        boolean isFinished= false;
        System.out.println("Now enter planet names - "
                + "type 'done' to finish");
        while (!isFinished){
            System.out.print("Enter name: ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("done")) {
                isFinished= true;
            } else {
                Random rnd= new Random();
                double mass= rnd.nextDouble()*10;
                mass= (double)Math.round(mass*1000d)/1000d;
                double distance= rnd.nextDouble()*5;
                distance= (double)Math.round(distance*1000d)/1000d;
                listOfPlanets.addPlanet(name,mass,distance);
            }
            //
        }
        System.out.println(listOfPlanets);
        listOfPlanets.printTable();
   } 
}
