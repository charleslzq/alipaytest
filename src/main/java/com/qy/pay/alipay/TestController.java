package com.qy.pay.alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipayFundTransOrderQueryRequest;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransOrderQueryResponse;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuzhengqi on 5/2/2017.
 */
@RestController
public class TestController {

	@Autowired
	private AliPayFundTransService aliPayFundTransService;

	private Gson gson = new Gson();

	@RequestMapping(value = "/transfer", method = RequestMethod.POST)
	public AlipayFundTransToaccountTransferResponse transfer(
			@RequestBody final TransferRequestBizContent content
	) throws AlipayApiException {
		AlipayFundTransToaccountTransferRequest alipayFundTransToaccountTransferRequest = new AlipayFundTransToaccountTransferRequest();
		alipayFundTransToaccountTransferRequest.setBizContent(gson.toJson(content));
		return aliPayFundTransService.toAccountTransfer(alipayFundTransToaccountTransferRequest);
	}

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public AlipayFundTransOrderQueryResponse query(
			@RequestParam(value = "outBizNo", required = false) final String outBizNo,
	        @RequestParam(value = "orderId", required = false) final String orderId
	) throws AlipayApiException {
		AlipayFundTransOrderQueryRequest alipayFundTransOrderQueryRequest = new AlipayFundTransOrderQueryRequest();
		QueryRequestBizContent queryRequestBizContent = new QueryRequestBizContent();
		queryRequestBizContent.setOutBizNo(outBizNo);
		queryRequestBizContent.setOrderId(orderId);
		alipayFundTransOrderQueryRequest.setBizContent(gson.toJson(queryRequestBizContent));
		return aliPayFundTransService.orderQuery(alipayFundTransOrderQueryRequest);
	}

	@ExceptionHandler(AlipayApiException.class)
	public String exception(AlipayApiException e) {
		return e.getErrMsg();
	}
}
