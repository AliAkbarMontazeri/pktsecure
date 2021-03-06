package com.example.rangg.pktsecure.Adapter;

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rangg.pktsecure.Model.KategoriAduanModel;
import com.example.rangg.pktsecure.R;

import java.util.List;

    public class KategoriAduanSpinnerAdapter extends BaseAdapter {
        private LayoutInflater layoutInflater;
        private List<KategoriAduanModel> listData;
        private Context context;

        public KategoriAduanSpinnerAdapter(Context context, List<KategoriAduanModel> listData) {
            this.context = context;
            layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.listData = listData;
        }
        @Override
        public int getCount() {
            return listData.size();
        }
        @Override
        public Object getItem(int position) {
            return (KategoriAduanModel)listData.get(position);
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder spinnerHolder;
            if(convertView == null){
                spinnerHolder = new ViewHolder();
                convertView = layoutInflater.inflate(R.layout.kategori_aduan, parent, false);
                spinnerHolder.spinnerItemList = (TextView)convertView.findViewById(R.id.spinner_list_item);
                convertView.setTag(spinnerHolder);
            }else{
                spinnerHolder = (ViewHolder)convertView.getTag();
            }
            spinnerHolder.spinnerItemList.setText(listData.get(position).getKategori());
            return convertView;
        }
        class ViewHolder{
            TextView spinnerItemList;
        }
    }

