/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activedge.image.action;

import com.activedge.image.data.UploadData;
import com.activedge.image.persistence.UploadDAO;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Backup
 */
public class UploadAction {

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the myFile
     */
    public File getMyFile() {
        return myFile;
    }

    /**
     * @param myFile the myFile to set
     */
    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    /**
     * @return the myFileContentType
     */
    public String getMyFileContentType() {
        return myFileContentType;
    }

    /**
     * @param myFileContentType the myFileContentType to set
     */
    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    /**
     * @return the myFileFileName
     */
    public String getMyFileFileName() {
        return myFileFileName;
    }

    /**
     * @param myFileFileName the myFileFileName to set
     */
    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

    /**
     * @return the myFilefilePath
     */
    public String getMyFilefilePath() {
        return myFilefilePath;
    }

    /**
     * @param myFilefilePath the myFilefilePath to set
     */
    public void setMyFilefilePath(String myFilefilePath) {
        this.myFilefilePath = myFilefilePath;
    }

    /**
     * @return the upload
     */
    public UploadData getUpload() {
        return upload;
    }

    /**
     * @param upload the upload to set
     */
    public void setUpload(UploadData upload) {
        this.upload = upload;
    }

    /**
     * @return the uploads
     */
    public List getUploads() {
        return uploads;
    }

    /**
     * @param uploads the uploads to set
     */
    public void setUploads(List uploads) {
        this.uploads = uploads;
    }

     private Long   id;
     private String name;
     private String password;
     private String email;
     private String gender;
     private File   myFile;
     private String myFileContentType;
     private String myFileFileName;
     private String myFilefilePath;
     private UploadData upload;
     private List uploads;
      
      
      public String execute()throws IOException{
      int i=UploadDAO.save(this);

      if(i>0){
      return "success";
}
      return "error" ;                
}
     public String findAllUploads()throws Exception{
     UploadDAO dao = new UploadDAO();
     List uploadList = dao.findAllUploads();
     setUploads(uploadList);
     return SUCCESS; 
}
      }
  

      