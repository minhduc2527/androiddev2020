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

public class ForecastFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //View view = new View(getContext());
        //view.setBackgroundColor(0x0000FF00);
        //return view;
        //


        View view = inflater.inflate(R.layout.forecastfragment, container,false);
        TextView textview = new TextView(getContext());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.Linearlayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        textview.setText("wednesday");
        ImageView imageview = new ImageView(getContext());
        imageview.setMaxHeight(250);
        imageview.setMaxWidth(250);
        imageview.setBackgroundResource(R.drawable.sunny);

        return view;
    }

    private class Linearlayout1 {
    }
}