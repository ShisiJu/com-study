package tool.code;


import tool.util.DateUtils;

import java.io.*;
import java.util.stream.Collectors;

/**
 * @author Administrator
 * @date 2019/9/5
 */

public class CommonCodeGenerator {


    private String fileName;
    private String templateName;
    private String pathName;
    private CodeGenerator codeGenerator;
    private int count = 0;


    public String handleInputStream() throws IOException {
        try (Reader reader = new FileReader(this.pathName + this.fileName);
             Reader templateReader = new FileReader(this.pathName + this.templateName);
             BufferedReader bufferedReader = new BufferedReader(reader);
             BufferedReader formatReader = new BufferedReader(templateReader)) {

            String line = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder();
            String format = formatReader.lines().collect(Collectors.joining(" "));
            while (line != null) {
                line = bufferedReader.readLine();
                String handledString = this.codeGenerator.handleInputLine(format, line);
                stringBuilder.append(handledString);
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        }

    }


    public void handleOut(String lines) throws IOException {
        String date = DateUtils.getDate();
        File file = new File(this.pathName + "output-" + date + "-" + count++);
        try (Writer writer = new FileWriter(file)) {
            writer.write(lines);
        }

    }


    public void handle() throws IOException {
        String handledString = handleInputStream();
        handleOut(handledString);
    }

    protected String getSuffix() {
        return DateUtils.getDate();
    }


}
