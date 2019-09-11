package org.jss.tool;

import org.jss.tool.code.AbstractCodeGenerator;
import org.jss.tool.code.impl.CommonCodeGenerator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author jushisi
 * @date 2019/9/5
 */

public class CodeTest {


    AbstractCodeGenerator commonCodeGenerator = new CommonCodeGenerator("input.txt", "template.txt", "E:\\workspace\\com-study\\code-generator\\src\\main\\resources\\code\\");

    @Test
    public void test() throws IOException {


        commonCodeGenerator.setCodeHandler((format, line) -> {
            if (line == null) {
                return "\n";
            }

            String[] split = line.split("\\s");

            String formatted = "";
            formatted = format.replace("${field1}", split[0]);
            formatted = formatted.replace("${name1}", split[1]);
            formatted = formatted.replace("${field2}", split[2]);
            formatted = formatted.replace("${name2}", split[3]);

            return formatted;
        });
        commonCodeGenerator.handle();

    }


}
