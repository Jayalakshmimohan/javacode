package file_exercise;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String filePath = "D:\\country,capital.csv";
	    Map<String, String> countryCapitalMap = CountryMapp.loadCsvFileToMap(filePath);
	    char startsWith = 'A'; // no country name start with s actually
	    String outputFile = "D:\\filtered_countries.txt" ;
	    CountryMapp.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
	    System.out.println("Filtered countries have been written to the file.");
	}
	}