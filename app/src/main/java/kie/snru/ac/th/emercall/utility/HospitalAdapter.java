package kie.snru.ac.th.emercall.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Admin on 22/2/2561.
 */

public class HospitalAdapter extends BaseAdapter{

   //Explicit
private Context context;
private int[] ints;
private String[] titlestrings,phoneStrings;

    public HospitalAdapter(Context context, int[] ints, String[] titlestrings, String[] phoneStrings) {
        this.context = context;
        this.ints = ints;
        this.titlestrings = titlestrings;
        this.phoneStrings = phoneStrings;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



        return null;
    }
}  //Main Clss


