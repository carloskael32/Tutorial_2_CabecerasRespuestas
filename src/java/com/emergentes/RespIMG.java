/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlos
 */
@WebServlet(name = "RespIMG", urlPatterns = {"/RespIMG"})
public class RespIMG extends HttpServlet {

   
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/png");
        try{
            String ruta = request.getServletContext().getRealPath(File.separator);
            System.out.println(ruta);
            File f = new File (ruta + "gitar.jpeg");
            BufferedImage bi = ImageIO.read(f);
            OutputStream out = response.getOutputStream();
            ImageIO.write(bi,"jpeg",out);
            out.close();
            
        }finally{
            
        }
    }

 
  
}
