package entities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class copyTransfer {

	String sourcePath;
	String targetPath;
	
	FileChannel sourceChannel;
	FileChannel targetChannel;
	
	public copyTransfer(String sourcePath, String targetPath, FileChannel sourceChannel, FileChannel targetChannel) {
		this.sourcePath = sourcePath;
		this.targetPath = targetPath;
		this.sourceChannel = sourceChannel;
		this.targetChannel = targetChannel;
	}
	public String getSourcePath() {
		return sourcePath;
	}
	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}
	public String getTargetPath() {
		return targetPath;
	}
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}
	public FileChannel getSourceChannel() {
		return sourceChannel;
	}
	public void setSourceChannel(FileChannel sourceChannel) {
		this.sourceChannel = sourceChannel;
	}
	public FileChannel getTargetChannel() {
		return targetChannel;
	}
	public void setTargetChannel(FileChannel targetChannel) {
		this.targetChannel = targetChannel;
	}
	
	public void copyFile(File fls) throws FileNotFoundException {
		sourceChannel = new FileInputStream(fls).getChannel();
	}
	public void colaFile(File fileT) throws FileNotFoundException {
		targetChannel = new FileOutputStream(fileT).getChannel();
	}
	
}
