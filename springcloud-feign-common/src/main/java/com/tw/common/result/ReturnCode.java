package com.tw.common.result;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 16:15 2019/6/26
 */
public enum ReturnCode {
    /**
     * 操作成功
     */
    SUCCESS(100000),
    FAIL(100001);

    ReturnCode(Integer value) {
        this.val = value;
    }

    public Integer val() {
        return val;
    }

    private Integer val;
}
