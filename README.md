[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22617051)
# AP CSA Mini‑Project: Data Analysis with Arrays & File Input
### Using CSV Files • Arrays of Objects • Algorithms • Data Ethics & Quality

---

## 📌 Project Overview
In this mini‑project, you will choose a dataset (CSV file), design a **custom class** to represent each row, read the dataset using the **Scanner** class, store all data as **objects** in an ArrayList or array, and answer a **guiding question** by analyzing the data.

This project reinforces:

- Arrays & ArrayLists  
- File input with `Scanner`  
- Class design (attributes, constructors, methods)  
- Algorithms (min, max, average, filtering)  
- Data quality & ethics  
- Documentation using **Javadoc**  
- Creating a **UML class diagram**  

By the end, you will produce insights and answer your original question using your program.

---

## 🎯 Your Task
You will:

1. **Choose a dataset** (teacher provided or public).  
2. **Write a guiding question** for your dataset.  
3. **Design a Java class** with ≥ 3 attributes.  
4. **Use `Scanner` to read a CSV file**, parse rows, and construct objects.  
5. **Store all objects** in an array or ArrayList.  
6. **Analyze the dataset** using algorithms you create.  
7. **Print insights** and answer your guiding question.  
8. **Document your code** with Javadoc.  
9. **Create a UML class diagram** representing your custom class.  

Optional stretch challenges are included at the bottom!

---

## 📁 Project Structure
Your repository should follow this structure:
```
/src
    App.java
    Data.java
    StateData2020-CDC-Census.csv
/bin
    (compiled .class files)
README.md   ← this file
UML_Diagram.png (or UML_Diagram.pdf)
```

---

## 🧩 Step 1 — Choose Your Dataset

**Dataset Name:** StateData2020-CDC-Census  
**Source / Link:** CDC & Census.gov (2016)

**What this dataset contains (2–3 sentences):**  
This dataset contains public health statistics for all 50 U.S. states, the District of Columbia, and Puerto Rico from 2016. It includes population data from the Census Bureau and health-related statistics from the CDC, including death rates from firearms and drug overdoses. The dataset allows analysis of mortality patterns and public health challenges across different states.

---

## ❓ Step 2 — Write Your Guiding Question

Your guiding question should be something you can answer using your dataset.

**My guiding question:**  
Which states have the highest and lowest drug overdose death totals, and what is the average number of drug overdose deaths across all states?

Examples:

- "Which Pokémon has the highest HP?"  
- "What is the average life expectancy in this dataset?"  
- "Which state had the highest vaccination rate?"  

---

## 🧱 Step 3 — Design Your Class

You must create a class that represents **one row** of your dataset.

### ✔ Your class must include:

- **At least 3 private attributes**  
- **A constructor** that takes all attributes as parameters  
- **Getter methods** for attributes you plan to analyze  
- **`toString()`** for easy printing  
- Any additional analysis/helper methods as needed  

### ✏ Your Class Design

**Class Name:** `Data`

**Attributes:**
```java
private String state;              // State name
private int population;            // State population (2016 Census)
private int deaths;                // Drug overdose death total (2016)
```

**Methods:**
- `Data(String state, int population, int deaths)` - Constructor
- `getState()` - Returns state name
- `getPopulation()` - Returns population
- `getDeaths()` - Returns drug overdose deaths
- `getDeathRate()` - Calculates deaths per 100,000 people
- `toString()` - Returns formatted data representation

---

## 📥 Step 4 — Read Your CSV File Using Scanner

In `App.java`, you must:

- Create a `File` object  
- Use `Scanner` to read the file  
- Skip the header row (if needed)  
- Read each line  
- Split by commas using `.split(",")`  
- Trim whitespace  
- Parse numbers using `Integer.parseInt()` or `Double.parseDouble()`  
- Construct objects  
- Add them to an ArrayList or array  

### Column → Attribute Map

