package com.pingfangushi.learning;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 配置信息
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/2/18 22:09
 */
@Data
@Builder
public class ConfigureInfo implements Serializable {
    /**
     * ID
     */
    private String id;
    /**
     * IP地址
     */
    private String ip;
}
