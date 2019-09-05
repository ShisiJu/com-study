package tool.code.impl;


import tool.code.CodeGenerator;

/**
 * @author jushisi
 * @date 2019/9/2
 */

public class HtmlCodeGenerator implements CodeGenerator {

    public String handleInputLine(String format, String line) {
        if (line == null) {
            return "\n";
        }

        String[] split = line.split("\\t");

        String formatted = "";
        formatted = format.replace("${field}", split[0]);
        formatted = formatted.replace("${name}", split[1]);

        return formatted;
    }
}
