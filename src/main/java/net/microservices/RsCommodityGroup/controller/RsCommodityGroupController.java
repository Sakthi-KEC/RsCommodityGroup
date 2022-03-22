package net.microservices.RsCommodityGroup.controller;

import net.microservices.RsCommodityGroup.dto.RsCommodityGroupDto;
import net.microservices.RsCommodityGroup.service.RsCommodityGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/commoditygroup")

public class RsCommodityGroupController
{

    @Autowired
    private RsCommodityGroupService service;


    @PostMapping
    public Mono<RsCommodityGroupDto> addcCommodityGroup(@RequestBody Mono<RsCommodityGroupDto> commodityGroup)
    {
        return service.addCommodityGroup(commodityGroup);
    }

    @GetMapping("/groupcodes")
    public Mono<List<String>> getAllCommodityGroupCode()
    {
        return service.getAllCommodityGroupCode();
    }

}
