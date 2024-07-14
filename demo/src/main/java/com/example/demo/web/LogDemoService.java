package com.example.demo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    private final com.example.demo.common.MyLogger myLogger;
    public void logic(String id) {
        myLogger.log("service id = " + id);
    }
}
