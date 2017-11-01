package top.kakit.networktest;

/**
 * Created by kakit on 2017/10/23.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
