package com.tw.common.result;

import com.tw.common.util.ReadPropertiesUtils;
import lombok.Data;

import java.io.Serializable;
import java.util.Properties;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 16:09 2019/6/26
 */
@Data
public class ReturnVo implements Serializable{
    private static final Properties properties = ReadPropertiesUtils.getProperties();
    /**
     * 返回代码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 返回成功无结果
     */
    public ReturnVo() {
        this.setCode(ReturnCode.SUCCESS.val());
        this.setMessage(properties.getProperty(ReturnCode.SUCCESS.val() + ""));
    }

    /**
     * 异常返回
     *
     * @param code
     */
    public ReturnVo(Integer code) {
        this.setCode(code);
        this.setMessage(properties.getProperty(code + ""));
    }

    /**
     * 异常返回
     *
     * @param message
     */
    public ReturnVo(String message) {
        this.setCode(ReturnCode.FAIL.val());
        this.setMessage(message);
    }

    /**
     * 默认值返回，默认返回正确的code和message
     *
     * @param data
     */
    public ReturnVo(Object data) {
        this.setCode(ReturnCode.SUCCESS.val());
        this.setMessage(properties.getProperty(ReturnCode.SUCCESS.val() + ""));
        this.setData(data);
    }

    /**
     * 构造自定义的code，message，以及data
     *
     * @param code
     * @param message
     * @param data
     */
    public ReturnVo(Integer code, String message, Object data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    @Override
    public String toString() {
        return "ReturnVO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
