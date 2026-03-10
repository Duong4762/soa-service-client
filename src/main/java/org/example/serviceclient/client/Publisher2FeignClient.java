package org.example.serviceclient.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "service-publisher-2")
public interface Publisher2FeignClient {
}
