/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.service;

import com.jade.crud.model.Mail;

/**
 *
 * @author mperez
 */
public interface MailService {
    public void sendEmail(Mail mail);
}
