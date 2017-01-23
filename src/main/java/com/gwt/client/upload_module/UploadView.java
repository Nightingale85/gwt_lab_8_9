package com.gwt.client.upload_module;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.gwt.client.main_module.mvp.view.IUploadView;



public class UploadView extends Composite implements IUploadView {
	interface UploadViewUiBinder extends UiBinder<Widget, UploadView> {	}
	private static UploadViewUiBinder uiBinder = GWT.create(UploadViewUiBinder.class);

	@UiField
	FlexTable table;
	@UiField
	Button uploadButton;
	@UiField
	Button clearButton;
	@UiField
	FormPanel uploadForm;
	@UiField
	FileUpload uploadField;
	private IUploadPresenter presenter;

	public UploadView() {
		initWidget(uiBinder.createAndBindUi(this));
		uploadForm.setAction("/upload");
		uploadForm.setEncoding(FormPanel.ENCODING_MULTIPART);
		uploadForm.setMethod(FormPanel.METHOD_POST);
		uploadForm.addSubmitHandler(new FormPanel.SubmitHandler() {
			@Override
			public void onSubmit(FormPanel.SubmitEvent event) {
				final String filename = uploadField.getFilename();
				int length = filename.length();
				if (!".csv".equals(filename.substring(length - 4, length))) {
					Window.alert("You must choose .csv file");
					event.cancel();
				}
			}
		});
		uploadForm.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
			@Override
			public void onSubmitComplete(FormPanel.SubmitCompleteEvent event) {
				table.setHTML(0, 0, event.getResults());
			}
		});
	}

	@Override
	public void setPresenter(IUploadView.IUploadPresenter presenter) {
		this.presenter = presenter;
	}

	@UiHandler("uploadButton")
	public void onClickUploadButton(ClickEvent clickEvent) {
		uploadForm.submit();
	}

	@UiHandler("clearButton")
	public void onClickClearButton(ClickEvent clickEvent) {
		table.removeAllRows();
	}
}
