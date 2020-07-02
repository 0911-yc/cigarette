package com.xr.smoke.controller;

import com.xr.smoke.entity.Responsibility;
import com.xr.smoke.service.ResponsibilityService;
import com.xr.smoke.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("resp")
public class ResponsibilityController {
    @Autowired
    private ResponsibilityService responsibilityService;

    @RequestMapping("FileUpload")
    // @ApiOperation(value = "文件上传",notes = "文件上传")
    public String FileUpload(@RequestParam("file") MultipartFile file, @RequestParam("id") Integer id) {
        System.out.println("文件上传" + file);
        fileupload(file);
        System.out.println(file.getOriginalFilename()+"JJJ");
        responsibilityService.xiugai(file.getOriginalFilename(), id);
        return "";
    }

    //保存文件
    private Boolean fileupload(MultipartFile file) {
        System.out.println("文件上传" + file.getOriginalFilename());
        OutputStream os = null;
        InputStream inputStream = null;
        String fileName = null;
        try {
            inputStream = file.getInputStream();
            fileName = file.getOriginalFilename();
            System.out.println("fileName=" + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String path = "d:\\test\\";
            // 2、保存到临时文件
            // 1K的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            // 输出的文件流保存到本地文件
            File tempFile = new File(path);
            if (!tempFile.exists()) {
                tempFile.mkdirs();
            }
            os = new FileOutputStream(tempFile.getPath() + File.separator + file.getOriginalFilename());
            // 开始读取
            while ((len = inputStream.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 完毕，关闭所有链接
            try {
                os.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    @RequestMapping("list")
    public ResponseResult list(Responsibility responsibility, Integer page, Integer limit) {
        List<Responsibility> list = responsibilityService.list(responsibility);
        List<Responsibility> list1 = responsibilityService.list1(responsibility.getSupervisiontitle(), (page - 1) * limit, limit);
        ResponseResult result = new ResponseResult();
        result.getData().put("items", list1);
        result.getData().put("total", list.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(Responsibility responsibility) {
        //获取系统当前时间
        String timestamp = new String(String.valueOf(System.currentTimeMillis()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = null;
        try {
            time = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        responsibility.setSupervisionid(timestamp);
        responsibility.setCreationTime(time);
        responsibilityService.add(responsibility);
        Responsibility max = responsibilityService.max();
        ResponseResult result = new ResponseResult();
        result.getData().put("id",max.getId());
        result.getData().put("message", "添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(Responsibility responsibility) {
        responsibilityService.update(responsibility);
        ResponseResult result = new ResponseResult();
        result.getData().put("message", "修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(int id) {
        responsibilityService.delete(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message", "删除成功");
        return result;
    }

    @RequestMapping("tz")
    public ResponseResult tz(int id){
        responsibilityService.tz(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","发布成功");
        return result;
    }
}
