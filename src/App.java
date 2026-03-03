import java.io.File;

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
        File file = new File("data/your_dataset.csv");

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
                    int deaths = Integer.parseInt(columns[2]);
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
             double maxValue = findMaxValue(dataList);
             System.out.println("Max value: " + maxValue);
         } else if (choice.equalsIgnoreCase("average")) {
             double average = computeAverageValue(dataList);
             System.out.println("Average value: " + average);
         } else {     System.out.println("Invalid choice."); }
    }


}