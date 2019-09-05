package org.jss.tool.code.impl;


import org.jss.tool.code.AbstractCodeGenerator;
import org.jss.tool.code.CodeGenerator;
import org.jss.tool.util.DateUtils;

import java.io.*;
import java.util.stream.Collectors;

/**
 * @author Administrator
 * @date 2019/9/5
 */

public class CommonCodeGenerator extends AbstractCodeGenerator {

    @Override
    public String handleInputStream() throws IOException {
        try (Reader reader = new FileReader(this.pathName + this.fileName);
             Reader templateReader = new FileReader(this.pathName + this.templateName);
             BufferedReader bufferedReader = new BufferedReader(reader);
             BufferedReader formatReader = new BufferedReader(templateReader)) {

            String line = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder();
            String format = formatReader.lines().collect(Collectors.joining(" "));
            while (line != null) {
                String handledString = this.codeGenerator.handleInputLine(format, line);
                stringBuilder.append(handledString);
                stringBuilder.append("\n");
                line = bufferedReader.readLine();
            }
            return stringBuilder.toString();
        }
    }

    @Override
    public void handleOut(String lines) throws IOException {
        File file = new File(this.pathName + "output-" + getSuffix());
        try (Writer writer = new FileWriter(file)) {
            writer.write(lines);
        }

    }

    @Override
    public void handle() throws IOException {
        String handledString = handleInputStream();
        handleOut(handledString);
    }

    private String getSuffix() {
        return DateUtils.getDate();
    }


    public CommonCodeGenerator(String fileName, String templateName, String pathName, CodeGenerator codeGenerator) {
        super(fileName, templateName, pathName, codeGenerator);
    }


}
