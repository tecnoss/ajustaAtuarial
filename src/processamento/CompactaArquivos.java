package processamento;

import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompactaArquivos {

	
	public static void compacta(ArrayList listadeArquivos) {
		
		try {
			
			for (int i = 0; i < listadeArquivos.size(); i++) {
				
				File f = new File(listadeArquivos.get(i).toString());			
				
				String nomeArquivoZip = listadeArquivos.get(i).toString().replace("ENTRADA", "SAIDA");
				nomeArquivoZip = nomeArquivoZip.replace("txt", "zip");
				System.out.println(i + " - " + nomeArquivoZip);

				FileOutputStream fos = new FileOutputStream(nomeArquivoZip);
				ZipOutputStream zos = new ZipOutputStream(fos);
				
				
				addToZipFile(listadeArquivos.get(i).toString(), zos);
				
				zos.close();
				fos.close();					
				
			}			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	
	
	
	private static void addToZipFile(String fileName, ZipOutputStream zos) throws FileNotFoundException, IOException {

		System.out.println("Writing '" + fileName + "' to zip file");

		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zos.putNextEntry(zipEntry);

		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}

		zos.closeEntry();
		fis.close();
	}	
}
