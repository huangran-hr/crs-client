/**
 *
 */
package com.sjlh.hotel.crs.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjlh.hotel.common.net.Invoker;
import com.sjlh.hotel.common.net.InvokerFactory;
import com.sjlh.hotel.common.net.InvokerParam;
import com.sjlh.hotel.common.net.InvokerParamBuilder;
import com.sjlh.hotel.crs.configurate.SpringCrsConfiguration;
import com.sjlh.hotel.crs.model.*;
import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class CrsOrderServiceImpl implements CrsOrderService {
	@Resource
	private InvokerFactory invokerFactory;
	@Resource
	private SpringCrsConfiguration config;
	@Resource
	private InvokerParamBuilder paramBuilder;
	@Resource
	private ObjectMapper objectMapper;

	private Invoker getInvoker() {
		return invokerFactory.getInvoker("crs");
	}

	@Override
	public OrderCreateRsp create(OrderCreateReq orderCreateReq) {
		try {
			String target = config.getProtocol()+"://" + config.getHost() + config.getCreateTarget();
			InvokerParam<OrderCreateRsp> invokerParam = paramBuilder.buildPost(OrderCreateRsp.class).setParam(orderCreateReq).setTarget(target);
			return getInvoker().invoke(invokerParam);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public CrsBaseResult cancel(OrderCancelReq orderCancelReq) {
		try {
			String target = config.getProtocol()+"://" + config.getHost() + config.getCancelTarget();
			InvokerParam<CrsBaseResult> invokerParam = paramBuilder.buildPost(CrsBaseResult.class).setAcceptMediaType(MediaType.APPLICATION_JSON).setParam(orderCancelReq).setTarget(target);
			return getInvoker().invoke(invokerParam);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public OrderDetailRsp detail(OrderDetailReq orderDetailReq) {
		try {
			String target = config.getProtocol()+"://" + config.getHost() + orderDetailReq.getCrsOrderId() + config.getDetailTarget();
			InvokerParam<OrderDetailRsp> invokerParam = paramBuilder.buildGet(OrderDetailRsp.class).setTarget(target);
			return getInvoker().invoke(invokerParam);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
