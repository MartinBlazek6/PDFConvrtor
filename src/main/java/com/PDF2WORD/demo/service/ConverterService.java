package com.PDF2WORD.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
public interface ConverterService {

    void convertFileToPDF(MultipartFile file);

}
