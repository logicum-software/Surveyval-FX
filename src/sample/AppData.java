package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppData implements Serializable {

    public List<Fragebogen> appFrageboegen;
    public List<Frage> appFragen;

    public AppData() {

        appFrageboegen = new ArrayList<>();
        appFragen = new ArrayList<>();
    }
}
