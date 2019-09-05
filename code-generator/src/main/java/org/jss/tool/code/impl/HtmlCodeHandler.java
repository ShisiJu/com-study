package org.jss.tool.code.impl;


import org.jss.tool.code.CodeHandler;

/**
 * @author jushisi
 * @date 2019/9/2
 */

public class HtmlCodeHandler implements CodeHandler {

    @Override
    public String handleInputLine(String format, String line) {
        if (line == null) {
            return "\n";
        }

        String[] split = line.split("\\s");

        String formatted = "";
        formatted = format.replace("${field}", split[0]);
        formatted = formatted.replace("${name}", split[1]);

        return formatted;
    }
}
