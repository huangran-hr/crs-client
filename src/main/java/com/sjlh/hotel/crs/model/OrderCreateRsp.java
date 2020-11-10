package com.sjlh.hotel.crs.model;

import lombok.Data;

/**
 * @Auther: HR
 * @Description:
 */
@Data
public class OrderCreateRsp extends CrsBaseResult {

    private String crs_order_id;

    private Integer splitOrderId;

    public String splitOrderIds;
}
