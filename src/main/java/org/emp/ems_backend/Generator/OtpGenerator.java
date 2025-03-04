package org.emp.ems_backend.Generator;

import java.util.Random;

public class OtpGenerator {
    public static String generateOtp() {
        StringBuilder otp = new StringBuilder();
        Random random=new Random();
        while(otp.length()<4){
            otp.append(random.nextInt(10));
        }
        System.out.println(otp);
        return otp.toString();
    }
}
