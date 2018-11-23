package de.arnoldpa.examples.hystrix.server.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class OperatorController {
    @GetMapping("/operator")
    public @ResponseBody
    String getOperation() {
        final List<String> operationList = Arrays.asList("+", "-", "*", "/");
        int element = ThreadLocalRandom.current().nextInt(operationList.size());
        return operationList.get(element);
    }
}