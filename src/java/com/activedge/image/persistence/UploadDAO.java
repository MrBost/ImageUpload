/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activedge.image.persistence;

import com.activedge.image.action.UploadAction;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Backup
 */
public class UploadDAO {
    public static int save (UploadAction upload){
        int status = 0;
        long id =0;
        try{
            File oldfile = new File("myFileFileName");
            File newFile = new File(upload.getName()+ "Upload.jpg");
            oldfile.renameTo(newFile);
            File destFile= new File("image/" + newFile);
            FileUtils.copyFile(upload.getMyFile(),destFile);
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/image_test","root","");
            PreparedStatement stmt=conn.prepareStatement("insert into tst_bio values(?,?,?,?,?,?)");
            stmt.setLong(1, id);
            stmt.setString(2, upload.getName());
            stmt.setString(3, upload.getPassword()  );
            stmt.setString(4, upload.getEmail());
            stmt.setString(5, upload.getGender());
            String destFilep=destFile+ "";
            stmt.setString(6, destFilep);
            System.out.println("File inserted");
            status= stmt.executeUpdate();
            
        }
        catch (Exception e){e.printStackTrace();}
        return status;
        }
}
        
    

