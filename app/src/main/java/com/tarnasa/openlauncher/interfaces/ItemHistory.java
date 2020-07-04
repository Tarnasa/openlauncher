package com.tarnasa.openlauncher.interfaces;

import android.view.View;

import com.tarnasa.openlauncher.model.Item;

public interface ItemHistory {
    void setLastItem(Item item, View view);

    void revertLastItem();

    void consumeLastItem();
}
