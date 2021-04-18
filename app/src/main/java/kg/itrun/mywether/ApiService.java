package kg.itrun.mywether;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/v2.0/current")
    public Call<CurrentWeatherResponse> getCurrentWeather
            (@Query("key") String key,
             @Query("lang") String lang,
             @Query("city") String city
            );


}
