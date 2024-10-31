package com.example.bldq.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.example.bldq.Service.ICategoryService;
import com.example.bldq.entity.Category;

@Controller
@RequestMapping("admin/categories")
public class CategoryController {

	@Autowired
	ICategoryService categoryService;

	@RequestMapping("")
	public String listcategories(ModelMap model) {
		List<Category> list = categoryService.findAll();
		model.addAttribute("categories", list);
		return "admin/categories/list";
	}

}
