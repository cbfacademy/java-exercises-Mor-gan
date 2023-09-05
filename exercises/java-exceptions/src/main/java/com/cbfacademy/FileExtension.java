package com.cbfacademy;


public class FileExtension{
     String fileName;
     
    public int check(String filename) throws InvalidFilenameException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFilenameException("Invalid filename: " + fileName);
        }    
      if (this.fileName.endsWith(".java")) {
        return 1;
      }else{
        return 0;
      }
    }
}
