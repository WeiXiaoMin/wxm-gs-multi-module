package com.example.multimodule.service

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("service")
class ServiceProperties {
    /**
     * A message for the service.
     */
    var message: String? = null
}
