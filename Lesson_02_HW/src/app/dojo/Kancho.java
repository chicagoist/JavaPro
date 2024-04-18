package app.dojo;

import app.dojo.sempai.blackbelt.BlackBeltSempai;
import app.dojo.sempai.braunbelt.BraunBeltSempai;
import org.springframework.beans.factory.annotation.Autowired;

public class Kancho {

    @Autowired
    private BlackBeltSempai blackBeltSempai;

    @Autowired
    private BraunBeltSempai braunBeltSempai;

    @Autowired
    private Judge judge;

    public void setBlackBeltSempai(BlackBeltSempai blackBeltSempai) {
        this.blackBeltSempai = blackBeltSempai;
    }

    public void setBraunBeltSempai(BraunBeltSempai braunBeltSempai) {
        this.braunBeltSempai = braunBeltSempai;
    }

    public void setJudge(Judge judge) {
        this.judge = judge;
    }

    public void manageDojo() {
        judge.startJudging();
        blackBeltSempai.hajime();
        braunBeltSempai.hajime();
    }
}
