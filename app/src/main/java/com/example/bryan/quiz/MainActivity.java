package com.example.bryan.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edName;
    private RadioGroup rgType;
    private RadioButton rbTea , rbCoffe, rbSmoothies;
    private CheckBox cbPearl,cbPudding,cbRedBean, cbCoconut;
    private Button btnMinus , btnPlus, btnAdd,btnEdit,btnDelete,btnReset;
    private TextView txtQty,txtTotal,txtName,txtType;
    private ListView lvOrder;
    private OrderAdapter adapter;
    private ArrayList<Order> arrOrder = new ArrayList<>();
    private long total =0;
    private int index = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = findViewById(R.id.editText);
        rgType = findViewById(R.id.radioGroup_type);
        rbTea = findViewById(R.id.rbTea);
        rbCoffe  = findViewById(R.id.rbCoffee);
        rbSmoothies = findViewById(R.id.rbSmooth);
        cbPearl = findViewById(R.id.cbPearl);
        cbCoconut = findViewById(R.id.cbCoconut);
        cbPudding = findViewById(R.id.cbPudding);
        cbRedBean = findViewById(R.id.cbRedBean);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus= findViewById(R.id.btnPlus);
        btnAdd= findViewById(R.id.btnAdd);
        btnDelete= findViewById(R.id.btnDelete);
        txtName = findViewById(R.id.txtName);
        txtType = (TextView)findViewById(R.id.txtType);
        txtName = findViewById(R.id.txtName);
        txtTotal = findViewById(R.id.textView_subtotal);
    adapter = new OrderAdapter(MainActivity.this, arrOrder);
    lvOrder.setAdapter((ListAdapter) adapter);
    total = 0;
    }
}
