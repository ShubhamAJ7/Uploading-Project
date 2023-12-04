package com.example.upload.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.upload.Entity.Excels;

public interface Uploading {
	
	public Boolean checkFormat(MultipartFile file);
	
	public List<Excels> uploadFile(MultipartFile file) throws IOException;

}
