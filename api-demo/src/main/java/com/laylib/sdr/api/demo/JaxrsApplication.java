package com.laylib.sdr.api.demo;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Reasteasy App
 *
 * @author Lay
 * @date 2019/01/02
 */
@Component
@ApplicationPath("/api-demo/")
public class JaxrsApplication extends Application {
}
