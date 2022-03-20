package net.microservices.RsCommodityGroup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RsCommodityGroupDto
{
    private String commodityGroupCode;
    private String commodityGroupName;
    private String createdBy;
    private String createdDate;
}
