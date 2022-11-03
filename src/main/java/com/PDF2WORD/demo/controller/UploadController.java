package com.PDF2WORD.demo.controller;

import com.PDF2WORD.demo.service.ConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
@RequiredArgsConstructor
public class UploadController {
    private final ConverterService converterService;
    public static String uploadDirectory = System.getProperty("user.home")+"/ConvertedFiles";

    @GetMapping("/")
    public String homepage() {
        return "index";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("files") MultipartFile[] files, RedirectAttributes attributes) {

        if (files[0].isEmpty()) {
            attributes.addFlashAttribute("message", "Please select a file to upload.");
            return "redirect:/";
        }
            Arrays.stream(files).forEach(converterService::convertFileToPDF);
        attributes.addFlashAttribute("message", "You successfully converted all files ");

        return "redirect:/";
    }

}