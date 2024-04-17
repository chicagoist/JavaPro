package app.dojo;

import app.dojo.sempai.blackbelt.BlackBeltSempai;
import app.dojo.sempai.braunbelt.BraunBeltSempai;

public class Kancho {

    private BlackBeltSempai blackBeltSempai;
    private BraunBeltSempai braunBeltSempai;
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
