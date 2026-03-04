import java.io.File;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) {

        // TODO: Update this with your CSV file path
        File file = new File("src/StateData2020-CDC-Census.csv");

        // TODO: Create an array of Data objects to store data
            Data[] dataList = new Data[100]; // Example size, adjust as needed
            int index = 0; // To keep track of how many rows we loaded


        // TODO: Read file using Scanner
        // - Skip header if needed
        // - Loop through rows
        // - Split each line by commas
        // - Convert text to numbers when needed
        // - Create new Data objects
        // - Add to your array
            try (Scanner scanner = new Scanner(file)) {
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
                while (scanner.hasNextLine() && index < dataList.length) {
                    String line = scanner.nextLine();
                    String[] columns = line.split(",");
                    String state = columns[0];
                    int population = Integer.parseInt(columns[1]);
                    int deaths = Integer.parseInt(columns[6]); // Drug Overdose Deaths Total
                    dataList[index] = new Data(state, population, deaths);
                    index++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }



        // TODO: Call your analysis methods
            double maxValue = findMaxValue(dataList);
            System.out.println("Max value: " + maxValue);
    



        // TODO: Print insights
        // - Number of rows loaded
        // - Sample data points
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question
         System.out.println("Number of rows loaded: " + index);
         if (index > 0) {
             System.out.println("Sample data point: " + dataList[0]);
         }
            double average = computeAverageValue(dataList);
            System.out.println("Average value: " + average);


        // OPTIONAL TODO:
        // Add user interaction:
        // Ask the user what kind of analysis they want to see
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of analysis would you like to see?");
        String choice = scanner.nextLine();
        // Based on user input, call different analysis methods
        
         if (choice.equalsIgnoreCase("max")) {
                System.out.println("Max value: " + findMaxValue(dataList));
            } else if (choice.equalsIgnoreCase("average")) {
                System.out.println("Average value: " + computeAverageValue(dataList));
            } else {
                System.out.println("Invalid choice. Please enter 'max' or 'average'.");
            }
    }

    /**
     * Finds the maximum death value in the dataset.
     * @param dataList the array of Data objects
     * @return the maximum death value
     */
    public static double findMaxValue(Data[] dataList) {
        double max = 0;
        for (Data data : dataList) {
            if (data != null && data.getDeaths() > max) {
                max = data.getDeaths();
            }
        }
        return max;
    }

    /**
     * Computes the average death value in the dataset.
     * @param dataList the array of Data objects
     * @return the average death value
     */
    public static double computeAverageValue(Data[] dataList) {
        double sum = 0;
        int count = 0;
        for (Data data : dataList) {
            if (data != null) {
                sum += data.getDeaths();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}