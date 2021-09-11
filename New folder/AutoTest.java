//Uncomment if using extra tests
//import org.apache.commons.lang3.StringUtils;

/*This is the automatic test class for CS-110 coursework 2. The output of the student's program
 * under test should match the string TARGET_OUTPUT
 */
public class AutoTest {

    static final String TARGET_OUTPUT = "Our System\n"
            + "Planet Mercury has a mass of 0.055 Earths, is 0.387AU from its star, and orbits in 0.241 years\n"
            + "Planet Venus has a mass of 0.815 Earths, is 0.723AU from its star, and orbits in 0.615 years\n"
            + "Planet Earth has a mass of 1.0 Earths, is 1.0AU from its star, and orbits in 1.0 years\n"
            + "Planet Mars has a mass of 0.107 Earths, is 1.52AU from its star, and orbits in 1.874 years\n"
            + "Planet Jupiter has a mass of 317.8 Earths, is 5.2AU from its star, and orbits in 11.858 years\n"
            + "Planet Saturn has a mass of 95.2 Earths, is 9.58AU from its star, and orbits in 29.652 years\n"
            + "Planet Uranus has a mass of 14.5 Earths, is 19.2AU from its star, and orbits in 84.13 years\n"
            + "Planet Neptune has a mass of 17.1 Earths, is 30.05AU from its star, and orbits in 164.728 years\n";

    public static void main(String[] args) {
        SolarSystem ourSystem = new SolarSystem("Our System");

        //Add planets in our solar system
        ourSystem.addPlanet("Mercury", 0.0553, 0.387);
        ourSystem.addPlanet("Venus", 0.815, 0.723);
        ourSystem.addPlanet("Earth", 1.0, 1.0);
        ourSystem.addPlanet("Mars", 0.107, 1.52);
        ourSystem.addPlanet("Jupiter", 317.8, 5.20);
        ourSystem.addPlanet("Saturn", 95.2, 9.58);
        ourSystem.addPlanet("Uranus", 14.5, 19.20);
        ourSystem.addPlanet("Neptune", 17.1, 30.05);

        //Check the output
        if (ourSystem.toString().equals(TARGET_OUTPUT)) {
            System.out.println("Pass!");
        } else {
            System.out.println("Fail!\n*****");
            System.out.println("Expected output:\n");
            System.out.println(TARGET_OUTPUT);
            System.out.println("\n\nActual output:\n");
            System.out.println(ourSystem.toString());
            // Uncomment if using extra tests*/
            /*System.out.println("\n\nDifferences:");
            System.out.println(StringUtils.difference(ourSystem.toString(),
            TARGET_OUTPUT));*/
        }

    }
}
