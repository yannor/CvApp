package ys.cvapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ys.cvapp.adapters.CoursesAdapter;
import ys.cvapp.domain.Course;

public class Cv extends AppCompatActivity {

    ListView lvCourses;

    List<Course> lsCourses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        lsCourses.add(new Course("2012-heden", "Toegepaste informatica, mobile apps", "Hogeschool Gent, Campus Aalst"));
        lsCourses.add(new Course("2010-2012", "Gezondheids- en Welzijnswetenschappen", "Sint-Augustinusinstituut, Aalst"));

        lvCourses = (ListView) findViewById(R.id.listCourses);
        lvCourses.setAdapter(new CoursesAdapter(this, lsCourses));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cv, menu);
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

