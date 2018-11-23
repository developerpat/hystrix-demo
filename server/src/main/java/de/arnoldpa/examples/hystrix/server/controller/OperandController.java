package de.arnoldpa.examples.hystrix.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class OperandController {
    @GetMapping("/operand")
    public @ResponseBody
    String getOperand() {
        return "" + ThreadLocalRandom.current().nextInt(0, 101);
    }
}
