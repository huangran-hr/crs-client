package com.sjlh.hotel.crs.model;

import lombok.Data;

@Data
public class OrderCancelReq {

    private String crsOrderId;

    private String comments;
}
