package ys.cvapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import ys.cvapp.R;
import ys.cvapp.domain.Course;

/**
 * Created by Yannick on 13/06/2017.
 */


    public class CoursesAdapter extends BaseAdapter {

        Context context;
        List<Course> courses;
        private static LayoutInflater inflater = null;

        public CoursesAdapter(Context context, List<Course> courses) {
            // TODO Auto-generated constructor stub
            this.context = context;
            this.courses = courses;
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return courses.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return courses.get(position);
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View vi = convertView;
            if (vi == null)
                vi = inflater.inflate(R.layout.row_courses, null);

            TextView textDate = (TextView) vi.findViewById(R.id.dateRange);
            textDate.setText(courses.get(position).getsDateRange()+":");

            TextView textTitle = (TextView) vi.findViewById(R.id.title);
            textTitle.setText(courses.get(position).getsTitle());

            TextView textPlace = (TextView) vi.findViewById(R.id.place);
            textPlace.setText(courses.get(position).getsPlace());
            return vi;
        }
    }
