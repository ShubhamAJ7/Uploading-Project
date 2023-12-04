package com.example.upload.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.upload.Entity.Excels;
import com.example.upload.service.Uploading;

@RestController
@RequestMapping("/Upload")
public class UploadController {

	@Autowired
	private Uploading up;

	@PostMapping("/excelFile")
	public List<Excels> UploadFile(@RequestBody MultipartFile file) throws IOException {
		if (up.checkFormat(file))
			return up.uploadFile(file);
		else
			return null;

	}

}
