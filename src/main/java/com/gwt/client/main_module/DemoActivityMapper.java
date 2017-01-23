package com.gwt.client.main_module;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.gwt.client.main_module.mvp.activity.GreetingActivity;
import com.gwt.client.main_module.mvp.place.GreetingPlace;
import com.gwt.client.main_module.mvp.activity.UploadActivity;
import com.gwt.client.main_module.mvp.place.UploadPlace;


public class DemoActivityMapper implements ActivityMapper {
	
	@Override
	public Activity getActivity(Place place) {
		 if (place instanceof GreetingPlace) {
			return new GreetingActivity();
		}else if (place instanceof UploadPlace) {
			return new UploadActivity();
		}
		return null;
	}
}
