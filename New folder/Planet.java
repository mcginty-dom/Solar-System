
/**
 *
 * @author 951939
 * FEEDBACK: -No longer going past the line with code
 * -input is now lower case
 */
public class Planet {
    private String PlanetName;
    private double planetMass;
    private double planetDistance;
    
    public Planet(String name, double mass, double distance) {
        setPlanetName(name);
        setMass(mass);
        setDistance(distance);
    }
    
    public void setPlanetName(String name) {
        PlanetName= name;
    }
    
    public void setMass(double mass) {
        planetMass= mass;
    }

    public void setDistance(double distance) {
        planetDistance= distance;
    }
    
    public String getPlanetName() {
        return PlanetName;
    }
    
    public double getMass() {
        double mass= planetMass;
        mass= (double)Math.round(mass*1000d)/1000d;
        return mass;
    }
    
    public double getDistance() {
        double distance=planetDistance;
        distance= (double)Math.round(distance*1000d)/1000d;
        return distance;
    }
    
    public double getOrbitalPeriod() {
        double period= Math.sqrt(planetDistance*planetDistance
                *planetDistance);
        period= (double)Math.round(period*1000d)/1000d;
        return period;
    }
    
    public String toString() {
        return "Planet "+PlanetName+" has a mass of "+getMass()+
                " Earths, is "+getDistance()+"AU from its star, and "+
                "orbits in "+getOrbitalPeriod()+" years";
    }
}
