package com.test.base;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;

/**
 * 最终的枚举模板如下：
 *  NAME_I("TYPE", "NO", "DESC"),
 *  ..
 *  NAME_Z("TYPE", "NO", "DESC");
 *
 * 如是否授信枚举：
 *  IS_CREDITED_1("ISCREDITED", "1", "是"),
 *  IS_CREDITED_2("ISCREDITED", "0", "否");
 *
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/12 19:24 xuxinbin Exp $$
 */
public class CreateEnumForCustomerInfo {
    public static void main(String[] args) {
        String fileName = "枚举2.txt";
        String fileName2 = "最终枚举.txt";

        String annotations = "//";
        String left = "(\"";
        String right = "\"),\n";
        System.out.println(annotations);
        try {
            //按行读取文件
            List<String> contentLines = Files.lines(Paths.get(fileName)).collect(java.util.stream.Collectors.toList());
            System.out.println("所有行数：" + contentLines.size());
            List<String> contentLinesNoEmptyLine = Lists.newArrayList();
            //去掉空行
            for (String line : contentLines) {
                if (StringUtils.isNotEmpty(line)) {
                    contentLinesNoEmptyLine.add(line);
                }
            }
            int lineCount = contentLinesNoEmptyLine.size();
            System.out.println("去掉空行之后的行数：" + lineCount);

            //循环几次
            //int circleTimes = lineCount / 3;
            //System.out.println("circleTimes = " + circleTimes);
            for (int i=0; i<lineCount; i+=3) {
                System.out.println(i);
                Files.write(Paths.get(fileName2), ("\n" + annotations + contentLinesNoEmptyLine.get(i+1) + "\n").getBytes(Charset.defaultCharset()), StandardOpenOption.APPEND);

                //获取各个枚举key和value
                String[] keys = contentLinesNoEmptyLine.get(i+2).split(" ");
                for (String key : keys) {
                    String[] keyValue = key.split(":");
                    String type = StringUtils.upperCase(contentLinesNoEmptyLine.get(i));
                    String no = keyValue[0];
                    String desc = keyValue[1];
                    String name = type + "_" + StringUtils.upperCase(no);

                    String resultLine = name + left + type.replace("_", "") + "\", \""
                            + no + "\", \"" + desc + right;
                    Files.write(Paths.get(fileName2), resultLine.getBytes(Charset.defaultCharset()), StandardOpenOption.APPEND);
                }
            }

            //Files.write(Paths.get(fileName2), contentLines, Charset.defaultCharset(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
