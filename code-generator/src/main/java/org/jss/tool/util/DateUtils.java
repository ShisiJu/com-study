package org.jss.tool.util;

import java.util.Calendar;

/**
 * @author jushisi
 * @date 2019/9/5
 */

public class DateUtils {

    public static String getDate() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        return year + "-" + month + "-" + date;
    }

}
