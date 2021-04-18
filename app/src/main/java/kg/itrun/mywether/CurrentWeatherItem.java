package kg.itrun.mywether;

import com.google.gson.annotations.SerializedName;

public class CurrentWeatherItem {

    @SerializedName("country")
    private String cityName;
    @SerializedName("temp")
    private float temp;
    @SerializedName("wind")
    private String windDir;
    @SerializedName("speed")
    private float windSpeed;
    @SerializedName("sunrise")
    private String sunrise;
    @SerializedName("sunset")
    private String sunset;
    @SerializedName ("weather")
    private Weather weather;

    public String getCityName() {
        return cityName;
    }

    public float getTemp() {
        return temp;
    }

    public String getWindDir() {
        return windDir;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public Weather getWeather() {
        return weather;
    }
}

    class Weather {
        @SerializedName("description")
        private String description;

        public String getDescription() {
            return description;
        }
    }