package com.example.android.devgidi.Helpers;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.devgidi.Interfaces.IDeveloper;
import com.example.android.devgidi.R;

import java.util.List;

/**
 * Created by GABRIEL on 9/15/2017.
 */

public class DeveloperAdapter extends ArrayAdapter<IDeveloper>
{
    public DeveloperAdapter(@NonNull Context context, @NonNull List<IDeveloper> objects)
    {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        //check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.developers_list_item, parent, false);

        //get the Developer object located at this position in the list
        IDeveloper currentDeveloper = getItem(position);

        if (currentDeveloper != null)
        {
            //find the TextView in list_item.xml with id username_text_view
            TextView usernameTextView = listItemView.findViewById(R.id.username_text);
            //set the text of the miwokTextView as the miwokTranslation of the currentDeveloper
            usernameTextView.setText(currentDeveloper.getUsername());

            //find the ImageView in developers_list_item.xml with id developer_image
            ImageView imageView = listItemView.findViewById(R.id.developer_image);

            if (currentDeveloper.hasImage())
            {
                //set the content of the image
                imageView.setImageResource(currentDeveloper.getImageResourceId());
                //make the image visible incase the reusable view has was previously INVISIBLE or GONE
                imageView.setVisibility(View.VISIBLE);
            } else
                //otherwise hide the image view
                imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
