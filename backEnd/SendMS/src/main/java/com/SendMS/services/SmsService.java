/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SendMS.services;


import com.SendMS.RepositoriesEntry.EntriesRepository;
import com.SendMS.entities.Entry;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import javax.lang.model.SourceVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jhonn
 */
@Service
public class SmsService {
        @Autowired
        private EntriesRepository entryRepository;

       //@Value ("${TWILIO_SID}")
         @Value ("${TWILIO_SID:#{null}}")
        private String twilioSid =  System.getenv("TWILIO_SID");
        

	//@Value("${twilio.key}")
    
        @Value ("${TWILIO_KEY:#{null}}")
        private String twilioKey ;

	//@Value("${twilio.phone.from}")
        @Value ("${TWILIO_PHONE_FROM:#{null}}")
        private String twilioPhoneFrom ;

	//@Value("${twilio.phone.to}")
         @Value ("${TWILIO_PHONE_TO:#{null}}")
         private String twilioPhoneTo ;

    public void sendSms(Long idEntry) {
        
            Entry data = entryRepository.findById(idEntry).get();
		//Twilio.init(twilioSid, twilioKey);

                System.err.println(twilioSid);



		//PhoneNumber to = new PhoneNumber(twilioPhoneTo);
		//PhoneNumber from = new PhoneNumber(twilioPhoneFrom); 
               String msg = "Dados do Banco: " + data.getSellerName() + " vendeu: R$ " + data.getAmount(); 
		//Message message = Message.creator(to, from, msg).create();
                System.err.println(msg);
 
	 }

   
}