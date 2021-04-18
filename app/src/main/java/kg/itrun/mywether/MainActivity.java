package kg.itrun.mywether;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView city_name;
    TextView temp_text;
    TextView descr_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city_name = findViewById(R.id.city_name);
        temp_text = findViewById(R.id.temp_text);
        descr_text = findViewById(R.id.descr_text);






        NetworkHelper.getInstance()
                .getService()
                .getCurrentWeather("b96a6f3f18df40ae94a7c47fc96c4339", "ru", "Bishkek")
                .enqueue(new Callback<CurrentWeatherResponse>() {
                    @Override
                    public void onResponse(Call<CurrentWeatherResponse> call, Response<CurrentWeatherResponse> response) {
                      CurrentWeatherItem item = response.body().getData().get(0);
                      city_name.setText(item.getCityName());
                      temp_text.setText(""+item.getTemp());
                      descr_text.setText(item.getWeather().getDescription());

                    }

                    @Override
                    public void onFailure(Call<CurrentWeatherResponse> call, Throwable t) {

                    }
                });


    }
}