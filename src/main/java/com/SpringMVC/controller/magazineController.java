/**
 * 
 */
/**
 * @author gyshi
 *
 */
package com.SpringMVC.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
@Controller
public class magazineController { 
	@RequestMapping(value ="/Fpgaselcet" ,method = RequestMethod.POST)
	   public String printHello(ModelMap model) {
		  
	      try {
	            String[] cmd = new String[] { "/bin/sh", "-c", "./home/jlin/CLionProjects/fpgaRemote/fpgaTest_Local_8" };
	            Process ps = Runtime.getRuntime().exec(cmd);
	            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
	            StringBuffer sb = new StringBuffer();
	            String line;
	            while ((line = br.readLine()) != null) {
	                sb.append(line).append("\n");
	            }
	            String result = sb.toString();
	            System.out.println( result);
	            model.addAttribute("message", result);
	            System.out.println( "00000000");
	          
	        } catch (Exception e) {
	        	 System.out.println( "error !!!!!!!!");
	            e.printStackTrace();
	        }         
	      return "comdres";
	   }
	@RequestMapping(value ="/Fpgaselcet1" ,method = RequestMethod.POST)
	   public String printHello1(ModelMap model) {
		  
	      try {
	            String[] cmd = new String[] { "/bin/sh", "-c", "mpiexec -n 2 -f /home/jlin/mpi_config_file /home/mpi_share/fpgaTest_Remote_1  " };
	            Process ps = Runtime.getRuntime().exec(cmd);
	            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
	            StringBuffer sb = new StringBuffer();
	            String line;
	            while ((line = br.readLine()) != null) {
	                sb.append(line).append("\n");
	            }
	            String result = sb.toString();
	            System.out.println( result);
	            System.out.println( "11111111");
	            model.addAttribute("message", result);
	     
	          
	        } catch (Exception e) {
	        	 System.out.println( "error !!!!!!!!");
	            e.printStackTrace();
	        }         
	      return "comdres1";
	   }
}