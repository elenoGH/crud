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

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
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
    public String sendMail(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "secondname") String secondname,
            @RequestParam(name = "appat") String appat,
            @RequestParam(name = "apmat") String apmat,
            @RequestParam(name = "bancocuenta") String bancocuenta,
            @RequestParam(name = "bancosucursal") String bancosucursal,
            @RequestParam(name = "bancoclave") String bancoclave,
            @RequestParam(name = "bancoreferencia") String bancoreferencia,
            @RequestParam(name = "folio") String folio,
            @RequestParam(name = "casa") String casa,
            @RequestParam(name = "manzana") String manzana,
            @RequestParam(name = "propietario") String propietario,
            @RequestParam(name = "privada") String privada,
            @RequestParam(name = "email") String email
    ) {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            FileSystemResource res = new FileSystemResource(new File("c:/Users/mperez/Downloads/proyectoTere/logo_imisa.png"));

            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());

            helper.setFrom("pagosimisa@imisaservicios.com");
            //helper.addInline("imisaLogo", res);
            helper.setTo(email);
            helper.setText("<table class=\"editorDemoTable\" style=\"width: 613px;\">\n"
                    + "    <thead>\n"
                    + "        <tr><img src=\"http://localhost/crud/imagenes/logo_imisa.png\" />\n"
                    + "            <td style=\"text-align:center\" colspan=\"4\">"
                    + "                 <h2><strong>RESIDENCIAL VILLA TOSCANA</strong></h2></td>\n"
                    + "        </tr>\n"
                    + "    </thead>\n"
                    + "    <tbody>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Direccion:</strong></td>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Calle</strong></td>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Manzana</strong></td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 127.9px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 169.1px;\">" + manzana + "</td>\n"
                    + "            <td style=\"width: 127.9px;\">&nbsp;</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Recibí de:<br /></strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">" + name + "</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Fecha:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">" + date + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Cantidad:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\"><span id=\"demoId\"><strong class=\"demoClass\">$500.00</strong></span></td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Status:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">PAGADO</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Mantenimiento:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">$500.00</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Cuenta:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">" + bancocuenta + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Pena Convencional:<br /></strong>\n"
                    + "            </td>\n"
                    + "            <td style=\"width: 169.1px;\">$0.00</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Sucursal:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">" + bancosucursal + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">C. Extraordinaria:</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">$0.00</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Clabe:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">" + bancoclave + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 169.1px;\">&nbsp;</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong style=\"font-size: 17px; color: #2b2301;\">A Nombre\n"
                    + "                    de:<br /></strong></td>\n"
                    + "            <td style=\"width: 111px;\">" + propietario + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 226px;\"><strong style=\"font-size: 17px; color: #2b2301;\">Total</strong></td>\n"
                    + "            <td style=\"width: 169.1px;\">$500.00</td>\n"
                    + "            <td style=\"width: 127.9px; text-align: left;\"><strong\n"
                    + "                    style=\"font-size: 17px; color: #2b2301;\">Referencia:</strong></td>\n"
                    + "            <td style=\"width: 111px;\">" + bancoreferencia + "</td>\n"
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
                    + "            <td style=\"width: 111px;\">" + folio + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td style=\"width: 80px;\" colspan=\"4\"><strong>EL PAGO DE ESTE RECIBO NO LO EXIME DE ADEUDOS ANTERIORES</strong></td>\n"
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
