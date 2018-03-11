package com.teamgp.giflib.controller;

import com.teamgp.giflib.data.GifRepository;
import com.teamgp.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping("/showgif")
    @ResponseBody
    public String showGif(){
        return "Displaying GIF!";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = gifRepository.findByName("android-explosion");
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
