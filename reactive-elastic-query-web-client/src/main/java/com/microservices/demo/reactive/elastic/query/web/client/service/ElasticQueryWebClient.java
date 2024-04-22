package com.microservices.demo.reactive.elastic.query.web.client.service;

import client.model.ElasticQueryWebClientRequestModel;
import client.model.ElasticQueryWebClientResponseModel;
import reactor.core.publisher.Flux;

public interface ElasticQueryWebClient {

    Flux<ElasticQueryWebClientResponseModel> getDataByText(ElasticQueryWebClientRequestModel request);
}
