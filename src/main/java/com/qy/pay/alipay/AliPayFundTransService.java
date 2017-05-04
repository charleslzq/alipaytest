package com.qy.pay.alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipayFundTransOrderQueryRequest;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransOrderQueryResponse;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;

/**
 * Created by liuzhengqi on 5/2/2017.
 */
public interface AliPayFundTransService {
	AlipayFundTransToaccountTransferResponse toAccountTransfer(AlipayFundTransToaccountTransferRequest request) throws AlipayApiException;

	AlipayFundTransOrderQueryResponse orderQuery(AlipayFundTransOrderQueryRequest request) throws AlipayApiException;
}
