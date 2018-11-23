package de.arnoldpa.examples.hystrix.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="operand-client", url = "http://localhost:54179/")
public interface OperandFeignInterface {

    @GetMapping("/operand")
    String getOperand();
}
