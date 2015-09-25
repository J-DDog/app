package activity.ctec.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import java.util.Random;
import android.graphics.Color;

public class StupidMorningActivity extends AppCompatActivity
{

    private Button stupidButton;
    private Button colorButton;
    private TextView basicText;
    private RelativeLayout background;
    private Random randomNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid_morning);

        //Defining/Reference to the buttons
        stupidButton = (Button) findViewById(R.id.stupidButton);
        colorButton = (Button) findViewById(R.id.backgColorButton);

        //Defining the text field and the background layout
        basicText = (TextView)  findViewById(R.id.TextView);
        background = (RelativeLayout) findViewById(R.id.backoundLayout);

        //Set its text to the default
        stupidButton.setText("I Do Nothing");

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stupid_morning, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
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

    private void changeBackgroundColor()
    {
        int redColor;
        int greenColor;
        int blueColor;

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        //redColor = (int) (Math.random() * 256);
        //greenColor = (int) (Math.random() * 256);
        //blueColor = (int) (Math.random() * 256);

        stupidButton.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));
    }

    private void setupListeners()
    {
        stupidButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //Set the text on button pressed.
                if(stupidButton.getText() == "I Do Nothing" | stupidButton.getText() == "Stupid Button is Stupid!!")
                {
                    stupidButton.setText("K, maybe I lied");
                }
                else
                {
                    stupidButton.setText("Stupid Button is Stupid!!");
                }

            }

        });

        //Defining the onClickListener-listens for a click
        colorButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //Randomize the background Color on click
                changeBackgroundColor();

            }

        });

    }

}
