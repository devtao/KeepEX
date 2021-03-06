package me.tspace.email.service.impl;

import java.io.IOException;  
import java.util.ArrayList;
import java.util.HashMap;  
import java.util.List;
import java.util.Map;  
  
import javax.mail.MessagingException;  
import javax.mail.internet.MimeMessage;  
  
import me.tspace.email.dto.MailSenderInfo;
import me.tspace.email.service.IFreemarkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;  
import org.springframework.mail.javamail.MimeMessageHelper;  
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;  
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;  
  
import freemarker.template.Template;  
import freemarker.template.TemplateException;  

public class FreemarkerServiceImpl implements IFreemarkerService{  
    private JavaMailSender sender;  
    private FreeMarkerConfigurer  freeMarkerConfigurer = null;  
  
    public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {  
        this.freeMarkerConfigurer = freeMarkerConfigurer;  
    }  
    /** 
     * 添加模板内容 
     * @param content 
     * @return 
     */  
    @SuppressWarnings("unchecked")
	private String getMailText(String content){  
        String htmlText = "";  
        @SuppressWarnings("rawtypes")
		Map map  = new HashMap();  
        map.put("logo", "http://file.selleckchem.com/images/logo.gif");
        map.put("banner", "http://www.selleckchem.com/newsletter-fodder/lib-gpcr-banner.png");
        
    	List<String> contents = new ArrayList<String>();
    	contents.add("content1..........................................");
    	contents.add("content2..........................................");
    	contents.add("content4..........................................");
    	contents.add("content3..........................................");
    	contents.add("content5..........................................");
    	contents.add("content6..........................................");
    	map.put("contents", contents);
        
        Template tpl    = null;  
        try {  
            tpl =  freeMarkerConfigurer.getConfiguration().getTemplate("mail.ftl");//加载资源文件  
            htmlText = FreeMarkerTemplateUtils.processTemplateIntoString(tpl, map);//加入map到模板中 对应${content}  
        } catch (IOException e) {             
            e.printStackTrace();  
        } catch (TemplateException e) {           
            e.printStackTrace();  
        }  
        return htmlText;          
    }  
      
    @Override
    public void sendTemplate(MailSenderInfo  info) throws MessagingException{  
        MimeMessage msg = sender.createMimeMessage();  
        // false表示非marltipart,UTF-8为字符编码  
        MimeMessageHelper helper = new MimeMessageHelper(msg, false, "UTF-8");  
        helper.setSubject(info.getSubject());  
        helper.setFrom(info.getFromAddress());  
        helper.setTo(info.getToAddress());  
        helper.setText(this.getMailText(info.getContent()), true);// 设置为true表示发送的是HTML  
        sender.send(msg);  
          
    }  
    public void setSender(JavaMailSender sender) {  
        this.sender = sender;  
    }  
  
  
}  