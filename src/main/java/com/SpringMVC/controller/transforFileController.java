package com.SpringMVC.controller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;


@Controller

public  class transforFileController {
	@ResponseBody
 @RequestMapping(value = "/fileUploadPage", method = RequestMethod.GET)
	   public ModelAndView fileUploadPage() {
//	      FileModel sgy = new FileModel();
//	      ModelAndView modelAndView = new ModelAndView("fileUpload", "command", sgy);
		  ModelAndView modelAndView = new ModelAndView("fileUpload");
	      return modelAndView;
	   }
	 @RequestMapping(value = "/addfileUploadPage", method = RequestMethod.POST)
	public String testUpload(MultipartHttpServletRequest request ) throws IOException {
		 
		String a = request.getParameter("file1");
		System.out.println("f+++++++++++++++++++++++++++++++++++: "+a);
		List<String> fileUrl= new ArrayList<String>();
		Iterator<String> fileNames = request.getFileNames();
		System.out.println("fileNames: "+fileNames);
		while (fileNames.hasNext()) {
			String fileName=fileNames.next();
			System.out.println("fileName: "+fileName);
			String fileNameString = fileName.toString();
			System.out.println("fileNameString:  " +fileNameString);
		
			List<MultipartFile> fileList=request.getFiles(fileName);
			System.out.println("fileList: "+fileList);
		
			if (fileList.size()>0) {
				Iterator<MultipartFile> fileIte=fileList.iterator();
				System.out.println("fileIte: "+fileIte);
				while (fileIte.hasNext()) {
					MultipartFile multipartFile=fileIte.next();
					System.out.println("multipartFile: "+multipartFile);
					String originalFilename = multipartFile.getOriginalFilename();
					System.out.println("originalFilename: "+originalFilename);	
					
					if(fileName.equals("file1")) {
						System.out.println("file1" );
						String path ="/home/gyshi/Music/file1/";
						File dir=new File(path);
						if (!dir.exists()) {
							dir.mkdirs();
							}
						String filePath = path + originalFilename;
						System.out.println("filePath: "+filePath);
						File dest = new File(filePath);
						if (!(dest.exists())) {
							multipartFile.transferTo(dest);
							}
						String contentType=multipartFile.getContentType();
						System.out.println("contentType: "+contentType);
						String name=multipartFile.getName();
						System.out.println("name: "+name);
						long size=multipartFile.getSize();
						System.out.println("size: "+size);
						System.out.println("---------------------------------------------------");
						fileUrl.add(originalFilename);
					}
					else if(fileName.equals("file2")){
						System.out.println("file2" );
						String path ="/home/gyshi/Music/file2/";	
						File dir=new File(path);
						if (!dir.exists()) {
							dir.mkdirs();
							}
						String filePath = path + originalFilename;
						System.out.println("filePath: "+filePath);
						File dest = new File(filePath);
						if (!(dest.exists())) {
							multipartFile.transferTo(dest);
							}
						String contentType=multipartFile.getContentType();
						System.out.println("contentType: "+contentType);
						String name=multipartFile.getName();
						System.out.println("name: "+name);
						long size=multipartFile.getSize();
						System.out.println("size: "+size);
						System.out.println("---------------------------------------------------");
//						fileUrl.add(originalFilename);
					}
					else {
						System.out.println("file2" );
						String path ="/home/gyshi/Music/";	
						File dir=new File(path);
						if (!dir.exists()) {
							dir.mkdirs();
							}
						String filePath = path + originalFilename;
						System.out.println("filePath: "+filePath);
						File dest = new File(filePath);
						if (!(dest.exists())) {
							multipartFile.transferTo(dest);
							}
						String contentType=multipartFile.getContentType();
						System.out.println("contentType: "+contentType);
						String name=multipartFile.getName();
						System.out.println("name: "+name);
						long size=multipartFile.getSize();
						System.out.println("size: "+size);
						System.out.println("---------------------------------------------------");
//						fileUrl.add(originalFilename);
					}
					
					
					
//					String path ="/home/gyshi/Music/";
//					File dir=new File(path);
//					if (!dir.exists()) {
//						dir.mkdirs();
//						}
//					String filePath = path + originalFilename;
//					System.out.println("filePath: "+filePath);
//					File dest = new File(filePath);
//					if (!(dest.exists())) {
//						multipartFile.transferTo(dest);
//						}
//					String contentType=multipartFile.getContentType();
//					System.out.println("contentType: "+contentType);
//					String name=multipartFile.getName();
//					System.out.println("name: "+name);
//					long size=multipartFile.getSize();
//					System.out.println("size: "+size);
//					System.out.println("---------------------------------------------------");
					}
				}
			}
		System.out.println("fileUrl: "+fileUrl);
		String filenameTemp =  "/home/gyshi/sgy.txt";
		File filename = new File(filenameTemp);
		if (!filename.exists()) {
			filename.createNewFile();
		}
			
	   FileWriter writer = null;
        try {   
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件   ;
            writer = new FileWriter(filenameTemp);   
//        	FileOutputStream out = new FileOutputStream(filenameTemp);
//        	OutputStreamWriter outWriter =new  OutputStreamWriter(out);
//        	BufferedWriter bufwrite = new BufferedWriter(outWriter);
            for(int i = 0; i<fileUrl.size(); i++ ){
            	writer.write(fileUrl.get(i) +"\r\n");  
//            	bufwrite.write(fileUrl.get(i) +"\r\n");

            }
//            bufwrite.close();
//            outWriter.close();
//            out.close();
            
        } catch (IOException e) {   
            e.printStackTrace();   
       } 
        finally {   
            try {   
            if(writer != null){
            writer.close();   
            }
            } catch (IOException e) {   
                e.printStackTrace();   
            }   
        } 
 
		System.out.println("文件写入成功~~~~~~~~~~~: ");
		return "success";
		
		}
	 
	    
}

