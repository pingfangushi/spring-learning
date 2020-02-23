package com.pingfangushi.example;

import lombok.Builder;
import lombok.Data;

/**
 * Result 通用返回工具类
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/1/29 19:03
 */
@Data
@Builder
public class Result {
    /**
     * 成功CODE
     */
    public static final String SUCCESS_CODE = "200";
    /**
     * 成功MSG
     */
    public static final String SUCCESS_MSG = "SUCCESS!";
    /**
     * code
     */
    private String code;
    /**
     * msg
     */
    private String msg;
    /**
     * data
     */
    private Object data;
}
