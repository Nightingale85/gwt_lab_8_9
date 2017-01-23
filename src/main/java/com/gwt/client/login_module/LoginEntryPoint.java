package com.gwt.client.login_module;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class LoginEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		LoginView view = new LoginView();
		RootPanel.get().add(view);
	}
}
