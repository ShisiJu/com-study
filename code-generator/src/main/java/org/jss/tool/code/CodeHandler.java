package org.jss.tool.code;


/**
 * @author jushisi
 * @date 18:47 2019/9/4
 **/
public interface CodeHandler {

    /**
     * 处理模板数据,并返回格式化后的数据
     *
     * @param format 模板数据
     * @param line   要填充的数据行,以\t 分隔
     * @return 返回格式化后的数据
     * @author jushisi
     * @date 9:29 2019/9/5
     **/
    String handleInputLine(String format, String line) ;

}
