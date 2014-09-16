

/**
 * Car class
 * 
 * @author Paul B
 * @version 12 Sept 2014
 */
public class Car {
    private double fuelEfficiency; //in mpg
    private double fuelInTank; //in gal
    public Car(double efficiency) {
        // initialise instance variables
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * Reduces fuel in tank based on miles and efficiency
     * @pre     will never runs gas past empty
     * @param    miles driven
     */
    public void drive(double miles)
    {
        // put your code here
        this.fuelInTank -= miles/this.fuelEfficiency;
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void addGas(int gallons)
    {
        // put your code here
        this.fuelInTank += gallons;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public double getGasInTank()
    {
        // put your code here
        return this.fuelInTank;
    }

}
