/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlos
 */
@WebServlet(name = "RespXLS", urlPatterns = {"/RespXLS"})
public class RespXLS extends HttpServlet {

   
  

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/vn.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=archivo.xls");
        PrintWriter out = response.getWriter();
        try{
            out.println("Respuesta Generada desde Excel");
            out.println("100");
            out.println("200");
            out.println("La Suma es: \t");
            out.println("=suma (a2:a3)");
        }finally{
            out.close();
        }
       
    }

    
  
}
