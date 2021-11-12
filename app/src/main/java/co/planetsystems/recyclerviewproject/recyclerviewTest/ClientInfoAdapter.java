package co.planetsystems.recyclerviewproject.recyclerviewTest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.planetsystems.recyclerviewproject.R;

public class ClientInfoAdapter extends RecyclerView.Adapter<ClientInfoAdapter.ViewHolder> {

    private ArrayList<ClientInfo> clientInfos;
    private ClientInfoAdapter clientInfoAdapter;

    public ClientInfoAdapter(ArrayList<ClientInfo> clientInfos) {
        this.clientInfos = clientInfos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.itrm_city, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ClientInfo clientInfo = clientInfos.get(position);
        holder.surname.setText(clientInfos.get(position).getClientSurname());
        holder.givenName.setText(clientInfos.get(position).getClientGivenName());
    }

    @Override
    public int getItemCount() {
        if (clientInfos != null) {
            return clientInfos.size();
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
            surname = view.findViewById(R.id.name);
            givenName = view.findViewById(R.id.address);
        }
}
}
