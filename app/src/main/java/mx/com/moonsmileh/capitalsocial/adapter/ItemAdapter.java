package mx.com.moonsmileh.capitalsocial.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import mx.com.moonsmileh.capitalsocial.R;
import mx.com.moonsmileh.capitalsocial.model.Item;

/**
 * Created by moonsmileh on 27/03/17.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private List<Item> items;

    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item item = items.get(position);

        holder.tvTitle.setText(item.getTitle());
        holder.tvDescription.setText(item.getDescription());
        holder.rlImage.setBackgroundResource(item.getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvTitle, tvDescription;
        private final RelativeLayout rlImage;

        public MyViewHolder(View view){
            super(view);
            tvTitle = (TextView) view.findViewById(R.id.textview_item_title);
            tvDescription = (TextView) view.findViewById(R.id.textview_item_description);
            rlImage = (RelativeLayout) view.findViewById(R.id.relativelayout_image);
        }
    }
}
