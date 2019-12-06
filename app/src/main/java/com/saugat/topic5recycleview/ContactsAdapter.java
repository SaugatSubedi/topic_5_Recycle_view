package com.saugat.topic5recycleview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{
    Context context;
    List<Contacts> contactsList;
    public ContactsAdapter(Context context, List<Contacts> contactsList){
        this.context = context;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView Name, phoneNo;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ima)



        }
    }
}
