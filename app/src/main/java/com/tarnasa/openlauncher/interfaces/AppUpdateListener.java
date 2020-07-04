package com.tarnasa.openlauncher.interfaces;

import com.tarnasa.openlauncher.model.App;

import java.util.List;

public interface AppUpdateListener {
    boolean onAppUpdated(List<App> apps);
}
