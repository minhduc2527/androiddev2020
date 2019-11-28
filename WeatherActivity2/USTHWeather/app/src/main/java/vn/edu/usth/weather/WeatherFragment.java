package vn.edu.usth.weather;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class WeatherFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //View view = new View(getContext());
        //view.setBackgroundColor(0x0000FF00);
        //return view;
        //

        return inflater.inflate(R.layout.fragment_weather, container, false);


    }
}


