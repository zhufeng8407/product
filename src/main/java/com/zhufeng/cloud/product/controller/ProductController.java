package com.zhufeng.cloud.product.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
public class ProductController {
	

//	@HystrixCommand(
//			commandProperties = {
//				@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
//			}
//		)
	@RequestMapping(value = "/getProductList", method = RequestMethod.POST)
	public String list(@RequestParam("temp") String temp) throws InterruptedException {
		log.info("Product Service: getProductList " + temp);
		if (StringUtils.isEmpty(temp) || "1".equals(temp)) {
			Thread.sleep(2000);
		}
		return "Product List";
	}
}
