/*
 * Copyright (c) 2005 Your Corporation. All Rights Reserved.
 */
package com.octo.captcha.module.acegi;

import com.octo.captcha.service.CaptchaService;
import com.octo.captcha.service.CaptchaServiceException;
import net.sf.acegisecurity.captcha.CaptchaServiceProxy;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:marc.antoine.garrigue@gmail.com">Marc-Antoine Garrigue</a>
 * @version $Id$
 */
public class JCaptchaServiceProxy implements CaptchaServiceProxy {

    private CaptchaService service;
   

    public JCaptchaServiceProxy(CaptchaService service) {
        super();
        this.service = service;
    }


    public boolean validateReponseForId(String id, Object response) {
        if(id==null||response==null||"".equals(id)){
            return false;
        }else{
            try {
              return  service.validateResponseForID(id,response).booleanValue();
            } catch (CaptchaServiceException e) {
                return false;
            }
        }
        
    }
}