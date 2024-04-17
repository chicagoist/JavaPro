package app.dojo.sempai.blackbelt;

import app.dojo.kohai.bluebelt.BlueBeltCroup;

public class BlackBeltSempai {

    private BlueBeltCroup blueBeltCroup;

    public void setBlueBeltCroup(BlueBeltCroup blueBeltCroup) {
        this.blueBeltCroup = blueBeltCroup;
    }

    public void hajime() {
        blueBeltCroup.startExam();
    }
}
