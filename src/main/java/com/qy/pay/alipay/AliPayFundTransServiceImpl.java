package com.qy.pay.alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayFundTransOrderQueryRequest;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransOrderQueryResponse;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuzhengqi on 5/2/2017.
 */
@Service
public class AliPayFundTransServiceImpl implements AliPayFundTransService {

	@Autowired
	private AlipayClient alipayClient;


	@Override
	public AlipayFundTransToaccountTransferResponse toAccountTransfer(AlipayFundTransToaccountTransferRequest request) throws AlipayApiException {
		return alipayClient.execute(request);
	}

	@Override
	public AlipayFundTransOrderQueryResponse orderQuery(AlipayFundTransOrderQueryRequest request) throws AlipayApiException {
		return alipayClient.execute(request);
	}
}
