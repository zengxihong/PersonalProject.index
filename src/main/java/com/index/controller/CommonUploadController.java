package com.index.controller;

import com.index.po.Picture;
import com.index.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/3.
 */
@Controller
@RequestMapping("/common")
public class CommonUploadController {
    @Autowired
    private PictureService pictureService;


@RequestMapping("/uploadPic")
@ResponseBody
   public Map<String, Object> uploadPic(HttpServletRequest request, HttpServletResponse response, MultipartFile picture) throws Exception{
    Map<String, Object> json = new HashMap<String, Object>();

if(picture!=null){
    //存储图片的物理路径
    String pic_path="F:\\uploadByTomcat\\index\\pic\\";
    //原始名称
    String originalFilename = picture.getOriginalFilename();
    //新的图片名称
    String newPicName= UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
    //新图片
    File newFile=new File(pic_path+newPicName);
    //将内存中的数据写入磁盘
    picture.transferTo(newFile);

    Picture p=new Picture();
     p.setPath("/pic/"+newPicName);

    pictureService.uploadPicture(p);

    json.put("success", "success");
}
    return json ;
    }

}
