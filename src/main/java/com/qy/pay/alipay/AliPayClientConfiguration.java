package com.qy.pay.alipay;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 5/2/2017.
 */
@Configuration
@EnableConfigurationProperties(AliPaySdkProperties.class)
public class AliPayClientConfiguration {

	@Autowired
	private AliPaySdkProperties aliPaySdkProperties;

	@Bean
	public AlipayClient alipayClient() {
		return new DefaultAlipayClient(
				aliPaySdkProperties.getUrl(),
				aliPaySdkProperties.getAppId(),
				aliPaySdkProperties.getAppPriKey(),
				aliPaySdkProperties.getFormat(),
				aliPaySdkProperties.getCharset().getKey(),
				aliPaySdkProperties.getAliPayPubKey(),
				aliPaySdkProperties.getSignType().name()
		);
	}
}
