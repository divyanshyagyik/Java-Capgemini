package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserVerifier {
    @Autowired
    OtpGenerator otpGenerator;

    @Autowired
    OtpGenerator FourDigitOtpGenerator;
    @Autowired
    OtpGenerator SixDigitOtpGenerator;


    public void verifyUser(){
        String otp = otpGenerator.getOtp();
        System.out.println(otpGenerator);
        System.out.println(FourDigitOtpGenerator);
        System.out.println(SixDigitOtpGenerator);
        if(otp != null){
            System.out.println("verified");
        }
        else{
            System.out.println("Not verified");
        }

    }
}
