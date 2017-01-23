package com.gwt.client.main_module.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class UploadPlace extends Place {
	private static final String VIEW_HISTORY_TOKEN = "upload";
	
	@Prefix(value = VIEW_HISTORY_TOKEN)
	public static class Tokenizer implements PlaceTokenizer<UploadPlace> {
		@Override
		public UploadPlace getPlace(String token) {
			return new UploadPlace();
		}

		@Override
		public String getToken(UploadPlace place) {
			return "";
		}
	}
}
