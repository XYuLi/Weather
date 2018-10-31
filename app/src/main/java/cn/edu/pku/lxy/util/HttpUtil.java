package cn.edu.pku.lxy.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

//与服务器进行交互
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client =new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
