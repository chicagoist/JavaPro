package app.code;

import app.dojo.Kancho;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.NativeDetector;

/*
import app.dojo.Judge;
import app.dojo.Kancho;
import app.dojo.kohai.bluebelt.BlueBeltGroup;
import app.dojo.kohai.whitebelt.WhiteBeltGroup;
import app.dojo.sempai.blackbelt.BlackBeltSempai;
import app.dojo.sempai.braunbelt.BraunBeltSempai;
*/
public class Application {

    public static void main(String[] args) {

/*

        BlueBeltGroup blueBeltCroup = new BlueBeltGroup();
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
*/

        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext("app.config");
        Kancho kancho = context.getBean(Kancho.class);
        kancho.manageDojo();

        //OUTPUT
/*      Начать судейство экзаменов!
        Начать экзамен на синий пояс!
        Начать экзамен на белый пояс!

        Process finished with exit code 0
*/


    }
}
