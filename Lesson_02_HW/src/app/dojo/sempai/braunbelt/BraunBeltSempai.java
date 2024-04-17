package app.dojo.sempai.braunbelt;

import app.dojo.kohai.whitebelt.WhiteBeltGroup;

public class BraunBeltSempai {

    private WhiteBeltGroup whiteBeltGroup;

    public void setWhiteBeltGroup(WhiteBeltGroup whiteBeltGroup) {
        this.whiteBeltGroup = whiteBeltGroup;
    }

    public void hajime() {
        whiteBeltGroup.startExam();
    }
}
