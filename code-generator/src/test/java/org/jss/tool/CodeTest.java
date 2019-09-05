package org.jss.tool;

import org.jss.tool.code.AbstractCodeGenerator;
import org.jss.tool.code.impl.CommonCodeGenerator;
import org.jss.tool.code.impl.HtmlCodeHandler;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @author jushisi
 * @date 2019/9/5
 */

public class CodeTest {


    HtmlCodeHandler htmlCodeHandler = new HtmlCodeHandler();
    AbstractCodeGenerator commonCodeGenerator = new CommonCodeGenerator("input.txt", "template.txt", "E:\\workspace\\com-study\\code-generator\\src\\main\\resources\\code\\", htmlCodeHandler);

    @Test
    public void test() throws IOException {

        commonCodeGenerator.handle();

    }


}
