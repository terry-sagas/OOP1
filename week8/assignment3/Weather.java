package week8.assignment3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class Weather {
    private static final String API_KEY = "f220bf7c9ae454a5f5e796abd6f059f6";
    private static final String API_URL_OSHAWA = "https://api.openweathermap.org/data/2.5/weather?lat=43.8975&lon=78.8656&appid=";
    private static final String API_URL_TORONTO = "https://api.openweathermap.org/data/2.5/weather?lat=43.6532&lon=79.3832&dt=1643803200&appid=";
    private static final String API_URL_SCARBOROUGH = "https://api.openweathermap.org/data/2.5/weather?lat=43.7731&lon=79.2579&dt=1643803200&appid=";
    private static final String API_URL_MARKHAM = "https://api.openweathermap.org/data/2.5/weather?lat=43.8561&lon=79.3370&dt=1643803200&appid=";
    private static final String API_URL_VAUHAN = "https://api.openweathermap.org/data/2.5/weather?lat=43.5890&lon=79.4982&dt=1643803200&appid=";
    private static final String API_URL_MISSISSAUGA = "https://api.openweathermap.org/data/2.5/weather?lat=43.595310&lon=79.6441&dt=1643803200&appid=";
//https://api.openweathermap.org/data/3.0/onecall/timemachine?lat=39.099724&lon=-94.578331&dt=1643803200&appid={API key}
    public static void main(String[] args) throws Exception {
        // URLS for the places
        URL[] urls = {
            new URL(API_URL_OSHAWA + API_KEY),
            new URL(API_URL_TORONTO + API_KEY),
            new URL(API_URL_SCARBOROUGH + API_KEY),
            new URL(API_URL_MARKHAM + API_KEY),
            new URL(API_URL_VAUHAN + API_KEY),
            new URL(API_URL_MISSISSAUGA + API_KEY)
        };
        // array for the names
        String[] areas = {"OSHAWA", "TORONTO", "SCARBOROUGH", "MARKHAM", "VAUHAN", "MISSISSAUGA"};
        // array for the temps
        double[] temps = new double[6];
        // Going through each url
        for (int i = 0; i < urls.length; i++) {
            HttpURLConnection connection = (HttpURLConnection) urls[i].openConnection();

            // Set the request type to GET.
            connection.setRequestMethod("GET");
    
            // Send the request and get the response code.
            int responseCode = connection.getResponseCode();
            //System.out.println("Response Code: " + responseCode);
    
            // If the request was successful (response code 200),
            // read the input stream and print it.
            if(responseCode == 200){
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
    
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
    
                // Extract temperature from JSON response manually
                String jsonResponse = response.toString();
    
                // Find the index of "temp" key in the response
                int tempIndex = jsonResponse.indexOf("\"temp\"");
                //int nameIndex = jsonResponse.indexOf("\"name\"");
    
                // Extract the substring starting from the index of "temp" to the next comma
                String tempSubstring = jsonResponse.substring(tempIndex);
                //String nameSubstring = jsonResponse.substring(nameIndex);
                // Find the index of the first occurrence of a comma after "temp"
                int commaIndexTemp = tempSubstring.indexOf(",");
                //int commaIndexName = tempSubstring.indexOf(",");
                // Extract the temperature substring containing the value
                String temperatureString = tempSubstring.substring(7, commaIndexTemp);
                //String nameString = nameSubstring.substring(7, commaIndexName);
                // Convert temperature string to double and from Kelvin to Celsius
                temps[i] = (Double.parseDouble(temperatureString) - 271.15);
                //areas[i] = nameString;
                
               
                
    
                // Print the response
                System.out.println(areas[i] + ": " + temps[i]);

    
            }
            else
            {
                // Printing error
                System.out.println("error");
            }

        }
        // Finding the highest number
        int maxIndex = 0;
        double maxTemp = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > maxTemp) {
                maxTemp = temps[i];
                maxIndex = i;
            }
        }
        // Finding lowest number
        double minTemp = temps[0];
        int minIndex = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < minTemp) {
                minTemp = temps[i];
                minIndex = i;
            }
        }
        // Displaying info
        System.out.println("------------------------------------");
        System.out.println("Highest Temp: " + areas[maxIndex] + " " + temps[maxIndex]);
        System.out.println("Lowest Temp: " + areas[minIndex] + " " + temps[minIndex]);
        System.out.println("------------------------------------");
        }

}
