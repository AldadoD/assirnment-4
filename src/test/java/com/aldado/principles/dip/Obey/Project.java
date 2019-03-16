package com.aldado.principles.dip.Obey;

import com.aldado.principles.dip.Violate.BackEndDev;
import com.aldado.principles.dip.Violate.FrontEndDev;

import java.util.List;

public class Project {

    private List<Dev> developers;
    public Project(List<Dev> developers) {
        this.developers = developers;
    }
    public void implement() {
        developers.forEach(dev -> dev.develop());
    }
}
