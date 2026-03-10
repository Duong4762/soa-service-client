package org.example.serviceclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service-publisher-2", path = "/")
public interface Publisher2FeignClient {
    @PostMapping("/api/test")
    String callTestEndpoint(@RequestBody String request);
}
