package net.microservices.RsCommodityGroup.service;


import net.microservices.RsCommodityGroup.appUtil.AppUtil;
import net.microservices.RsCommodityGroup.controller.RsCommodityGroupController;
import net.microservices.RsCommodityGroup.dto.RsCommodityGroupDto;
import net.microservices.RsCommodityGroup.exception.CustomException;
import net.microservices.RsCommodityGroup.repository.RsCommodityGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class RsCommodityGroupService
{

    @Autowired
    private RsCommodityGroupRepository commoditygrouprepo;
    @Autowired
    private RsCommodityGroupController controller;


    // Adding new RsCommodityGroup to the Repo
    public Mono<RsCommodityGroupDto> addCommodityGroup(Mono<RsCommodityGroupDto> com_grp)
    {
        return  com_grp.map(AppUtil::GroupDtoToEntity).flatMap(commoditygrouprepo::insert).map(AppUtil::GroupEntityToDto);
    }

    // Getting all Groupcodes
    public Mono<List<String>> getAllCommodityGroupCode()
    {
        return commoditygrouprepo.findAll()
                .map(AppUtil::GroupEntityToDto)
                .map(a->a.getCommodityGroupCode())
                .collect(Collectors.toList());
    }

}
