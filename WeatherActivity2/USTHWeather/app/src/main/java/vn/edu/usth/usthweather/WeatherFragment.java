package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class WeatherFragment extends Fragment {
    private int pos;
    private TextView location;
    private String currentLocation [] = null ;



    public WeatherFragment() {

        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        currentLocation = getResources().getStringArray(R.array.locations); // get location list from resources
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather, container, false);
//        Log.i("Current Location", "onCreateView: "+ currentLocation[0]);
        location = (TextView) view.findViewById(R.id.location);
//        Log.i("Current Location4", "onCreateView: "+  location.getText());

        location.setText(currentLocation[pos]);
//        location.setText(Integer.parseInt(getArguments().getString("position")));

        return view;
    }




    public void displayReceivedData(String message)
    {
        pos = Integer.parseInt(message);

    }


}