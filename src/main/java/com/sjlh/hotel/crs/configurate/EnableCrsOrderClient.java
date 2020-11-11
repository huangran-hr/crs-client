/**
 *
 */
package com.sjlh.hotel.crs.configurate;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.sjlh.hotel.common.spring.CommonRegister;
import org.springframework.context.annotation.Import;

/**
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@EnableConfigurationProperties({SpringCrsConfiguration.class})
@Import({CrsConfiguration.class, CommonRegister.class})
public @interface EnableCrsOrderClient {
}
