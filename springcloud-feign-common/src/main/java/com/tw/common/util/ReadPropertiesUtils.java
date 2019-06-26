package com.tw.common.util;

import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.Properties;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 16:18 2019/6/26
 */
public class ReadPropertiesUtils {
    public static Properties getProperties() {
        Properties properties = new Properties();
        try {
            File file = ResourceUtils.getFile("classpath:message.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStream inputStream = new BufferedInputStream(fileInputStream);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
