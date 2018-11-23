package de.arnoldpa.examples.hystrix.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="operator-client", url = "http://localhost:54179/")
public interface OperatorFeignInterface {

    @GetMapping("/operator")
    String getOperation();
}
