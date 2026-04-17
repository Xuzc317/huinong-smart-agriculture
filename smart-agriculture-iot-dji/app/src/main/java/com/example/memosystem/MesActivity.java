package com.example.memosystem.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import com.example.memosystem.MainActivity;
import com.example.memosystem.R;
import com.example.memosystem.activity.listen.ChangeListen;
import com.example.memosystem.activity.listen.TouchListen;
import com.example.memosystem.dao.AdminDao;
import java.util.Map;
public class MesActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {