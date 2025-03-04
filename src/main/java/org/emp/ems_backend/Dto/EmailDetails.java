package org.emp.ems_backend.Dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmailDetails {
    private String recipient ;
    private String subject ;
    private String otp ;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
