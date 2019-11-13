package vn.edu.usth.usthweather;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
public class ForecastFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = new View(getContext());

        view.setBackgroundColor(0x0000FF00);
        return view;
    }
}
