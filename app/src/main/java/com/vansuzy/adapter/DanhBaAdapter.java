package com.vansuzy.adapter;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.vansuzy.baigiang21_hoclistviewnangcao.R;
import com.vansuzy.model.DanhBa;

import java.util.List;

/**
 * Created by keeps on 4/21/2017.
 */

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    Activity context;   // Màn hình sử dụng layout này (giao diện này)
    int resource;       // layout cho từng dòng muốn hiển thị (làm theo khách hàng), layout này chính là file item.xml
    List<DanhBa> objects;   // danh sách nguồn dữ liệu muốn hiển thị lên giao diện
    public DanhBaAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater(); // LayoutInflater là một lớp dùng để build 1 layout bình thường trở thành 1 code Java mà Android có thể sử dụng được
        View row = inflater.inflate(this.resource, null);   // this.resource chính là file item.xml. Hàm inflate sẽ biên dịch file layout item.xml trở thành một lớp trong hệ thống, vì vậy tất cả các giao diện trong layout này sẽ thuộc về row.
        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtPhone = (TextView) row.findViewById(R.id.txtPhone);
        ImageButton btnCall = (ImageButton) row.findViewById(R.id.btnCall);
        ImageButton btnSMS = (ImageButton) row.findViewById(R.id.btnSMS);
        ImageButton btnDetail = (ImageButton) row.findViewById(R.id.btnChiTiet);

        final DanhBa danhBa = this.objects.get(position); // trả về danh bạ hiện tại muốn vẽ
        txtTen.setText(danhBa.getTen());
        txtPhone.setText(danhBa.getPhone());

        // Lưu ý: các biến local mà được gọi trong Anomous Listener thì bắt buộc phải khai báo final
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXemChiTiet(danhBa);
            }
        });
        return row;
    }

    private void xuLyXemChiTiet(DanhBa danhBa) {
        Toast.makeText(
                this.context,   // Màn hình đang dùng
                "Bạn chọn: " + danhBa.getTen(),
                Toast.LENGTH_LONG
        ).show();
    }
}
