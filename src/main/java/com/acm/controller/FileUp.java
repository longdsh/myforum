package com.acm.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.acm.bean.Message;

/**
 * @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
 * @version 创建时间：2017年11月14日 下午1:59:02 类说明
 */
@Controller
@RequestMapping("/fileUp")
public class FileUp {

	@ResponseBody
	@RequestMapping("/upHeadImage")
	public Message upHeadImage(HttpServletRequest request, MultipartFile headImage)
			throws IllegalStateException, IOException {
		//System.out.println(headImage);
		System.out.println("fileName：" + headImage.getOriginalFilename());
		String fileName = headImage.getOriginalFilename();
		String index = fileName.substring(fileName.lastIndexOf("."));
		System.out.println("后缀："+index);
		if(!index.equals(".jpg")&&!index.equals(".png")) {
			return Message.fail();
		}
		
		//修改fileName 
		fileName = new Date().getTime()+index;
		// String path="E:/"+new Date().getTime()+file.getOriginalFilename();
		
		String path = request.getServletContext().getRealPath("/userHeadImage/");


		File file = new File(path);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		path = path + "/" + fileName;//保存路径
		//System.out.println("路径：" + path);
		File newFile = new File(path);
		// 通过CommonsMultipartFile的方法直接写文件（注意这个时候）
		headImage.transferTo(newFile);
		 
		//设置回显路径
		String webPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+request.getContextPath();
		//System.out.println(webPath);
		webPath = webPath + "/userHeadImage/"+fileName;
		//System.out.println(webPath);

		return Message.success().add("path", path).add("webPath", webPath);
	}
}
