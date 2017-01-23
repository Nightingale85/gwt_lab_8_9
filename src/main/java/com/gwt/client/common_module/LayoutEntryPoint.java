package com.gwt.client.common_module;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.gwt.client.common_module.layout.AppLayout;

/**
 * @author Sergiy_Solovyov
 */
public class LayoutEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        AppLayout appLayout = new AppLayout();
        RootPanel.get().add(appLayout);
    }
}
