package com.gwt.client.main_module.i18n;


import com.google.gwt.i18n.client.LocalizableResource;
import com.google.gwt.i18n.client.Messages;

/**
 * @author Sergiy_Solovyov
 */
@LocalizableResource.DefaultLocale("en")
public interface Message extends Messages {
    String login();

    String password();

    String submit();

    String logout();

    String morning();

    String day();

    String evening();

    String night();

    String greeting();
}
