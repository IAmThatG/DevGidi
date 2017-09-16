package com.example.android.devgidi.Classes;

import com.example.android.devgidi.Interfaces.IDeveloper;

/**
 * Created by GABRIEL on 9/15/2017.
 */

public class Developer implements IDeveloper
{
    /**
     * The image resource id for a developer
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private String mUsername;

    /**
     * The default id if no image is provided
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Developer()
    {
    }

    public Developer(int imageResourceId, String username)
    {
        mImageResourceId = imageResourceId;
        mUsername = username;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public String getUsername()
    {
        return mUsername;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
