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
    public Data(String state, int population, int deaths) {
        this.state = state;
        this.population = population;
        this.deaths = deaths;
    }

    // TODO: Add getters for attributes you need
    public String getState() {
        return state;
    }
    public int getPopulation() {
        return population;
    }
    public int getDeaths() {
        return deaths;
    }
    // TODO: Add other data analysis methods
    public double getDeathRate() {
        if (population == 0) {
            return 0; // Avoid division by zero
        }
        return (double) deaths / population * 100000; // Deaths per 100,000 people
    }

    // TODO: Override toString() to return a readable representation of your object
    @Override
    public String toString() {
        return "Data{" +
                "state='" + state + '\'' +
                ", population=" + population +
                ", deaths=" + deaths +
                '}';
    }

}