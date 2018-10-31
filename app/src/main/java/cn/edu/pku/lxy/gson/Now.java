package cn.edu.pku.lxy.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    @SerializedName("wind_dir")
    public String fengxiang;

    @SerializedName("wind_spd")
    public String fengli;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
