package net.microservices.RsCommodityGroup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "commodityGroup")
public class RsCommodityGroup
{
    @Id
    private String commodityGroupCode;

    private String commodityGroupName;
    private String createdBy;
    private String createdDate;

}
