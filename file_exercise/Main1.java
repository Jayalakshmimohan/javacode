package file_exercise;

import java.util.Map;

public class Main1 {
//    public static void main(String[] args) {
//        String filePath = "D:\\country,capital.csv"; // Change to the path of your CSV file
//        Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
//        char startsWith = 'M'; // Example: Filter countries starting with 'A'
//        String outputFile = "D:\\filtered_countries.txt"; // Change to desired output file path
//        Countrymap.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
//        System.out.println("Filtered countries have been written to the file.");
//    }
	public static void main(String[] args) {
		String filePath = "D:\\country,capital.csv"; // Change to the path of your CSV file
		Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
		for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
			System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
		}
	}
}
