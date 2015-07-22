package in.teachcoder.app.userInterface1.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import in.teachcoder.app.apiguideapp0.R;

public class LayoutActivity extends AppCompatActivity {
    Button mLinearLayoutBtn;
    Button mRelativeLayoutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
         mLinearLayoutBtn = (Button)findViewById(R.id.lllinearLayoutbtn);
         mRelativeLayoutBtn = (Button)findViewById(R.id.relativeLayoutbtn);
    }

    public void BtnPressed(View v){
        long num = mLinearLayoutBtn.getId();
        long num1 = mRelativeLayoutBtn.getId();

        if(v.getId() == num){
            Intent linaerLayoutIntent = new Intent(this, LinearLayoutActivity.class);
            startActivity(linaerLayoutIntent);
        }
        if(v.getId() == num1){
            Intent relativeLayoutIntent = new Intent(this, RelativeLayoutActivity.class);
            startActivity(relativeLayoutIntent);
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_layout, menu);
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
