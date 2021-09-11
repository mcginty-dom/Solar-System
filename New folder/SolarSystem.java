
import java.util.ArrayList;


/**
 *
 * @author 951939
 * FEEDBACK: -No longer going past the line with code
 * -input is now lower case
 */
public class SolarSystem {
    private ArrayList<Planet> planetList= new ArrayList<>();
    private String SystemName;
    
    public SolarSystem(String name) {
        SystemName= name;
    }
    
    public void addPlanet(String name, double mass, double distance) {
        planetList.add(new Planet(name,mass,distance));
    }
    
    public String toString(){
        String VString= "Our System\n";
        for(Planet i: planetList) {
            VString+=i+"\n";
        }
        return VString;
    }
    
    public void printTable(){
        System.out.println("List name: "+SystemName+" \n");
        System.out.println("Name \tMass \tDistance \tPeriod (years)");
        for(Planet i:planetList) {
            System.out.println(i.getPlanetName()+" \t"+
                    Math.round((i.getMass())*1000d)/1000d+" \t"+
                    Math.round((i.getDistance())*1000d)/1000d+"\t\t"+
                    Math.round((i.getOrbitalPeriod())*1000d)/1000d+"\n");
        }
    }
    
}
