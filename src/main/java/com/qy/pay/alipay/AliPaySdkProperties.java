package com.qy.pay.alipay;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by liuzhengqi on 5/2/2017.
 */
@ConfigurationProperties(
		prefix = "qy.ali.pay"
)
@Data
public class AliPaySdkProperties {
	private String url = "https://openapi.alipay.com/gateway.do";
	private String appId;
	private String appPriKey;
	private String format = "json";
	private Charset charset;
	private String aliPayPubKey;
	private SignType signType;


	public enum Charset {
		GBK("GBK"),
		UTF8("UTF-8");

		private final String key;

		Charset(String key) {
			this.key = key;
		}

		public String getKey() {
			return key;
		}
	}

	public enum SignType {
		RSA2,
		RSA
	}
}
