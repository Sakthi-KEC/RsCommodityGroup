package net.microservices.RsCommodityGroup.appUtil;

import net.microservices.RsCommodityGroup.dto.RsCommodityGroupDto;
import net.microservices.RsCommodityGroup.model.RsCommodityGroup;
import org.springframework.beans.BeanUtils;

public class AppUtil
{

    public static RsCommodityGroup GroupDtoToEntity(RsCommodityGroupDto dto)
    {
        RsCommodityGroup ungroup=new RsCommodityGroup();
        BeanUtils.copyProperties(dto,ungroup);
        return ungroup;
    }

    public static RsCommodityGroupDto GroupEntityToDto(RsCommodityGroup entity)
    {
        RsCommodityGroupDto dto=new RsCommodityGroupDto();
        BeanUtils.copyProperties(entity,dto);
        return dto;
    }

}
