package frequentFlyersIdentification;

import java.sql.*;
import java.util.*;

import java.sql.*;
import java.util.*;

public class FrequentFlyerProgram {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/airlineDB";
        String user = "root";
        String password = "root";

        // SQL query to fetch flyer IDs
        String sqlQuery = "SELECT flyerID FROM bookings";

        // Use a HashMap to store frequencies
        Map<Integer, Integer> flyerFrequencies = new HashMap<>();

        try {
            // Establish database connection
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            // Execute the query and get the result set
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Process each flyer ID from the result set
            while (resultSet.next()) {
                int flyerID = resultSet.getInt("flyerID");
                // Update the frequency HashMap
                flyerFrequencies.put(flyerID, flyerFrequencies.getOrDefault(flyerID, 0) + 1);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Sort the HashMap by values to identify the most frequent flyers
        List<Map.Entry<Integer, Integer>> sortedFrequencies = new ArrayList<>(flyerFrequencies.entrySet());
        sortedFrequencies.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print the top 3 most frequent flyers
        System.out.println("Top 3 most frequent flyers:");
        for (int i = 0; i < Math.min(3, sortedFrequencies.size()); i++) {
            Map.Entry<Integer, Integer> entry = sortedFrequencies.get(i);
            System.out.println("Flyer ID: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
