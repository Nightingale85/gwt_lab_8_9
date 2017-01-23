package com.gwt.client.main_module.utils;


import java.util.Date;


/**
 * @author Sergiy_Solovyov
 */
public class DayPartUtil {

    public static DayPart getDayPart(Date date){
        int hour = date.getHours();
        if (6 <= hour && hour < 9){
            return DayPart.MORNING;
        } else if (9 <= hour && hour < 19){
            return DayPart.DAY;
        } else if (19 <= hour && hour < 23){
            return DayPart.EVENING;
        } else return DayPart.NIGHT;
    }
}
