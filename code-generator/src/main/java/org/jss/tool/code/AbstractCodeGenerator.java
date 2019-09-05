package org.jss.tool.code;

import java.io.*;

/**
 * 处理代码生成,抽象为公共基类
 *
 * @author jushisi
 * @date 2019/9/5
 */

public abstract class AbstractCodeGenerator {

    protected String fileName;
    protected String templateName;
    protected String pathName;
    protected CodeHandler codeHandler;

    protected AbstractCodeGenerator(String fileName, String templateName, String pathName, CodeHandler codeHandler) {
        this.fileName = fileName;
        this.templateName = templateName;
        this.pathName = pathName;
        this.codeHandler = codeHandler;
    }

    /**
     * 处理输入流
     *
     * @return 返回处理后的行
     * @throws IOException 可能读取文件错误
     * @author jushisi
     * @date 11:40 2019/9/5
     **/
    public abstract String handleInputStream() throws IOException;


    /**
     * 处理输入流
     *
     * @param lines 输出处理过的行
     * @throws IOException 可能读取文件错误
     * @author jushisi
     * @date 11:40 2019/9/5
     **/
    public abstract void handleOut(String lines) throws IOException;


    /**
     * 执行代码生成处理
     *
     * @throws IOException 可能读取文件错误
     * @author jushisi
     * @date 11:42 2019/9/5
     **/
    public abstract void handle() throws IOException;


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public CodeHandler getCodeHandler() {
        return codeHandler;
    }

    public void setCodeHandler(CodeHandler codeHandler) {
        this.codeHandler = codeHandler;
    }


}
