package co.planetsystems.recyclerviewproject.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import co.planetsystems.recyclerviewproject.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetroTestingActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<Client> clients;
    ClientAdapter clientAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retro_testing);

        clients = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.retrofit_test_recyclerview_id);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        clientAdapter = new ClientAdapter(getApplicationContext(),clients);
        recyclerView.setAdapter(clientAdapter);

        init();

    }

    void init() {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Client>> call = apiService.getClientsNow();

        call.enqueue(new Callback<List<Client>>() {
            @Override
            public void onResponse(Call<List<Client>> call, Response<List<Client>> response) {
                clients = response.body();
                Log.d("TAG","Response = "+clients);
                clientAdapter.setClientsList(clients);
            }

            @Override
            public void onFailure(Call<List<Client>> call, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }
        });
}
}