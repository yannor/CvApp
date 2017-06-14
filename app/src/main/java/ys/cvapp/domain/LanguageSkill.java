package ys.cvapp.domain;

/**
 * Created by Yannick on 14/06/2017.
 */

public class LanguageSkill extends Skill {

    private String level;

    public LanguageSkill(String sSkillName, String level) {
        super(sSkillName);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }
}
