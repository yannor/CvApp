package ys.cvapp.domain;

/**
 * Created by Yannick on 14/06/2017.
 */

public class TechnicalSkill extends Skill {

    private int level;

    public TechnicalSkill(String sSkillName, int level) {
        super(sSkillName);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
