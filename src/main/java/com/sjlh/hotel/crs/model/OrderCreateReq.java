package com.sjlh.hotel.crs.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Auther: HR
 * @Date 2020/11/9 11:27
 * @Description:
 */
@Data
public class OrderCreateReq {
    private Long id;

    /**
     * 渠道ID
     */
    private Integer channelId; //

    /**
     *
     */
    private String orderNo;

    /**
     * OTA提供订单号，取消OTA订单使用
     */
    private String otaOrderNo;

    /**
     * 总价
     */
    private Double totalPrice;

    /**
     * 房间数量
     */
    private Integer roomCount;

    private String pmsHotelCode;

    private String roomTypeCode;

    /**
     * 入住时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date checkInDate;

    /**
     * 离店时间
     */
    @JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT+8")
    private Date checkOutDate;

    private String rateCode;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    private String remarks;

    private String productName;

    /**
     * 客户名称
     */
    private String travelAgency;

    /**
     *
     */
    private String accountOfTravelAgency;

    /**
     * 市场
     */
    private String market;

    /**
     * 来源
     */
    private String source;

    /**
     * 客人类型
     */
    private String guesttypeCode;

    private String reservationType;

    /**
     * 携程判断是否闪住
     */
    private String bookerEmail;

    private List<OrderDayPrice> dayPrices;

    private List<OrderGuest> guests;
}
