package com.gwt.client.main_module;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.gwt.client.main_module.mvp.place.GreetingPlace;
import com.gwt.client.main_module.mvp.place.UploadPlace;


@WithTokenizers({GreetingPlace.Tokenizer.class, UploadPlace.Tokenizer.class})
public interface DemoPlaceHistoryMapper extends PlaceHistoryMapper {
}
