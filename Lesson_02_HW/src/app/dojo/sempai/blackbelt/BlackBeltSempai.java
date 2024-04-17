package app.dojo.sempai.blackbelt;

import app.dojo.kohai.bluebelt.BlueBeltGroup;
import org.springframework.beans.factory.annotation.Autowired;

public class BlackBeltSempai {

    @Autowired
    private BlueBeltGroup blueBeltGroup;

    public void setBlueBeltCroup(BlueBeltGroup blueBeltGroup) {
        this.blueBeltGroup = blueBeltGroup;
    }

    public void hajime() {
        blueBeltGroup.startExam();
    }
}
