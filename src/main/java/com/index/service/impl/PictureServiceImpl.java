package com.index.service.impl;

import com.index.mapper.PictureMapper;
import com.index.po.Picture;
import com.index.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/3.
 */
@Service("pictureService")
public class PictureServiceImpl implements PictureService{
    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public void uploadPicture(Picture picture) throws Exception {
        pictureMapper.uploadPic(picture);
    }
}
