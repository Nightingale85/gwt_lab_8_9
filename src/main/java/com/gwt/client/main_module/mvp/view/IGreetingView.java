package com.gwt.client.main_module.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface IGreetingView extends IsWidget {

	void setPresenter(IGreetingPresenter presenter);
	
	interface IGreetingPresenter {
	}
}
