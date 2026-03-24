package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SixDigitOtpGenerator implements OtpGenerator{
    @Override
    public String getOtp(){
        return "" + new Random().nextInt(100000);

    }

}
