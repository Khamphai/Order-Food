package khamphai.org.orderfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

     int resultPrices = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//onCreate--------------------------------------------------

    public void displayPrice(int prices) {
        TextView tvResult =
                (TextView) findViewById(R.id.tvResult);
        String priceFormat = new DecimalFormat("##,##0.00₭").format(prices);
        tvResult.setText("" + priceFormat);
    }

    public void onCheckBoxChecked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.cb1:
                if (checked) {
                    resultPrices += 10000;
                    displayPrice(resultPrices);
                }else {
                    resultPrices -= 10000;
                    displayPrice(resultPrices);
                }
                break;
            case R.id.cb2:
                if (checked) {
                    resultPrices += 10000;
                    displayPrice(resultPrices);
                }else {
                    resultPrices -= 10000;
                    displayPrice(resultPrices);
                }
                break;
            case R.id.cb3:
                if (checked) {
                    resultPrices += 10000;
                    displayPrice(resultPrices);
                }else {
                    resultPrices -= 10000;
                    displayPrice(resultPrices);
                }
                break;
            case R.id.cb4:
                if (checked) {
                    resultPrices += 10000;
                    displayPrice(resultPrices);
                }else {
                    resultPrices -= 10000;
                    displayPrice(resultPrices);
                }
                break;
            case R.id.cb5:
                if (checked) {
                    resultPrices += 10000;
                    displayPrice(resultPrices);
                }else {
                    resultPrices -= 10000;
                    displayPrice(resultPrices);
                }
                break;
            case R.id.cb6:
                if (checked) {
                    resultPrices += 12000;
                    displayPrice(resultPrices);
                }else {
                    resultPrices -= 12000;
                    displayPrice(resultPrices);
                }
                break;
            case R.id.cb7:
                if (checked) {
                    resultPrices += 12000;
                    displayPrice(resultPrices);
                }else {
                    resultPrices -= 12000;
                    displayPrice(resultPrices);
                }
                break;
            case R.id.cb8:
                if (checked) {
                    resultPrices += 12000;
                    displayPrice(resultPrices);
                }else {
                    resultPrices -= 12000;
                    displayPrice(resultPrices);
                }
                break;
        }
    }

    public void orderMenu(View view) {

        int prices = resultPrices;
        String priceFormat = new DecimalFormat("##,##0.00₭").format(prices);

        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.cb3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.cb4);

        CheckBox cb5 = (CheckBox) findViewById(R.id.cb5);
        CheckBox cb6 = (CheckBox) findViewById(R.id.cb6);
        CheckBox cb7 = (CheckBox) findViewById(R.id.cb7);
        CheckBox cb8 = (CheckBox) findViewById(R.id.cb8);

        boolean hasCb1 = cb1.isChecked();
        boolean hasCb2 = cb2.isChecked();
        boolean hasCb3 = cb3.isChecked();
        boolean hasCb4 = cb4.isChecked();

        boolean hasCb5 = cb5.isChecked();
        boolean hasCb6 = cb6.isChecked();
        boolean hasCb7 = cb7.isChecked();
        boolean hasCb8 = cb8.isChecked();

        //Check Condition of CheckBox true or false
        String listOrderValue = listOrderMenu(priceFormat,
                hasCb1, hasCb2, hasCb3, hasCb4,
                hasCb5, hasCb6, hasCb7, hasCb8);

        //Change Activity with send Data
        Intent sendOrderMenu = new Intent(MainActivity.this, OrderActivity.class);
        sendOrderMenu.putExtra("list_data", listOrderValue);
        startActivity(sendOrderMenu);

    }//OrderMenu()----------------------------------------------

    private String listOrderMenu(String price,
                                 boolean hasCb1,
                                 boolean hasCb2,
                                 boolean hasCb3,
                                 boolean hasCb4,
                                 boolean hasCb5,
                                 boolean hasCb6,
                                 boolean hasCb7,
                                 boolean hasCb8) {

        String listResultOrder = "ລາຍການອາຫານ :";
        if (hasCb1) listResultOrder += "\n" + " - ຕຳໝາກຫຸງ = 10,000₭";
        if (hasCb2) listResultOrder += "\n" + " - ຕຳໝີ່ໄວໆ = 10,000₭";
        if (hasCb3) listResultOrder += "\n" + " - ຕຳໝີ່ຂາວ = 10,000₭";
        if (hasCb4) listResultOrder += "\n" + " - ຕຳຕ່ອນ = 10,000₭";
        if (hasCb5) listResultOrder += "\n" + " - ເຂົ້າປຽກ = 10,000₭";
        if (hasCb6) listResultOrder += "\n" + " - ເຂົ້າປຸ້ນ = 12,000₭";
        if (hasCb7) listResultOrder += "\n" + " - ໝີ່ໄວໆ = 12,000₭";
        if (hasCb8) listResultOrder += "\n" + " - ເຝີຊີ້ນເປື່ອຍ = 12,000₭";
        listResultOrder += "\n" + "ລາຄາລວມ = " + price;

        return listResultOrder;
    }

}//Main Class----------------------------------------------------
