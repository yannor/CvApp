package ys.cvapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ys.cvapp.domain.Course;
import ys.cvapp.domain.Extra;
import ys.cvapp.domain.LanguageSkill;
import ys.cvapp.domain.TechnicalSkill;

public class Cv extends AppCompatActivity {

    List<Course> lsCourses, lsExperiences;
    List<Extra> lsExtras;
    List<TechnicalSkill> lsTechSkills;
    ViewGroup linCourses, linExtras, linExperiences, linTechSkill;

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

        lsExperiences = new ArrayList<>();
        linExperiences = (ViewGroup) findViewById(R.id.linExperiences);
        lsExperiences.add(new Course("feb 2017-jun 2017", "Stage Intrum Justitia", "Ontwikkelen sms-applicatie waarbij sms’en en voicemails automatisch verzonden worden naar de klant. Dit in VB.NET met een oracle databank."));
        lsExperiences.add(new Course("2016", "Vakantiejob Tekniplex", "Zowel dag- als nachtshift"));
        lsExperiences.add(new Course("2013-2015", "Vakantiejob en weekendwerk bij De Graeve", "Pompbediende op tankstation"));
        lsExperiences.add(new Course("Vakanties 2010-2013", "Vrijwilliger buitenschoolse kinderopvang Pimboli", "Begeleider activiteiten"));
        for (Course e : lsExperiences) {
            addExperience(e);
        }

        lsTechSkills = new ArrayList<>();
        linTechSkill = (ViewGroup) findViewById(R.id.linTechSkills);
        lsTechSkills.add(new TechnicalSkill("Java", 3));
        lsTechSkills.add(new TechnicalSkill("C#", 1));
        lsTechSkills.add(new TechnicalSkill("VB.NET", 1));
        lsTechSkills.add(new TechnicalSkill("UWP", 2));
        lsTechSkills.add(new TechnicalSkill("Android", 3));
        lsTechSkills.add(new TechnicalSkill("HTML", 1));
        lsTechSkills.add(new TechnicalSkill("SQL", 2));
        lsTechSkills.add(new TechnicalSkill("PL/SQL", 1));
        lsTechSkills.add(new TechnicalSkill("GIT", 3));
        lsTechSkills.add(new TechnicalSkill("SVN", 1));
        lsTechSkills.add(new TechnicalSkill("Microsoft Office", 3));
        lsTechSkills.add(new TechnicalSkill("Scrum", 3));

        for (TechnicalSkill t : lsTechSkills) {
            addTechSkill(t);
        }
    }


    private void addCourse(Course c) {

        View rowCourse = LayoutInflater.from(this).inflate(R.layout.row_courses, linCourses, false);

        TextView textDate = (TextView) rowCourse.findViewById(R.id.dateRange);
        textDate.setText(c.getsDateRange() + ":");

        TextView textTitle = (TextView) rowCourse.findViewById(R.id.title);
        textTitle.setText(c.getsTitle());

        TextView textPlace = (TextView) rowCourse.findViewById(R.id.place);
        textPlace.setText(c.getsPlace());

        linCourses.addView(rowCourse);
    }

    private void addExperience(Course e) {

        View rowExperience = LayoutInflater.from(this).inflate(R.layout.row_courses, linExperiences, false);

        TextView textDate = (TextView) rowExperience.findViewById(R.id.dateRange);
        textDate.setText(e.getsDateRange() + ":");

        TextView textTitle = (TextView) rowExperience.findViewById(R.id.title);
        textTitle.setText(e.getsTitle());

        TextView textExplanation = (TextView) rowExperience.findViewById(R.id.place);
        textExplanation.setText(e.getsPlace());

        linExperiences.addView(rowExperience);
    }

    private void addExtra(Extra e) {

        View rowExtra = LayoutInflater.from(this).inflate(R.layout.row_extras, linExtras, false);

        TextView textDate = (TextView) rowExtra.findViewById(R.id.dateRange);
        textDate.setText(e.getsDateRange() + ":");

        TextView textTitle = (TextView) rowExtra.findViewById(R.id.title);
        textTitle.setText(e.getsTitle());

        linExtras.addView(rowExtra);
    }


    private void addTechSkill(TechnicalSkill s) {
        View rowSkill = LayoutInflater.from(this).inflate(R.layout.row_skills, linTechSkill, false);

        TextView textName = (TextView) rowSkill.findViewById(R.id.txtName);
        textName.setText(s.getsSkillName());

        RadioButton rbBa = (RadioButton) rowSkill.findViewById(R.id.rbBasic);
        RadioButton rbMe = (RadioButton) rowSkill.findViewById(R.id.rbMedium);
        RadioButton rbHi = (RadioButton) rowSkill.findViewById(R.id.rbHigh);
        RadioButton rbEx = (RadioButton) rowSkill.findViewById(R.id.rbExpert);

        rbBa.setClickable(false);
        rbMe.setClickable(false);
        rbHi.setClickable(false);
        rbEx.setClickable(false);

        switch (s.getLevel()) {
            case 1:
                rbBa.setChecked(true);
                break;
            case 2:
                rbMe.setChecked(true);
                break;
            case 3:
                rbHi.setChecked(true);
                break;
            case 4:
                rbEx.setChecked(true);
                break;
        }

        linTechSkill.addView(rowSkill);
    }

}

