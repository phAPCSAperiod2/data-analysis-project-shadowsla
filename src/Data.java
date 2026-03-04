/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 *
 * Represents health statistics for a single U.S. state from the CDC dataset.
 * Contains state name, population, and drug overdose death totals for analysis.
 *
 * @author Kolion Borden
 * @version 1.0
 */
// 
public class Data {

    // TODO: Add at least 3 private attributes
    // Example:
    // private String name; State name
    // private int population; State population
    // private int deaths; Death to drug overdose total
    
    private String state;
    private int population;
    private int deaths;

    // TODO: Create a constructor that takes all attributes as parameters
    //
    /**
     * Constructor for Data object.
     * @param state the name of the state
     * @param population the population of the state
     * @param deaths the number of drug overdose deaths
     */
    public Data(String state, int population, int deaths) {
        this.state = state;
        this.population = population;
        this.deaths = deaths;
    }

    // TODO: Add getters for attributes you need
    /**
     * Gets the state name.
     * @return the state name
     */
    public String getState() {
        return state;
    }

    /**
     * Gets the state population.
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Gets the number of drug overdose deaths.
     * @return the number of deaths
     */
    public int getDeaths() {
        return deaths;
    }
    // TODO: Add other data analysis methods
    /**
     * Calculates the drug overdose death rate per 100,000 people.
     * @return the death rate per 100,000 population
     */
    public double getDeathRate() {
        if (population == 0) {
            return 0; // Avoid division by zero
        }
        return (double) deaths / population * 100000; // Deaths per 100,000 people
    }

    // TODO: Override toString() to return a readable representation of your object
    /**
     * Returns a string representation of the Data object.
     * @return formatted string with state, population, and deaths
     */
    @Override
    public String toString() {
        return "Data{" +
                "state='" + state + '\'' +
                ", population=" + population +
                ", deaths=" + deaths +
                '}';
    }

}