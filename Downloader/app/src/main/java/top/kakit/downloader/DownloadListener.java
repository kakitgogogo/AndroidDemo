package top.kakit.downloader;

/**
 * Created by kakit on 2017/10/24.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCanceled();

}
