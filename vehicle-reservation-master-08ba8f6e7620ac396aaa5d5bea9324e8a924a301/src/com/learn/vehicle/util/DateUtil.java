package com.learn.vehicle.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) throws ParseException {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
		Date d = sd.parse(date);
		return d;
	}
}
