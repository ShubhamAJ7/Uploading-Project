package com.example.upload.serviceImplementation;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.upload.Entity.Excels;
import com.example.upload.service.Uploading;

@Service
public class UploadingImplementation implements Uploading {

	@Override
	public List<Excels> uploadFile(MultipartFile file) throws IOException {
		// TODO Auto-generated method stub


		InputStream in = file.getInputStream();
		
		ZipSecureFile.setMinInflateRatio(0);  // file bombing // more data then it appears
		
		
		XSSFWorkbook workbook =new XSSFWorkbook(in);
		XSSFSheet xf = workbook.getSheetAt(0);

		int finalCid=16;
		int rowNumber  =0;
		Iterator<Row> iterator = xf.iterator();	
		List <Excels> tableList = new ArrayList<>(); //
		while (iterator.hasNext())
		{
			Row row =iterator.next();
			rowNumber ++;
			
			Excels e = new Excels();
			
			for(int cid=0 ; cid<finalCid; cid++)
			{
				String value;
				Cell cell = row.getCell(cid, MissingCellPolicy.CREATE_NULL_AS_BLANK);
				CellType x= cell.getCellType();
				switch(x)
				{
				case STRING : value =cell.getStringCellValue();
				break;
				case NUMERIC : value =String.valueOf(cell.getNumericCellValue());
				break;
				default : value="Open to all";
				
				}
				
				switch(cid)
				{
				case 0 : e.setFirstColumn(value);
				System.out.println(e.getFirstColumn());
				break;
				case 1 : e.setSecondColumn(value);
				break;
				case 2 : e.setThirdColumn(value);
				break;
				case 3 : e.setFourthColumn(value);
				break;
				case 4 : e.setFifthColumn(value);
				break;
				case 5 : e.setSixthColumn(value);
				break;
				case 6 : e.setSeventhColumn(value);
				break;
				case 8 : e.setEighthColumn(value);
				break;
				case 9 : e.setNinethColumn(value);
				break;
				case 10 : e.setTenthColumn(value);
				break;			 
				case 11 : e.setEleventhColumn(value);
				break;
				case 12 : e.setTwelethColumn(value);
				break;
				case 13 : e.setThirteenthColumn(value);
				break;
				case 14 : e.setFourtheenthColumn(value);
				break;
				case 15 : e.setFifteenthColumn(value);
				break;
				case 16 : e.setSixteenthColumn(value);
				break;
				case 17 : e.setSeventeenthColumn(value);
				break;
				case 18 : e.setEighteenthColumn(value);
				break;
				default : System.out.println("out of switch");				 

				}	
				
			}
			System.out.println(rowNumber);
			tableList.add(e)	;
		}
			
		workbook.close();	
		if (rowNumber >0)
		{
			return tableList;
		}

//			return "Jai Shree Ganesh Ji Maharaj Ki Jai Ho";
		return null;		
	}

	@Override
	public Boolean checkFormat(MultipartFile file) {
		// Optional<String> a = Optional.ofNullable(file.getOriginalFilename()).filter(f
		// -> f.contains("."))
		// .map(f -> f.substring(f.lastIndexOf(".") + 1));
		// System.out.println(a.get());
		// if (a.get().equalsIgnoreCase("xlsx")) {
		// System.out.println(file.getContentType());
		// return true;
		// } else {
		// return false;
		// }

		// we could chose above code but we are checking meme type sof that o
		if (file.getContentType()
				.equalsIgnoreCase("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
			return true;
		} else {
			return false;
		}
	}

}
