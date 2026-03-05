package io.agentgrid.ailearningplateform.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class SystemCheckController {

    @GetMapping("/system-check")
    public Map<String, String> systemCheck(HttpServletRequest request) {
        String serverTime = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        String protocol = request.getProtocol();
        
        return Map.of(
                "serverTime", serverTime,
                "protocol", protocol,
                "status", "OK"
        );
    }
}
