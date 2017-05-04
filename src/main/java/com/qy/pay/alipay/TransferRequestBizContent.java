package com.qy.pay.alipay;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Created by liuzhengqi on 5/2/2017.
 */
@Data
@NoArgsConstructor
public class TransferRequestBizContent {
	@SerializedName("out_biz_no") @NonNull
	private String outBizNo;
	@SerializedName("payee_type") @NonNull
	private PayeeType payeeType;
	@SerializedName("payee_account") @NonNull
	private String payeeAccount;
	@NonNull
	private String amount;
	@SerializedName("payer_show_name")
	private String payerShowName;
	@SerializedName("payee_real_name")
	private String payeeRealName;
	private String remark;


	public enum PayeeType {
		ALIPAY_USERID,
		ALIPAY_LOGONID;
	}
}
