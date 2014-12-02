package edu.pace.pclc.simpleasynctask;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageview = (ImageView)findViewById(R.id.imageView);
        DownloadImageTask myTask = new DownloadImageTask(imageview);

        myTask.execute("http://lorempixel.com/400/200/sports/");
    }

    public void refreshImage(View view) {

        ImageView imageview = (ImageView)findViewById(R.id.imageView);
        DownloadImageTask myTask = new DownloadImageTask(imageview);

        myTask.execute("http://lorempixel.com/400/200/cats/");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
