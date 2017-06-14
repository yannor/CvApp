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
import ys.cvapp.domain.Experience;
import ys.cvapp.domain.Extra;

public class Cv extends AppCompatActivity {

    List<Course> lsCourses;
    List<Extra> lsExtras;
    List<Experience> lsExperiences;
    ViewGroup linCourses, linExtras, linExperience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lsCourses = new ArrayList<>();
        linCourses = (ViewGroup) findViewById(R.id.linCourses);
        lsCourses.add(new Course("2012-heden", "Toegepaste informatica, mobile apps", "Hogeschool Gent, Campus Aalst"));
        lsCourses.add(new Course("2010-2012", "Gezondheids- en Welzijnswetenschappen", "Sint-Augustinusinstituut, Aalst"));
        for (Course c : lsCourses) {
            addCourse(c);
        }

        lsExtras = new ArrayList<>();
        linExtras = (ViewGroup) findViewById(R.id.linExtras);
        lsExtras.add(new Extra("2017", "Hack The Future (Mobile)"));
        lsExtras.add(new Extra("2015-2017", "Websitebeheer Gezinsbond Terjoden"));
        lsExtras.add(new Extra("2012", "Vlaamse Programmeerwedstrijd"));
        for (Extra e : lsExtras) {
            addExtra(e);
        }
    }


    private void addCourse(Course c) {

        View rowCourse = LayoutInflater.from(this).inflate(R.layout.row_courses, linCourses, false);


        TextView textDate = (TextView) rowCourse.findViewById(R.id.dateRange);
        textDate.setText(c.getsDateRange()+":");

        TextView textTitle = (TextView) rowCourse.findViewById(R.id.title);
        textTitle.setText(c.getsTitle());

        TextView textPlace = (TextView) rowCourse.findViewById(R.id.place);
        textPlace.setText(c.getsPlace());

        linCourses.addView(rowCourse);
    }

    private void addExtra(Extra e) {

        View rowExtra = LayoutInflater.from(this).inflate(R.layout.row_extras, linExtras, false);

        TextView textDate = (TextView) rowExtra.findViewById(R.id.dateRange);
        textDate.setText(e.getsDateRange()+":");

        TextView textTitle = (TextView) rowExtra.findViewById(R.id.title);
        textTitle.setText(e.getsTitle());

        linExtras.addView(rowExtra);
    }
}

