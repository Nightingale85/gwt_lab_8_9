package com.gwt.client.login_module;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.gwt.client.main_module.i18n.Message;
import com.gwt.client.main_module.mvp.view.ILoginView;

/**
 * @author Sergiy_Solovyov
 */
public class LoginView extends Composite implements ILoginView {

    private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);
    private ILoginPresenter presenter;
    @UiField(provided = true)
    final Message i18n;
    @UiField
    TextBox loginBox;
    @UiField
    TextBox passwordBox;
    @UiField
    Button buttonSubmit;

    public LoginView() {
        this.i18n = GWT.create(Message.class);
        initWidget(uiBinder.createAndBindUi(this));
    }

    public static LoginUiBinder getUiBinder() {
        return uiBinder;
    }

    public static void setUiBinder(LoginUiBinder uiBinder) {
        LoginView.uiBinder = uiBinder;
    }


    public Message getI18n() {
        return i18n;
    }

    public TextBox getLoginBox() {
        return loginBox;
    }

    public void setLoginBox(TextBox loginBox) {
        this.loginBox = loginBox;
    }

    public TextBox getPasswordBox() {
        return passwordBox;
    }

    public void setPasswordBox(TextBox passwordBox) {
        this.passwordBox = passwordBox;
    }

    public Button getButtonSubmit() {
        return buttonSubmit;
    }

    public void setButtonSubmit(Button buttonSubmit) {
        this.buttonSubmit = buttonSubmit;
    }

    @Override
    public void setPresenter(ILoginPresenter presenter) {
        this.presenter = presenter;
    }

    @UiTemplate("LoginView.ui.xml")
    interface LoginUiBinder extends UiBinder<Widget, LoginView> {
    }

    @UiHandler("buttonSubmit")
    public void onClickSubmitButton(ClickEvent clickEvent) {

        final RequestBuilder request = new RequestBuilder(RequestBuilder.POST, GWT.getHostPageBaseURL()
                + "public/login");
        request.setHeader("Content-Type", "application/x-www-form-urlencoded");

        final String urlUser = URL.encodeQueryString(loginBox.getText());
        final String urlPass = URL.encodeQueryString(passwordBox.getText());
        final String requestData = "j_username" + "=" + urlUser + "&j_password" + "=" + urlPass
                + "&_spring_security_remember_me=true";
        try {
            request.sendRequest(requestData, new RequestCallback() {
                @Override
                public void onResponseReceived(final Request request, final Response response) {
                    Window.Location.assign("/main.html");
                }

                @Override
                public void onError(final Request request, final Throwable exception) {
                    Window.alert("Wrong login or password");
                }
            });
        } catch (final RequestException e) {
           e.printStackTrace();
        }
    }

}