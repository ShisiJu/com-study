package org.jss.tool;

import org.jss.tool.code.CommonCodeGenerator;
import org.jss.tool.code.impl.HtmlCodeGenerator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @author jushisi
 * @date 2019/9/5
 */

public class CodeTest {


    HtmlCodeGenerator htmlCodeGenerator = new HtmlCodeGenerator();
    CommonCodeGenerator commonCodeGenerator = new CommonCodeGenerator("input.txt", "template.txt", "E:\\workspace\\com-study\\code-generator\\src\\main\\resources\\code\\", htmlCodeGenerator);

    @Test
    public void test() throws IOException {

        commonCodeGenerator.handle();

    }


}
