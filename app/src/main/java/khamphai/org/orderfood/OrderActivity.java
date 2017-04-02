package khamphai.org.orderfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    TextView tvShowOrder, tvToolbar;
    Toolbar toolbar;
    Button btnShare;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        initializes();

    }

    private void initializes() {

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setTitle("");
//        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        tvToolbar = (TextView) findViewById(R.id.tvToolbar);
        tvToolbar.setText("|ລາຍການອາຫານທີ່ສັ່ງ|");

        tvShowOrder = (TextView) findViewById(R.id.tvShowOrder);
        Intent showData = getIntent();
        data = showData.getStringExtra("list_data");
        tvShowOrder.setText(data);

        btnShare = (Button) findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Order Menu");
                shareIntent.putExtra(Intent.EXTRA_TEXT, data);
                startActivity(shareIntent);
            }
        });
    }
}
