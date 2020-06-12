package com.pingfangushi.learning;

/**
 * ExampleServiceImpl
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/1/29 18:22
 */
public class ExampleServiceImpl implements ExampleService {
    /**
     * ID
     */
    private String id;
    /**
     * ip
     */
    private String ip;

    /**
     * 构造函数
     *
     * @param id ID
     * @param ip IP
     */
    public ExampleServiceImpl(String id, String ip) {
        this.id = id;
        this.ip = ip;
    }


    /**
     * 获取配置信息
     *
     * @return {@link ConfigureInfo}
     */
    @Override
    public ConfigureInfo configInfo() {
        return ConfigureInfo.builder()
                .id(this.id)
                .ip(this.ip).build();
    }
}
