package com.dianping.process;

import com.dianping.enums.ContentTypeEnum;

import java.util.Random;

/**
 * Created by snail on 10/16/16.
 */
public class ProcessFactory {
    public static String format(String str){
        Process process = getProcess(getContentType(str));

        return process.format(str);
    }

    private static ContentTypeEnum getContentType(String str){
        Random random = new Random();
        return ContentTypeEnum.getContentType(random.nextInt(4)+1);
    }

    //根据数据类型获取对于的处理器
    private static Process getProcess(ContentTypeEnum contentTypeEnum){
        Process process = null;

        switch (contentTypeEnum){
            case URL:
                process = new UrlProcess();
                break;
            case PLAINTTEXT:
                process = new PlainTextProcess();
                break;
            case KEY:
                process = new KeyProcess();
                break;
            default:
                process = new DefaultProcess();
        }
        return process;
    }
}
