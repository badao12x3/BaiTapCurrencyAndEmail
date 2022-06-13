package com.example.email20194041;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MessageAdapter.MessageAdapterListener {
    private List<Message> messages = new ArrayList<>();
    private RecyclerView recyclerView;
    private MessageAdapter mAdapter;
    private ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messages.add(new Message(1, "ShopBack VN", "Hoàn tiền của bạn đã được Xác nhận!", "Hoàn tiền của bạn đã được xác nhận và chuyển vào số dư khả dụng!", "11:03 PM", false, false));
        messages.add(new Message(2, "Viện Huyết học - Truyền máu", "Google Alert - android", "Now android supports multiple voice recogonizatio", "10:45 AM", false, false));
        messages.add(new Message(3, "Viblo Newsletter", "Viblo - Newsletter (June 7th - June 13rd)", "Toastr là một thư viện Javascript dùng cho việc hiển thị các thông báo một cách độc lập. Để dùng toastr bắt buộc phải có Jquery. 1. Cài đặt", "10:30 AM", false, true));
        messages.add(new Message(4, "Toluna", "Nói cho chúng tôi biết suy nghĩ của bạn", "Xin chào Phạm văn hân. Là một thành viên của Toluna, chúng tôi đánh giá cao ý kiến của bạn. Hãy tham gia khảo sát ngay hôm nay để nhận", "1:30 AM", false, false));
        messages.add(new Message(5, "Shopee", "Đơn hàng #2206065GKWT61J đã giao hàng thành công", "Xin chào badao12x3, Đơn hàng #2206065GKWT61J của bạn đã được giao thành công ngày 10/06/2022.", "12 thg 5", false, false));
        messages.add(new Message(6, "Lazada Vietnam", "Đơn hàng 355843347360996 đã được giao thành công_Order has been delivered", "Lazada đã giao cho bạn đầy đủ với các sản phẩm được liệt kê bên dưới theo đơn hàng #355843347360996 của bạn, Lazada hi vọng bạn hài lòng với các sản phẩm này!", "10 thg 5", false, true));
        messages.add(new Message(7, "Google Alerts", "Google Alert - android", "Now android supports multiple voice recogonizatio", "9 thg 5", false, false));
        messages.add(new Message(8, "Adobe", "Welcome to Adobe", "Now android supports multiple voice recogonizatio", "8 thg 5", false, true));
        messages.add(new Message(9, "Apple", "Xác nhận đăng ký của bạn", "Xin chào Phạm Hân, Email này xác nhận nâng cấp gói dung lượng của bạn:", "3 thg 5", false, false));
        messages.add(new Message(10, "Timo", "Muốn xem bạn đã tiêu tiền vào những gì?", "PHAM VAN HAN thân mến, Hay chuyển tiền, giao dịch qua ngân hàng mà không biết đến tính năng này thì thật đáng tiếc.", "1 thg 5", false, false));
        messages.add(new Message(11, "VietnamWorks", "Google Alert - android", "Now android supports multiple voice recogonizatio", "27thg 5", false, true));
        messages.add(new Message(12, "Aaron", "Google Alert - android", "Now android supports multiple voice recogonizatio", "25 thg 5", false, false));
        messages.add(new Message(13, "Momo", "Google Alert - android", "Now android supports multiple voice recogonizatio", "23 thg 5", false, false));
        messages.add(new Message(14, "EDUCBA", "Welcome to EDUCBA", "Congratulations! You have successfully registered at EDUCBA.", "22 thg 5", false, false));

        recyclerView = (RecyclerView) findViewById(R.id.rcv_data);

        mAdapter = new MessageAdapter(this, messages, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        ItemTouchHelper.SimpleCallback callback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();
                messages.remove(position);
                mAdapter.notifyItemRemoved(position);
            }
        };

        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);
    }

    @Override
    public void onIconClicked(int position) {
        toggleSelection(position);
    }

    @Override
    public void onIconImportantClicked(int position) {
        Message message = messages.get(position);
        message.setImportant(!message.isImportant());
        messages.set(position, message);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onMessageRowClicked(int position) {
        Message message = messages.get(position);
        message.setRead(true);
        messages.set(position, message);
        mAdapter.notifyDataSetChanged();

        Toast.makeText(getApplicationContext(), "Read: " + message.getMessage(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onRowLongClicked(int position) {
    }

    private void toggleSelection(int position) {
        mAdapter.toggleSelection(position);
        int count = mAdapter.getSelectedItemCount();

        if (count == 0) {
            actionMode.finish();
        } else {
            actionMode.setTitle(String.valueOf(count));
            actionMode.invalidate();
        }
    }
}