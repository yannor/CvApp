package ys.cvapp.domain;

/**
 * Created by Yannick on 13/06/2017.
 */

public class Course {
    private String sDateRange;
    private String sTitle;
    private String sPlace;

    public Course(String sDateRange, String sTitle, String sPlace) {
        this.sDateRange = sDateRange;
        this.sTitle = sTitle;
        this.sPlace = sPlace;
    }

    public String getsDateRange() {
        return sDateRange;
    }
    public String getsTitle() {
        return sTitle;
    }
    public String getsPlace() {
        return sPlace;
    }
}
