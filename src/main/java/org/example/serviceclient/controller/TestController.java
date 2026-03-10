package org.example.serviceclient.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.serviceclient.client.Publisher1FeignClient;
import org.example.serviceclient.client.Publisher1FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    private final Publisher1FeignClient publisher1FeignClient;
    private final Publisher1FeignClient publisher2FeignClient;

    @PostMapping("/call-publisher-1")
    public void test(@RequestBody String request){
        publisher1FeignClient.callTestEndpoint(request);
    }

    @PostMapping("/call-publisher-2")
    public void callPublisher2(@RequestBody String request){
        publisher2FeignClient.callTestEndpoint(request);
    }
}
