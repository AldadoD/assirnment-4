package com.aldado.principles.dip.Violate;

public class Project {

    private BackEndDev backEndDeveloper = new BackEndDev();
    private FrontEndDev frontEndDeveloper = new FrontEndDev();

    public void implement() {

        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}
