package com.microservices.demo.elastic.query.web.client.service;




import client.model.ElasticQueryWebClientRequestModel;
import client.model.ElasticQueryWebClientResponseModel;

import java.util.List;

public interface ElasticQueryWebClient {

    List<ElasticQueryWebClientResponseModel> getDataByText(ElasticQueryWebClientRequestModel requestModel);
}
