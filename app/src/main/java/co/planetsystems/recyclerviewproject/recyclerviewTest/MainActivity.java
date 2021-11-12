package co.planetsystems.recyclerviewproject.recyclerviewTest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

import co.planetsystems.recyclerviewproject.R;
import co.planetsystems.recyclerviewproject.recyclerviewTest.ClientInfo;
import co.planetsystems.recyclerviewproject.recyclerviewTest.ClientInfoAdapter;
import co.planetsystems.recyclerviewproject.retrofit.RetroPostTestingActivity;
import co.planetsystems.recyclerviewproject.retrofit.RetroTestingActivity;

public class MainActivity extends AppCompatActivity {

    private RecyclerView clientInfos;
    private RecyclerView.Adapter adapter;
    Button retrofitTest, postRetrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofitTest = findViewById(R.id.goRetrofit_id);
        postRetrofit = findViewById(R.id.goRetrofit_post_id);

        ArrayList<ClientInfo> clientInfos = getClients();
        this.clientInfos = (RecyclerView) findViewById(R.id.cities);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);

        this.clientInfos.setLayoutManager(mLayoutManager);
        adapter = new ClientInfoAdapter(clientInfos);
        this.clientInfos.setAdapter(adapter);

        retrofitTest.setOnClickListener(go->{
            startActivity(new Intent(this, RetroTestingActivity.class));
        });

        postRetrofit.setOnClickListener(post->{
            startActivity(new Intent(this, RetroPostTestingActivity.class));
        });
    }

    private ArrayList<ClientInfo> getClients() {
        ArrayList<ClientInfo> list = new ArrayList<>();

        list.add(new ClientInfo("Cinque Terre", "Arinda","","","","","","","","","","","","","",""));
        list.add(new ClientInfo("Cinque Terre", "James","","","","","","","","","","","","","",""));
        list.add(new ClientInfo("Cinque Terre", "Jopodjh","","","","","","","","","","","","","",""));
        list.add(new ClientInfo("Cinque Terre", "Commerce","","","","","","","","","","","","","",""));

        return list;
    }
}