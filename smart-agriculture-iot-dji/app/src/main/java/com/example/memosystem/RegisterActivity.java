package com.example.memosystem;

import android.content.Intent;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.memosystem.MainActivity;
import com.example.memosystem.R;
import com.example.memosystem.dao.AdminDao;
public class RegisterActivity extends AppCompatActivity {
private ImageView img_gif2;
@Override
protected void onCreate(Bundle savedInstanceState) {