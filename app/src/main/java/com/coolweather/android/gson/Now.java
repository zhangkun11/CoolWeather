package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2017-03-08.
 */

public class Now {
    @SerializedName("tmp")
    public String temerature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
