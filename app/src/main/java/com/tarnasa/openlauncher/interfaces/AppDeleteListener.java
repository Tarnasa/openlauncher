package com.tarnasa.openlauncher.interfaces;

import com.tarnasa.openlauncher.model.App;

import java.util.List;

public interface AppDeleteListener {
    boolean onAppDeleted(List<App> apps);
}
