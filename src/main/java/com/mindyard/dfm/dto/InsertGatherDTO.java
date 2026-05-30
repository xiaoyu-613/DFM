package com.mindyard.dfm.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "采集档案登记请求参数")
public class InsertGatherDTO {

    @Schema(description = "手机设备ID", example = "DEV-001")
    private String deviceId;

    @Schema(description = "监测人编号", example = "P-001")
    private String pId;

    @Schema(description = "前端传来的完整用户信息(JSON格式)", example = "{\"name\":\"张三\",\"age\":30}")
    private String userInfo;
}
