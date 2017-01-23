package com.gwt.client.main_module.gin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.gwt.client.main_module.main_view.GreetingView;
import com.gwt.client.upload_module.UploadView;

/**
 * @author Sergiy_Solovyov
 */
@GinModules(InjectorModule.class)
public interface Injector extends Ginjector {
     Injector INSTANCE = GWT.create(Injector.class);
     GreetingView getGreetingView();
     UploadView getUploadView();
     EventBus getEventBus();
     PlaceController getPlaceController();
}
