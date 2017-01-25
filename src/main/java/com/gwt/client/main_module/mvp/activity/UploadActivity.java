package com.gwt.client.main_module.mvp.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.gwt.client.main_module.gin.Injector;
import com.gwt.client.main_module.mvp.view.IUploadView;
import com.gwt.client.upload_module.UploadView;


public class UploadActivity extends AbstractActivity implements IUploadView.IUploadPresenter {

	private final Injector injector = Injector.INSTANCE;

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		final IUploadView view = injector.getUploadView();
		view.setPresenter(this);
		container.setWidget(view.asWidget());
		bindEvents();
	}

	@Override
	public void clear() {
		final UploadView uploadView = injector.getUploadView();
		uploadView.getClearButton().addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				uploadView.getTable().removeAllRows();
			}
		});
	}

	@Override
	public void submit() {
		final UploadView uploadView = injector.getUploadView();
		uploadView.getUploadButton().addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				uploadView.getUploadForm().submit();
			}
		});
	}

	public void bindEvents(){
		clear();
		submit();
	}
}
