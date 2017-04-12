package com.test.FileIO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/12 20:12 xuxinbin Exp $$
 */
public class ReadAndWriteFile {

    public static void main(String[] args) {
        String fileName = "枚举2.txt";
        String fileName2 = "枚举3.txt";
        String fileName3 = "枚举4.txt";
        try {
            //按字节读取文件
            //byte[] contentBytes = Files.readAllBytes(Paths.get(fileName));
            //Files.write(Paths.get(fileName3), contentBytes, StandardOpenOption.CREATE);

            //按行读取文件
            List<String> contentLines = Files.lines(Paths.get(fileName)).collect(java.util.stream.Collectors.toList());

            // fileContent.forEach(o->{System.out.println(o);});
            Files.write(Paths.get(fileName2), contentLines, Charset.defaultCharset(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
