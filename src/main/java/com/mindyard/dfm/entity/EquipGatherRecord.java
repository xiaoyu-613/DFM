package com.mindyard.dfm.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EquipGatherRecord {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 手机设备ID
     */
    private String deviceId;

    /**
     * 监测人编号
     */
    private String pId;

    /**
     * 前端传来的完整用户信息(JSON格式)
     */
    private String userInfo;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
