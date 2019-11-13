package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ForecastFragment firstFragment =new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();

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