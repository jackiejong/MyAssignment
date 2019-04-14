package hfad.com.myassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLoad (View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.adviceslip.com/advice")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        AdviceClient service = retrofit.create(AdviceClient.class);
        Call<AdvicePiece> call = service.getData();

        call.enqueue(new Callback<AdvicePiece>() {
            @Override
            public void onResponse(Call<AdvicePiece> call, Response<AdvicePiece> response) {
                loadDataList(response.body());
            }

            @Override
            public void onFailure(Call<AdvicePiece> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Unable to load users", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void loadDataList(AdvicePiece advicePieceInput) {
        TextView tv = findViewById(R.id.tv);
        tv.setText(advicePieceInput.getSlip().getAdvice());
    }


}
