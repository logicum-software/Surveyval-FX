package sample;

import java.io.Serializable;

public class Frage implements Serializable {

    public String strFragetext;
    public int iAnswer;
    public boolean bInSelection;

    public Frage() {

        strFragetext = "";
        iAnswer = 0;
        bInSelection = false;
    }

    public Frage(String strTmp, int iTmp) {

        strFragetext = strTmp;
        iAnswer = iTmp;
        bInSelection = false;
    }
}
