package com.cognizant.vehicle.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) throws ParseException {
<<<<<<< HEAD

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(date);
		return d;

}}
=======
<<<<<<< HEAD


		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(date);
=======
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sd.parse(date);
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
		return d;
	}
}
>>>>>>> 50a4cc2512b2c01fa927af4590fcd17127a6cf58
