package ru.myitschool.downloadedimg;

import android.content.Context;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Consumer;

public class DownloadedThread extends Thread {
  private String downloadingUrl;
  private Context context;
  private Consumer<InputStream> dataCallback;

  public DownloadedThread(String downloadingUrl, Context context, Consumer<InputStream> dataCallback) {
	this.downloadingUrl = downloadingUrl;
	this.context = context;
	this.dataCallback = dataCallback;
  }

  @Override
  public void run() {
	super.run();
	try{
	  URL convertedDownlodingURL = createURL();

	  InputStream inputStream = convertedDownlodingURL.getContent();

	  ContextCompact.getMainExecutor(context)
	}catch(MalformedURLException exception){
	  ContextCompat.getMainExecutor(context).execute(()->{
		Toast.makeText(context, exception.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

	  });
	}
  }

  private URL createURL() throws MalformedURLException {
	return new URL(downloadingUrl);
  }
}
