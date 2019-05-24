package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fragebogen implements Serializable {

    private String strName;
    public List<Frage> Fragen;

    public Fragebogen() {

        strName = "";
        Fragen = new ArrayList<>();
    }
}
