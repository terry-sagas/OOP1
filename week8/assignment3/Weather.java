package week8.assignment3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class Weather {
    private static final String API_KEY = "";
    private static final String API_URL_OSHAWA = "http://api.openweathermap.org/data/3.0/onecall/timemachine?lat=39.099724&lon=94.578331&dt=1643803200&appid=";
    private static final String API_URL_TORONTO = "http://api.openweathermap.org/data/3.0/onecall/timemachine?lat=43.651070&lon=79.347015&dt=1643803200&appid=";
    private static final String API_URL_SCARBOROUGH = "http://api.openweathermap.org/data/3.0/onecall/timemachine?lat=43.777702&lon=79.233238&dt=1643803200&appid=";
    private static final String API_URL_MARKHAM = "http://api.openweathermap.org/data/3.0/onecall/timemachine?lat=43.856098&lon=79.337021&dt=1643803200&appid=";
    private static final String API_URL_VAUHAN = "http://api.openweathermap.org/data/3.0/onecall/timemachine?lat=43.837208&lon=79.508278&dt=1643803200&appid=";
    private static final String API_URL_MISSISSAUGA = "http://api.openweathermap.org/data/3.0/onecall/timemachine?lat=43.595310&lon=79.640579&dt=1643803200&appid=";
//https://api.openweathermap.org/data/3.0/onecall/timemachine?lat=39.099724&lon=-94.578331&dt=1643803200&appid={API key}
    public static void main(String[] args) throws Exception {
        URL[] urls = {
            new URL(API_URL_OSHAWA + API_KEY),
            new URL(API_URL_TORONTO + API_KEY),
            new URL(API_URL_SCARBOROUGH + API_KEY),
            new URL(API_URL_MARKHAM + API_KEY),
            new URL(API_URL_VAUHAN + API_KEY),
            new URL(API_URL_MISSISSAUGA + API_KEY)
        };
        String[] areas = {"OSHAWA: ", "TORONTO: ", "SCARBOROUGH: ", "MARKHAM: ", "VAUHAN: ", "MISSISSAUGA: "};
        double[] temps = new double[6];
        // Create a HttpURLConnection object from the Url object.
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
    
                // Extract the substring starting from the index of "temp" to the next comma
                String tempSubstring = jsonResponse.substring(tempIndex);
    
                // Find the index of the first occurrence of a comma after "temp"
                int commaIndex = tempSubstring.indexOf(",");
    
                // Extract the temperature substring containing the value
                String temperatureString = tempSubstring.substring(7, commaIndex);
    
                // Convert temperature string to double and from Kelvin to Celsius
                temps[i] = (Double.parseDouble(temperatureString) - 273.15) * 9/5 + 32;
    
                // Print temperature
                
    
                // Print the response
                System.out.println(areas[i] + temps[i]);

    
            }
            else{
                System.out.println("error");
            }

        }
        int maxIndex = 0;
        double maxTemp = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > maxTemp) {
                maxTemp = temps[i];
                maxIndex = i;
            }
        }
        
        double minTemp = temps[0];
        int minIndex = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < minTemp) {
                minTemp = temps[i];
                minIndex = i;
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Highest Temp: " + areas[maxIndex] + temps[maxIndex]);
        System.out.print("Lowest Temp: " + areas[minIndex] + temps[minIndex]);
        System.out.println("------------------------------------");
        }

}