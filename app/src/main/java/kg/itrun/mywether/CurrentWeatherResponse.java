package kg.itrun.mywether;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CurrentWeatherResponse {
    @SerializedName("data")
    private List<CurrentWeatherItem> data;

    @SerializedName("count")
    private int count;

    public List<CurrentWeatherItem> getData() {
        return data;
    }

    public int getCount() {
        return count;
    } // счет

}
