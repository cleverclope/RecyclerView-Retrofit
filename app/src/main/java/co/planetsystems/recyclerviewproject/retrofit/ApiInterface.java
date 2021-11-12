package co.planetsystems.recyclerviewproject.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("getClients")
    Call<List<Client>> getClientsNow();

    @POST("registerClient")
    Call<List<Client>> insertClientNow();
}