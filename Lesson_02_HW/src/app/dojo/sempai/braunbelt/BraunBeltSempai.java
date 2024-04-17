package app.dojo.sempai.braunbelt;

import app.dojo.kohai.whitebelt.WhiteBeltGroup;
import org.springframework.beans.factory.annotation.Autowired;

public class BraunBeltSempai {

    @Autowired
    private WhiteBeltGroup whiteBeltGroup;

    public void setWhiteBeltGroup(WhiteBeltGroup whiteBeltGroup) {
        this.whiteBeltGroup = whiteBeltGroup;
    }

    public void hajime() {
        whiteBeltGroup.startExam();
    }
}
