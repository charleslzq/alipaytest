package com.qy.pay.alipay;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by liuzhengqi on 5/2/2017.
 */
@Data
@NoArgsConstructor
public class QueryRequestBizContent {
	@SerializedName("out_biz_no")
	private String outBizNo;
	@SerializedName("order_id")
	private String orderId;
}
