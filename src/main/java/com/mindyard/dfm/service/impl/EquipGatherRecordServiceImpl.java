package com.mindyard.dfm.service.impl;

import com.mindyard.dfm.entity.EquipGatherRecord;
import com.mindyard.dfm.mapper.EquipGatherRecordMapper;
import com.mindyard.dfm.service.EquipGatherRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipGatherRecordServiceImpl implements EquipGatherRecordService {

    private final EquipGatherRecordMapper mapper;

    public EquipGatherRecordServiceImpl(EquipGatherRecordMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int insertRecord(EquipGatherRecord record) {
        return mapper.insertRecord(record);
    }

    @Override
    public List<EquipGatherRecord> selectByDeviceId(String deviceId) {
        return mapper.selectByDeviceId(deviceId);
    }
}
