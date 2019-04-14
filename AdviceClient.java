package hfad.com.myassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AdviceClient {
    @GET("")
    Call<AdvicePiece> getData();
}
