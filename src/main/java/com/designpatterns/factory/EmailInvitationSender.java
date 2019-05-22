package com.designpatterns.factory;

public class EmailInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {

        System.out.println("Send invitation via EMAIL :\n" + invitation.getName() + " " + invitation.getSurname());
        System.out.println(invitation.getAddress());
        System.out.println("EMAIL SENT !!!");

    }
}