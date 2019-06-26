package com.tw.common.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 15:55 2019/6/26
 */
@Data
public class TwException extends Exception implements Serializable {

    private static final long serialVersionUID = 4979053672256009604L;

    public TwException() {
        super(String.valueOf(100002));
    }


    public TwException(int code) {
        super(String.valueOf(code));
    }

    public TwException(String msg) {
        super(msg);
    }
}
