package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import entities.CopyFile;
import entities.copyTransfer;

public class Program {

	public static void main(String[] args) throws IOException {
		
		
		CopyFile cf = new CopyFile();
		
		String origem = "c:\\Aula_189";
		String destino = "c:\\Aula_189\\out";
		
		String sourceFile = "c:\\Aula_189\\Source.txt";
		String targetFile = "c:\\Aula_189\\out\\Source.txt";
		
		FileChannel sourceChannel = null;
		FileChannel targetChannel = null;
		
		File origemFile = new File(origem);
		
		File[] arquivx = origemFile.listFiles(File::isFile);
		
		for(File fl : arquivx) {
			
			File aux = new File(fl.getPath());
			String aux2 = fl.getParent() + "\\out\\" + fl.getName(); 
			File aux3 = new File(aux2);
					
			sourceChannel = new FileInputStream(aux).getChannel();
			targetChannel = new FileOutputStream(aux3).getChannel();
			
			sourceChannel.transferTo(0, sourceChannel.size(), targetChannel);
			
				System.out.println(fl.getName() + " ... Copiado com Sucesso!");
			
		}
		
		System.out.println();
		System.out.println(arquivx.length + " arquivos copiados!");
	}
	
}
