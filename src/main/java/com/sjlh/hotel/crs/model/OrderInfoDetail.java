package com.sjlh.hotel.crs.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author HR
 * @date 2020/11/6 16:06
 */
@Data
public class OrderInfoDetail {

    private Date roomDate;

    private BigDecimal roomPrice;

    private String statusCode;

    private boolean isInverse;
}
