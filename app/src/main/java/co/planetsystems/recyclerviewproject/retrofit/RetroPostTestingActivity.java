package co.planetsystems.recyclerviewproject.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

import co.planetsystems.recyclerviewproject.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetroPostTestingActivity extends AppCompatActivity {
    TextInputEditText txtclientSurname, txtclientGivenName, txtclientDateOfBirth, txtclientNin, txtclientGender, txtclientVillage, txtclientParish, txtclientSCounty, txtclientCounty, ctxtlientDistrict, txtclientNationality, txtclientPhone, txtclientPassword,txtclientComfirmPass, txtclientEmail;
    String clientSurname, clientGivenName, clientDateOfBirth, clientNin, clientGender, clientVillage, clientParish, clientSCounty, clientCounty, clientDistrict, clientNationality, clientPhone, clientPassword, clientComfirmPass, clientEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retro_post_testing);

        txtclientSurname = findViewById(R.id.surname_id);
        txtclientGivenName  = findViewById(R.id.givenName_id);
        txtclientDateOfBirth = findViewById(R.id.dob_id);
        txtclientNin= findViewById(R.id.nin_id);
        txtclientGender = findViewById(R.id.gender_id);
        txtclientVillage = findViewById(R.id.village_id);
        txtclientParish = findViewById(R.id.parish_id);
        txtclientSCounty = findViewById(R.id.subcounty_id);
        txtclientCounty = findViewById(R.id.county_id);
        ctxtlientDistrict = findViewById(R.id.district_id);
        txtclientNationality = findViewById(R.id.nationality_id);
        txtclientPhone = findViewById(R.id.phone_id);
        txtclientPassword = findViewById(R.id.password_id);
        txtclientComfirmPass = findViewById(R.id.comfirm_id);
        txtclientEmail = findViewById(R.id.email_id);

        clientSurname = txtclientSurname.getText().toString();
        clientGivenName = txtclientGivenName.getText().toString();
        clientDateOfBirth = txtclientDateOfBirth.getText().toString();
        clientNin = txtclientNin.getText().toString();
        clientGender = txtclientGender.getText().toString();
        clientVillage = txtclientVillage.getText().toString();
        clientParish = txtclientParish.getText().toString();
        clientSCounty = txtclientSCounty.getText().toString();
        clientCounty = txtclientCounty.getText().toString();
        clientDistrict = ctxtlientDistrict.getText().toString();
        clientNationality = txtclientNationality.getText().toString();
        clientPhone = txtclientPhone.getText().toString();
        clientPassword = txtclientPassword.getText().toString();
        clientComfirmPass = txtclientComfirmPass.getText().toString();
        clientEmail = txtclientEmail.getText().toString();

    }

    void postDataNow(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Client>> call = apiService.insertClientNow();

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