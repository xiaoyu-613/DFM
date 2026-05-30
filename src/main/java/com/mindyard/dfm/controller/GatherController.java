package com.mindyard.dfm.controller;

import com.mindyard.dfm.common.Result;
import com.mindyard.dfm.dto.InsertGatherDTO;
import com.mindyard.dfm.entity.EquipGatherRecord;
import com.mindyard.dfm.service.EquipGatherRecordService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@Tag(name = "采集档案与业务接口", description = "设备采集档案登记、查询及相关业务接口")
public class GatherController {

    private final EquipGatherRecordService service;

    public GatherController(EquipGatherRecordService service) {
        this.service = service;
    }

    // ==================== 核心业务接口 ====================

    @PostMapping("/equip/useInfo/combine/insertGather")
    @Operation(summary = "采集档案登记", description = "登记一条设备采集档案记录")
    public Result<Void> insertGather(@RequestBody InsertGatherDTO dto) {
        EquipGatherRecord record = new EquipGatherRecord();
        record.setDeviceId(dto.getDeviceId());
        record.setPId(dto.getPId());
        record.setUserInfo(dto.getUserInfo());
        record.setCreateTime(LocalDateTime.now());
        service.insertRecord(record);
        return Result.success();
    }

    @GetMapping("/equip/useInfo/combine/selectGatherByDeviceId")
    @Operation(summary = "查询采集档案", description = "根据设备ID查询相关采集档案记录")
    public Result<List<EquipGatherRecord>> selectGatherByDeviceId(
            @Parameter(description = "手机设备ID", example = "DEV-001")
            @RequestParam String deviceId) {
        List<EquipGatherRecord> records = service.selectByDeviceId(deviceId);
        return Result.success(records);
    }

    // ==================== 预留 Mock 接口 ====================

    @GetMapping("/monitor/alerts")
    @Operation(summary = "获取预警列表", description = "预留接口，返回 Mock 数据")
    public Result<String> monitorAlerts() {
        return Result.success("预警列表 Mock 数据");
    }

    @PostMapping("/monitor/alerts/handle")
    @Operation(summary = "处理预警", description = "预留接口，返回 Mock 数据")
    public Result<String> handleAlert() {
        return Result.success("处理预警成功 (Mock)");
    }

    @PostMapping("/report/generate")
    @Operation(summary = "生成报表", description = "预留接口，返回 Mock 数据")
    public Result<String> generateReport() {
        return Result.success("报表生成成功 (Mock)");
    }

    @GetMapping("/device/list")
    @Operation(summary = "获取设备列表", description = "预留接口，返回 Mock 数据")
    public Result<String> deviceList() {
        return Result.success("设备列表 Mock 数据");
    }

    @PostMapping("/device/config")
    @Operation(summary = "设备配置", description = "预留接口，返回 Mock 数据")
    public Result<String> deviceConfig() {
        return Result.success("设备配置成功 (Mock)");
    }

    @GetMapping("/audit/logs")
    @Operation(summary = "审计日志", description = "预留接口，返回 Mock 数据")
    public Result<String> auditLogs() {
        return Result.success("审计日志 Mock 数据");
    }

    @GetMapping("/user/profile")
    @Operation(summary = "用户信息", description = "预留接口，返回 Mock 数据")
    public Result<String> userProfile() {
        return Result.success("用户信息 Mock 数据");
    }

    @PostMapping("/user/profile/update")
    @Operation(summary = "更新用户信息", description = "预留接口，返回 Mock 数据")
    public Result<String> updateUserProfile() {
        return Result.success("更新用户信息成功 (Mock)");
    }

    @PostMapping("/feedback/submit")
    @Operation(summary = "反馈提交", description = "预留接口，返回 Mock 数据")
    public Result<String> feedbackSubmit() {
        return Result.success("反馈提交成功 (Mock)");
    }

    @PostMapping("/get_json_single")
    @Operation(summary = "运动心电数据", description = "预留接口，返回 Mock 数据")
    public Result<String> getJsonSingle() {
        return Result.success("运动心电 Mock 数据");
    }
}
