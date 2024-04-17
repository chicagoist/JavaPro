package app.code;

import app.dojo.Judge;
import app.dojo.Kancho;
import app.dojo.kohai.bluebelt.BlueBeltCroup;
import app.dojo.kohai.whitebelt.WhiteBeltGroup;
import app.dojo.sempai.blackbelt.BlackBeltSempai;
import app.dojo.sempai.braunbelt.BraunBeltSempai;

public class Application {

    public static void main(String[] args) {

        BlueBeltCroup blueBeltCroup = new BlueBeltCroup();
        WhiteBeltGroup whiteBeltGroup = new WhiteBeltGroup();

        Judge judge = new Judge();

        BlackBeltSempai blackBeltSempai = new BlackBeltSempai();
        blackBeltSempai.setBlueBeltCroup(blueBeltCroup);

        BraunBeltSempai braunBeltSempai = new BraunBeltSempai();
        braunBeltSempai.setWhiteBeltGroup(whiteBeltGroup);


        Kancho kancho = new Kancho();
        kancho.setJudge(judge);
        kancho.setBlackBeltSempai(blackBeltSempai);
        kancho.setBraunBeltSempai(braunBeltSempai);

        kancho.manageDojo();


    }
}
