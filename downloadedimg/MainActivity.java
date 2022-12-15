package ru.myitschool.downloadedimg;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import java.io.InputStream;

import ru.myitschool.downloadedimg.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	binding = ActivityMainBinding.inflate(getLayoutInflater());
	getContentView(binding.getRoot());
	binding.submitButton.setONClickListenr
  }
  private void stopLoading(){
	binding.progressBar.setVisibility(View.INVISIBLE);
  }
  private  void showLoading(){
	binding.progressBar.setVisibility(View.VISIBLE);
  }
  private  void loadPicture(){
	String downloadUrl= binding.urIEdittext.getText().toString();

	showLoading();
  }

}