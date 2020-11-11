/**
 *
 */
package com.sjlh.hotel.crs.configurate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Data
@ConfigurationProperties(prefix = "crs")
public class SpringCrsConfiguration{
	@Value("${protocol:http}")
	private String protocol;
	@Value("${host:192.168.1.104:8080/crs/order/}")
	private String host;
	@Value("${createTarget:v2/create}")
	private String createTarget;
	@Value("${cancelTarget:cancel}")
	private String cancelTarget;
	@Value("${detailTarget:/detail}")
	private String detailTarget;
}
