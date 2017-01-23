package com.gwt.client.main_module.gin;


import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Singleton;
import com.gwt.client.main_module.InjectablePlaceController;
import com.gwt.client.main_module.main_view.GreetingView;
import com.gwt.client.upload_module.UploadView;

/**
 * @author Sergiy_Solovyov
 */
public class InjectorModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
        bind(PlaceController.class).to(InjectablePlaceController.class).in(Singleton.class);
        bind(GreetingView.class).in(Singleton.class);
        bind(UploadView.class).in(Singleton.class);
    }
}
