/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECommerceSoftwareProcess.Model;

import co.omise.Client;
import co.omise.ClientException;
import co.omise.models.Charge;
import co.omise.models.OmiseException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.IOException;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author bigza
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
@RequestMapping("/Payment")
public class PaymentController {
    @JsonDeserialize
    @PostMapping()
    public HttpStatus postPayment(@RequestBody JSONObject body) throws ClientException, IOException, OmiseException{
        HttpStatus status = OK;
        
         String token = body.getAsString("token");
         int amount = (int) body.getAsNumber("totalPrice");
         
        Client client = new Client("pkey_test_5dz2dxgy2mdrk7e7zhx", "skey_test_5dzg20wnz9q7farhsik");
        try {
            Charge charge = client.charges().create(new Charge.Create()
                    .amount(amount) 
                    .currency("THB")
                    .card(token));
        } catch (IOException e) {
            status = BAD_REQUEST;
        }
       

        return status;
    }
}