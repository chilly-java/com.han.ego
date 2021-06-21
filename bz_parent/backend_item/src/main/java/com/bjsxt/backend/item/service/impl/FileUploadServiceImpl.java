package com.bjsxt.backend.item.service.impl;

import com.bjsxt.backend.item.service.FileUploadService;
import com.bjsxt.utils.FtpUtil;
import com.bjsxt.utils.IDUtils;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/*上传图片Service*/
@Service
public class FileUploadServiceImpl implements FileUploadService {

    @Override
    public Result fileUpload(MultipartFile file) {
        try {
            //定义上传图片的目录结构
            SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
            String path = sdf.format(new Date());

            //设置新的文件名
            String newFileName = IDUtils.genImageName() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            FtpUtil.uploadFile("192.168.31.128", 21, "ftpuser", "123", "/home/ftpuser/", path, newFileName, file.getInputStream());
            String imageURL = "http://192.168.31.128" + path + newFileName;
            return Result.ok(imageURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
