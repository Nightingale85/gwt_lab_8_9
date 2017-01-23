package com.gwt.client.main_module.mvp.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.gwt.client.main_module.gin.Injector;
import com.gwt.client.main_module.mvp.view.IGreetingView;


public class GreetingActivity extends AbstractActivity implements IGreetingView.IGreetingPresenter {

	private final Injector injector = Injector.INSTANCE;
	
	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		final IGreetingView view = injector.getGreetingView();
		view.setPresenter(this);
		container.setWidget(view.asWidget());
	}
}
