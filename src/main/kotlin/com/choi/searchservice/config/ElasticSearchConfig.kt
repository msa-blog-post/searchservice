package com.choi.searchservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories

@Configuration
@EnableElasticsearchRepositories(basePackages = ["org.springframework.data.elasticsearch.repository"])
class ElasticSearchConfig : ElasticsearchConfiguration() {

    override fun clientConfiguration(): ClientConfiguration {
        return ClientConfiguration.builder()
            .connectedTo("192.168.0.200:9200")
            .withBasicAuth("elastic", "chltjdgus123!")
            .build()
    }
}
