package com.ameya.fileProcessingDependency;


public class LoadingFile {
	
	private ScannerLoading scanload;
	
	public LoadingFile(ScannerLoading scanload) {
		this.scanload = scanload;
		}
	
	public void readCsv(String filePath) {
		scanload.readCsv(filePath);
	}

}
