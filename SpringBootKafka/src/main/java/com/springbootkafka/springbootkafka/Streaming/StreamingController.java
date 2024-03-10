package com.springbootkafka.springbootkafka.Streaming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamingController {


    @GetMapping("/test")
    public String sampleRestController()
    {
        return "SampleString";
    }
}
