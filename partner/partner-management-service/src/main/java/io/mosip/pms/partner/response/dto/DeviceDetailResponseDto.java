package io.mosip.pms.partner.response.dto;

import lombok.Data;

@Data
public class DeviceDetailResponseDto {
    private String deviceId;
    private String status;
    private boolean active;
}
