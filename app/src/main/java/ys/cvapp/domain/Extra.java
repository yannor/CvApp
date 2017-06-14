package ys.cvapp.domain;

/**
 * Created by Yannick on 14/06/2017.
 */

public class Extra {
    private String sDateRange;
    private String sTitle;

    public Extra(String sDateRange, String sTitle) {
        this.sDateRange = sDateRange;
        this.sTitle = sTitle;
    }

    public String getsDateRange() {
        return sDateRange;
    }

    public String getsTitle() {
        return sTitle;
    }
}
