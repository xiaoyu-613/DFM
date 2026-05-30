package com.mindyard.dfm.mapper;

import com.mindyard.dfm.entity.EquipGatherRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EquipGatherRecordMapper {

    @Insert("INSERT INTO equip_gather_record (device_id, p_id, user_info, create_time) " +
            "VALUES (#{deviceId}, #{pId}, #{userInfo}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insertRecord(EquipGatherRecord record);

    @Select("SELECT id, device_id, p_id, user_info, create_time " +
            "FROM equip_gather_record WHERE device_id = #{deviceId}")
    @Results({
            @Result(property = "deviceId", column = "device_id"),
            @Result(property = "pId", column = "p_id"),
            @Result(property = "userInfo", column = "user_info"),
            @Result(property = "createTime", column = "create_time")
    })
    List<EquipGatherRecord> selectByDeviceId(String deviceId);
}
