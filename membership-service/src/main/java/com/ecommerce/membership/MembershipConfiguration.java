package com.ecommerce.membership;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MembershipConfigurationProperties.class)
public class MembershipConfiguration {

}
