package com.PDF2WORD.demo.service;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.PDF2WORD.demo.controller.UploadController.uploadDirectory;
@Service
public class ConvertererviceImpl implements ConverterService{

    @Override
    public void convertFileToPDF(MultipartFile file) {
        try {
            Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
            PdfDocument pw=new PdfDocument();
            pw.loadFromBytes(file.getBytes());
            pw.saveToFile(String.valueOf(fileNameAndPath).replace("pdf","docx"), FileFormat.DOCX);
            pw.close();
        } catch (IOException ignored) {

        }

    }
}
