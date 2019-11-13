package vn.edu.usth.usthweather;

import android.content.Context;
import android.app.Fragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForecastFragment extends Fragment {


  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//
      //  View view = new View(getContext());

      //  view.setBackgroundColor(0x0000FF00);
      //  return view;


View view = inflater.inflate(R.layout.forecastfragment, container,false);
      TextView textview = new TextView(getContext());
      textview.setText("wednesday");
      ImageView imageview = new ImageView(getContext());
      imageview.setMaxHeight(250);
      imageview.setMaxWidth(250);
      imageview.setBackgroundResource(R.drawable.Sunny);
           return view;

    }
}
