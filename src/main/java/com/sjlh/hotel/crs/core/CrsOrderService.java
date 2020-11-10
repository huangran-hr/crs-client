package com.sjlh.hotel.crs.core;

import com.sjlh.hotel.crs.model.*;

/**
 * @Auther: HR
 * @Date 2020/11/6 16:10
 * @Description:
 */
public interface CrsOrderService {
    /**
     * CRS订单创建
     * @param orderCreateReq
     * @return
     */
    OrderCreateRsp create(OrderCreateReq orderCreateReq);

    /***
     * CRS订单取消
     * @param orderCancelReq
     * @return
     */
    CrsBaseResult cancel(OrderCancelReq orderCancelReq);

    /**
     * 查询详情
     * @param orderDetailReq
     * @return
     */
    OrderDetailRsp detail(OrderDetailReq orderDetailReq);
}
