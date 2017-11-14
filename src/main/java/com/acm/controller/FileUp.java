package com.acm.controller;

import java.io.File;
import java.io.IOException;
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
	public Message upHeadImage(HttpServletRequest request) throws IllegalStateException, IOException {
		long startTime = System.currentTimeMillis();
		String path = null;
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名

			MultipartFile file = multiRequest.getFile("headImage");

			// String path="E:/springUpload"+file.getOriginalFilename();
			String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/userFile/");
			// 上传
			path = realPath + file.getOriginalFilename();
			System.out.println(path);
			file.transferTo(new File(path));

			long endTime = System.currentTimeMillis();
			System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");

			
		}
		return Message.success().add("path", path);
	}
}
