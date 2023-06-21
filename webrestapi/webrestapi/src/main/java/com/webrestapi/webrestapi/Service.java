package com.webrestapi.webrestapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {

    ObjectMapper objectMapper = new ObjectMapper();

    public FormDetails jsonToObject(String formJson) throws JsonProcessingException {
        FormDetails formDetails = objectMapper.readValue(formJson, FormDetails.class);
        System.out.println("********" + formDetails.getFirst_name());
        System.out.println("********" + formDetails.getLast_name());
        System.out.println("********" + formDetails.getEmail());
        System.out.println("********" + formDetails.getGender());
        System.out.println("********" + formDetails.getPercentange());
        System.out.println("********" + formDetails.getPhone_number());
        return formDetails;
    }

    public FormUpdateDetails jsonValuesSplit(String updateDetails) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(updateDetails);
        JsonNode jsonNode = objectMapper.readTree(updateDetails);
        int id = jsonNode.get("id").asInt();
        String status = jsonNode.get("status").asText();

        FormUpdateDetails formUpdateDetails = new FormUpdateDetails();
        formUpdateDetails.setId(id);
        formUpdateDetails.setStatus(status);
        return formUpdateDetails;
    }


}
