package com.niusounds.gearvrapp;

import com.eje_c.meganekko.Meganekko;
import com.eje_c.meganekko.MeganekkoApp;

public class App extends MeganekkoApp {
    protected App(Meganekko meganekko) {
        super(meganekko);
        setSceneFromXML(R.xml.scene);
    }
}
