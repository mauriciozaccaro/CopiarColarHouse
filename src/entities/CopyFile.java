package entities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFile {

	 public static void CopyFile(File file, File file2) throws IOException {
		 if (file2.exists())
			 file2.delete();

		     FileChannel sourceChannel = null;
		     FileChannel destinationChannel = null;

		     try {
		    	 
		         sourceChannel = new FileInputStream(file).getChannel();
		         destinationChannel = new FileOutputStream(file2).getChannel();
		         sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
		         
		     } finally {
		         if (sourceChannel != null && sourceChannel.isOpen())
		             sourceChannel.close();
		         if (destinationChannel != null && destinationChannel.isOpen())
		             destinationChannel.close();
		    }
		 }
}
