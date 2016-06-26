package com.udhay.android.hideandshow;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class HideAndShow extends Activity implements View.OnClickListener {

    ImageView theImageview;
    Button theButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_and_show);

        theImageview = (ImageView)findViewById(R.id.imageView);
        theButton   = (Button)findViewById(R.id.clickbtn);

        theButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hide_and_show, menu);
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

    @Override
    public void onClick(View v) {
      if (v == theButton)
      {
          String theBtnText = theButton.getText().toString();
          if (theBtnText.equalsIgnoreCase("hide"))
          {
              theButton.setText("Show");
              theImageview.setVisibility(View.INVISIBLE);
          }
          else if(theBtnText.equalsIgnoreCase("show"))
          {
              theButton.setText("Hide");
              theImageview.setVisibility(View.VISIBLE);
          }
      }
    }
}
