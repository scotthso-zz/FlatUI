package scottso.flatui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ColourFragment extends Fragment {
    public static final int RED = 0;
    public static final int PINK = 1;
    public static final int PURPLE = 2;
    public static final int BLUE = 3;
    public static final int GREEN = 4;
    public static final int YELLOW = 5;
    public static final int ORANGE = 6;
    public static final int GRAY = 7;

    private int mLayoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(mLayoutId, container, false);
    }

    public void setLayoutId(int colour) {
        switch(colour) {
            case RED:
                mLayoutId = R.layout.fragment_red;
                break;
            case PINK:
                mLayoutId = R.layout.fragment_pink;
                break;
            case PURPLE:
                mLayoutId = R.layout.fragment_purple;
                break;
            case BLUE:
                mLayoutId = R.layout.fragment_blue;
                break;
            case GREEN:
                mLayoutId = R.layout.fragment_green;
                break;
            case YELLOW:
                mLayoutId = R.layout.fragment_yellow;
                break;
            case ORANGE:
                mLayoutId = R.layout.fragment_orange;
                break;
            case GRAY:
                mLayoutId = R.layout.fragment_gray;
                break;
        }
    }
}