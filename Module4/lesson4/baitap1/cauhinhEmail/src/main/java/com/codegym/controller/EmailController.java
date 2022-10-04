package com.codegym.controller;



import com.codegym.model.Email;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {

    private static Logger logger = LogManager.getLogger(EmailController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView loadIndex (Model model) {
        logger.trace("Vao loadIndex");
        ModelAndView index = null;
        Email email;
        try {
            index = new ModelAndView("index");
            email = new Email();
            model.addAttribute("email", email);
            logger.info("Mang object email sang trang index.jsp");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        logger.trace("Thoat loadIndex");
        return index;
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public ModelAndView loadResult (@ModelAttribute ("email") Email email, ModelMap modelMap) {
        logger.trace("Vao loadResult");
        ModelAndView result = null;
        try {
            result = new ModelAndView("result");
            modelMap.addAttribute("languages", email.getLanguages());
            modelMap.addAttribute("pageSize", email.getPageSize());
            modelMap.addAttribute("filter", email.isFilter());
            modelMap.addAttribute("signature", email.getSignature());
            logger.info(modelMap.values());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        logger.trace("Thoat loadResult");
        return result;
    }
}
