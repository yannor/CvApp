package ys.cvapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ys.cvapp.domain.Course;

public class Cv extends AppCompatActivity {

    ListView lvCourses;

    List<Course> lsCourses = new ArrayList<>();
    private ViewGroup linCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        linCourses = (ViewGroup) findViewById(R.id.alternateLvCourses);
        lsCourses.add(new Course("2012-heden", "Toegepaste informatica, mobile apps", "Hogeschool Gent, Campus Aalst"));
        lsCourses.add(new Course("2010-2012", "Gezondheids- en Welzijnswetenschappen", "Sint-Augustinusinstituut, Aalst"));
        addCourses(lsCourses);


    }


    private void addCourses(List<Course> courses) {
        for (Course c : courses) {

        View rowCourse = LayoutInflater.from(this).inflate(R.layout.row_courses, linCourses, false);


            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c.getsDateRange());
            while (stringBuilder.length()<11)
            {
                stringBuilder.append(" ");
            }
        TextView textDate = (TextView) rowCourse.findViewById(R.id.dateRange);
        textDate.setText(stringBuilder+":");

        TextView textTitle = (TextView) rowCourse.findViewById(R.id.title);
        textTitle.setText(c.getsTitle());

        TextView textPlace = (TextView) rowCourse.findViewById(R.id.place);
        textPlace.setText(c.getsPlace());

        linCourses.addView(rowCourse);
        }
    }
}

