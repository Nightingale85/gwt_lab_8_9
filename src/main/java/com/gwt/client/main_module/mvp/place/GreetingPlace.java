package com.gwt.client.main_module.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class GreetingPlace extends Place {
	private static final String VIEW_HISTORY_TOKEN = "greeting";
	
	@Prefix(value = VIEW_HISTORY_TOKEN)
	public static class Tokenizer implements PlaceTokenizer<GreetingPlace> {
		@Override
		public GreetingPlace getPlace(String token) {
			return new GreetingPlace();
		}

		@Override
		public String getToken(GreetingPlace place) {
			return "";
		}
	}
}
