package com.webrestapi.webrestapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.Normalizer;
import java.util.List;

@RestController
@RequestMapping("/web")
public class RestControllet {
    private final String message = "This message is from the server side.";

    @Autowired
    private FormDetailsRepo formDetailsRepo;

    @CrossOrigin
    @GetMapping("/check")
    public ApiResponse getmessage() {
        System.out.println("check url is called");
        return new ApiResponse(message, 200);
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/save")
    public ApiResponse saveForm(@RequestBody String formDetails) throws JsonProcessingException {
        System.out.println(formDetails);
        Service service = new Service();
        FormDetails formDetails1 = service.jsonToObject(formDetails);
//        formDetailsRepo.insertNewRow();
        formDetailsRepo.save(formDetails1);
        System.out.println("Save endpoint is called");
        return new ApiResponse("Successfully saved!", 200);
    }

    @CrossOrigin
    @GetMapping("/getrecord")
    public List<FormDetails> getForm() {
        System.out.println("This is form getting");
        return formDetailsRepo.findAll();
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/update")
    public ApiResponse updateRecord(@RequestBody String updateDetails) throws JsonProcessingException {
        Service service = new Service();
        System.out.println("****" + updateDetails);
        FormUpdateDetails formUpdateDetails= service.jsonValuesSplit(updateDetails);
        formDetailsRepo.updateStatus(formUpdateDetails.getId(), formUpdateDetails.getStatus());
        return new ApiResponse("Successfully saved!", 200);
    }

}
