/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jade.crud.model.CtUsuarios;
import com.jade.crud.model.Usuarios;
import com.jade.crud.repo.CtUsuariosRepository;
import com.jade.crud.repo.UsuariosRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping
public class SimpleMailController {

    @Autowired
    private JavaMailSender sender;

    //para ejemplo rapido paso varios parametro
    //deveria ser solo con el objeto(en JSON)
    @PostMapping("/sendMail")
    public String sendMail(@RequestParam(name = "correo") String correo,
             @RequestParam(name = "noacount") String noacount,
             @RequestParam(name = "clavebanc") String clavebanc,
             @RequestParam(name = "nameuser") String nameuser) {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());

            helper.setTo(correo);
            helper.setText("<h1 style=\"color: #5e9ca0;\">Residencial..</h1>\n"
                    + "<h2 style=\"color: #2e6c80;\">&nbsp;</h2>\n"
                    + "<table border=\"2\" class=\"editorDemoTable\" style=\"width: 613px;\">\n"
                    + "    <thead>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\">Recibo Electonico</td>\n"
                    + "            <td style=\"width: 169.1px; text-align: center;\">Recidencial..</td>\n"
                    + "            <td style=\"width: 127.9px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "    </thead>\n"
                    + "    <tbody>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Direccion:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Calle:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Manzana:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Resibi de:<br /></strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Fecha:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">"+date+"</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Cantidad:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\"><span id=\"demoId\"><strong class=\"demoClass\">&nbsp;</strong></span></td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Status:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Mantenimiento:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Cuenta:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Pena Convencional:<br /></strong>\n"
                    + "            </td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Sucursa:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">C. Extraordinaria:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Clabe:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong style=\"font-size: 17px; color: #2b2301;\">A Nombre\n"
                    + "                    de:<br /></strong></td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Total</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Referencia:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong style=\"font-size: 17px; color: #2b2301;\">Folio de\n"
                    + "                    Rastreo</strong>:</td>\n"
                    + "            <td style=\"width: 111px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td colspan=\"4\"><strong>EL PAGO DE ESTE RECIBO NO LO EXIME DE ADEUDOS ANTERIORES</strong></td>\n"
                    + "        </tr>\n"
                    + "    </tbody>\n"
                    + "</table>\n"
                    + "<p><strong>&nbsp;</strong></p>", true);
            helper.setSubject("Movimiento Pago");
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Error while sending mail ..";
        }
        sender.send(message);
        return "Mail Sent Success!";
    }
}
