/**
 *
 */
package com.sjlh.hotel.crs.configurate;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
public interface CrsConfig {
	default String getProtocol() {
		return "http";
	}
	String getHost();
	String getCreateTarget();
	String getCancelTarget();
	String getDetailTarget();
}
