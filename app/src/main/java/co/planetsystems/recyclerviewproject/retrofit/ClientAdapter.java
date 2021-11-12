package co.planetsystems.recyclerviewproject.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import co.planetsystems.recyclerviewproject.R;
import co.planetsystems.recyclerviewproject.recyclerviewTest.ClientInfo;

public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.ViewHolder> {
    Context context;
    private List<Client> clients;

    public ClientAdapter(Context context, List<Client> clients) {
        this.context = context;
        this.clients = clients;
    }

    public void setClientsList(List<Client> clientsList) {
        this.clients = clientsList;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_retrofit_test, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Client client = clients.get(position);
        holder.surname.setText(clients.get(position).getClientSurname());
        holder.givenName.setText(clients.get(position).getClientGivenName());
    }

    @Override
    public int getItemCount() {
        if (clients != null) {
            return clients.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView surname;
        public final TextView givenName;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            surname = view.findViewById(R.id.surname_id);
            givenName = view.findViewById(R.id.givenName_id);
        }
    }
}