| Attribute Name | CSV Column Name | Column Index # | Notes |
|----------------|------------------|----------------|-------|
| state | STATE | 0 | State name |
| population | Population in 2016 from census.gov | 1 | 2016 Census data |
| deaths | Drug overdose deaths total | 6 | Total deaths in 2016 |

---

## 📊 Step 5 — Analyze Your Data

You must write **at least two algorithms** to analyze your dataset.

### Required: Choose 2 or more algorithms
- [x] Minimum value of attribute  
- [x] Maximum value of attribute  
- [x] Average of attribute  

**Algorithms I will implement:**

1. Find the maximum (state with highest drug overdose deaths)  
2. Calculate the average drug overdose deaths across all states

Optional extras:  
- Sorting  
- Top/bottom N items  
- Grouping by category  
- Comparison between groups  

---

## 🧠 Step 6 — Insights & Answer to Your Question

After analyzing your objects, print:

- ✔ How many rows were loaded  
- ✔ Your algorithm results  
- ✔ A clear answer to your guiding question  

**My findings:**  
- **52 rows loaded** (50 states + District of Columbia + Puerto Rico)
- **Maximum drug overdose deaths:** 4,728 deaths in Florida
- **Average drug overdose deaths:** approximately 1,224 deaths per state
- **Sample state:** Alabama had 756 drug overdose deaths with a population of 4,860,545

**My answer to the guiding question:**  
Florida had the highest drug overdose deaths with 4,728 total deaths in 2016, while the average across all states was approximately 1,224 deaths. This shows significant variation in drug overdose mortality rates across different states, with some states facing substantially higher public health challenges than others.

---

## 📝 Step 7 — Documentation Requirements

### ✔ Javadoc Comments
You MUST use Javadoc for:

- Every **class**  
- Every **method**  
- Every **parameter**  
- Every **return value**  

Example:
```java
/**
 * Returns the highest HP among all Pokémon.
 * @param list the ArrayList of Pokémon objects
 * @return highest HP value in the dataset
 */
public static int findMaxHP(ArrayList<Pokemon> list) {
    // implementation
}
```

### ✔ UML Class Diagram
Add a UML diagram showing:

- Class name
- Attributes
- Methods
- Visibility (private/public)

Save as `UML_Diagram.png` or `.pdf` in the repo.

---

## 🛡 Step 8 — Data Ethics & Quality Reflection
Write a short reflection (3–5 sentences):

- What data-quality issues did you find?
- Could your dataset be biased?
- How might incomplete or inaccurate data affect results?
- How trustworthy are your insights?

**My reflection:**  
The dataset is from 2016, so it is now outdated and may not reflect current drug overdose trends. Puerto Rico has missing values (-1) for several health metrics, which creates a data-quality issue if included in analysis. The data sources (Census and CDC) are reliable government agencies, but there is potential regional variation in how deaths are reported and classified. States with larger populations may have higher total death counts simply due to population size, rather than higher death rates—which is why calculating death rates per 100,000 people is important. The snapshot nature of one year means we cannot identify trends over time, so conclusions about which states "have" problems is limited.

---

## ⭐ Optional Challenges (Not Required but Fun!)

### 🔹 User Input
Allow the user to choose:

- Which attribute to analyze
- Which category to filter
- What statistics they want to calculate

### 🔹 Additional Algorithms

- Sorting objects
- Multiple comparisons
- Generating summaries
- Exporting results to a file

### 🔹 Data Cleaning

- Skip rows with missing values
- Detect invalid entries
- Normalize units

---

## ✅ Submission Checklist

- [x] Dataset selected
- [x] Guiding question written
- [x] Class created with ≥3 attributes
- [x] File reading implemented
- [x] ArrayList/array of objects created
- [x] At least 2 analysis algorithms implemented
- [x] Findings printed
- [x] Javadoc comments added
- [ ] UML diagram included
- [x] Reflection completed
- [x] Code compiles & runs

---

Good luck, and have fun exploring your dataset! 🚀  
You're now doing real data analysis — just like professional software engineers.
