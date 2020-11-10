package com.sjlh.hotel.crs.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Auther: HR
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class OrderCreateRsp extends CrsBaseResult {

    private String crs_order_id;

    private Integer splitOrderId;

    public String splitOrderIds;
}
