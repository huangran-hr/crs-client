package com.sjlh.hotel.crs.model;

import lombok.Data;

/**
 * @Auther: HR
 * @Description:
 */
@Data
public class OrderDetailReq {

    private Integer crsOrderId;

    public Integer getCrsOrderId() {
        return crsOrderId;
    }

}
