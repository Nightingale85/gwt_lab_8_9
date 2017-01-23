package com.gwt.client.main_module.mvp.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.gwt.client.main_module.gin.Injector;
import com.gwt.client.main_module.mvp.view.IUploadView;


public class UploadActivity extends AbstractActivity implements IUploadView.IUploadPresenter {

	private final Injector injector = Injector.INSTANCE;
	
	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		final IUploadView view = injector.getUploadView();
		view.setPresenter(this);
		container.setWidget(view.asWidget());
	}
}
