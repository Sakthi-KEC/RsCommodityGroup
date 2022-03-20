package net.microservices.RsCommodityGroup.repository;

import net.microservices.RsCommodityGroup.model.RsCommodityGroup;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface RsCommodityGroupRepository extends ReactiveMongoRepository<RsCommodityGroup,String>
{
    Mono<RsCommodityGroup> findByCommodityGroupNameIgnoreCase(String name);
}
