/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleMailController {
    @Autowired
    private JavaMailSender sender;

    @GetMapping("/sendMail")
    @ResponseBody
    //para ejemplo rapido paso varios parametro
    //deveria ser solo con el objeto(en JSON)
    public String sendMail(@RequestParam(name = "correo") String correo
            , @RequestParam(name = "noacount") String noacount
            , @RequestParam(name = "clavebanc") String clavebanc
            , @RequestParam(name = "nameuser") String nameuser) {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setTo(correo);
            helper.setText("<html> \n" +
"  	<body>\n" +
"  		<h1>Movimiento </h1>\n" +
"      <table>\n" +
"        	<tr>\n" +
"              <td>Nombre de Usuario:</td>\n" +
"              <td>"+nameuser+"</td>\n" +
"        	</tr>\n" +
"        	<tr>\n" +
"              	<td>Numero de Cuenta:</td>\n" +
"              	<td>"+noacount+"</td>\n" +
"        	</tr>\n" +
"        	<tr>\n" +
"              	<td>Clave Bancaria:</td>\n" +
"              	<td>"+clavebanc+"</td>\n" +
"        	</tr>\n" +
"        	<tr>\n" +
"              	<td>Deposito:</td>\n" +
"              	<td>500$</td>\n" +
"        	</tr>\n" +
"      </table>\n" +
"	</body>\n" +
"</html>",true);
            helper.setSubject("Movimiento Pago");
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Error while sending mail ..";
        }
        sender.send(message);
        return "Mail Sent Success!";
    }
}