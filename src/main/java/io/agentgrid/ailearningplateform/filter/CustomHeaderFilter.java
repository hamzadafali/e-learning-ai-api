package io.agentgrid.ailearningplateform.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class CustomHeaderFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        // Determine protocol version from request
        String protocol = request.getProtocol();
        String protocolVersion = protocol.contains("HTTP/2") ? "HTTP/2.0" : "HTTP/1.1";
        
        // Add custom header to response
        response.setHeader("X-Protocol-Version", protocolVersion);
        
        filterChain.doFilter(request, response);
    }
}
