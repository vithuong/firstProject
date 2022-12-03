package com.vvthuong.date;

import java.text.SimpleDateFormat;
import java.util.Date;

// 3 ham nay dung muon doi luon.
// cach chung ta dung ham rat quan trong
// giong nhu hop den, ben trong dau vao co tham so, dau ra cai gi, the la xong
// rat it nguoi nam vung cai nay, nen khi viet code rat la dai, khi thu vien hoa no se ngan cai code xuong
// cu can ham nao ta goi ham do ra su dung, the thoi.
public class XDate {
	static SimpleDateFormat sdf = new SimpleDateFormat();

	public static Date dateParse(String s, String partern) {
		try {
			sdf.applyPattern(partern);
			Date date = sdf.parse(s);
			return date;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public static String dateFormat(Date date, String partern) {
		sdf.applyPattern(partern);
		String time = sdf.format(date);
		return time;
	}

	public static Date dateAdd(Date date, long hours) {
		date.setTime(date.getTime() + hours * 60 * 60 * 1000);
		return date;
	}
}
