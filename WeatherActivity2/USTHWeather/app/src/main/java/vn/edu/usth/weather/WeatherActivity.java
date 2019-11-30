package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class WeatherActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        adapter = new Adapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        Forecastfragment firstFragment =new Forecastfragment();
        Forecastfragment x = new Forecastfragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container, x).commit();
    }
    protected  void onStart(){
        super.onStart();
        Log.i("onstart","starting");
    }
    protected  void  onResume(){
        super.onResume();
        Log.i("Resume","resuming");
    }
    protected  void onPause(){
        super.onPause();
        Log.i("pause","pausing");
    }
    protected  void onStop(){
        super.onStop();
        Log.i("stop","stoping");

    }
    protected  void onDestroy(){
        super.onDestroy();
        Log.i("destroy","destroying");
    }
}