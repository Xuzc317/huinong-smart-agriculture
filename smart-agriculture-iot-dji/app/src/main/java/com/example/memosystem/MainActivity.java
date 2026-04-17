package com.example.memosystem;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.memosystem.activity.ManageActivity;
import com.example.memosystem.activity.RegisterActivity;
import com.example.memosystem.dao.AdminDao;
import com.example.memosystem.util.DBUtil;
public class MainActivity extends AppCompatActivity {
private ImageView img_gif;
@Override
protected void onCreate(Bundle savedInstanceState) {