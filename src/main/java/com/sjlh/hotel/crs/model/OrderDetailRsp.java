package com.sjlh.hotel.crs.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther: HR
 * @Date: 2020/11/6 15:34
 * @Description:
 */

@Data
@EqualsAndHashCode(callSuper=false)
public class OrderDetailRsp extends CrsBaseResult {

    private String hotelCode;

    private String hotelName;

    private String roomTypeCode;

    private String roomTypeName;

    private Integer roomNum;

    private String rateCode;

    private String rateCodeName;

    private String statusCode;

    private String statusName;

    private String channelCode;

    private String channelName;

    private String resevationTypeCode;

    private String resevationTypeName;

    private String pmsResId;

    private String pmsCancelId;

    private String mobile;

    private Date arrival;

    private Date departure;

    private BigDecimal totalRevenue;

    private String chineseName;

    private String firstname;

    private String lastname;

    private String roomNo;

    private List<OrderInfoDetail> orderDetailList;

    private String crsId;

}
