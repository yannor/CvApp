package ys.cvapp.overbodig;

/**
 * Created by Yannick on 14/06/2017.
 */

public class Experience {
    private String sDateRange;
    private String sTitle;
    private String sExplanation;

    public Experience(String sDateRange, String sTitle, String sExplanation) {
        this.sDateRange = sDateRange;
        this.sTitle = sTitle;
        this.sExplanation = sExplanation;
    }

    public String getsDateRange() {
        return sDateRange;
    }

    public String getsTitle() {
        return sTitle;
    }

    public String getsExplanation() {
        return sExplanation;
    }
}
