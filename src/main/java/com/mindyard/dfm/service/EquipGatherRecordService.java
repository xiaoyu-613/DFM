package com.mindyard.dfm.service;

import com.mindyard.dfm.entity.EquipGatherRecord;

import java.util.List;

public interface EquipGatherRecordService {

    /**
     * 插入一条设备采集档案记录
     *
     * @param record 记录实体
     * @return 受影响行数
     */
    int insertRecord(EquipGatherRecord record);

    /**
     * 根据设备ID查询记录列表
     *
     * @param deviceId 手机设备ID
     * @return 记录列表
     */
    List<EquipGatherRecord> selectByDeviceId(String deviceId);
}
