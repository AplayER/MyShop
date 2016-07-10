package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.service.ItemService;
import com.taotao.utils.EUDataGridResult;
import com.taotao.utils.TaotaoResult;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
    /*
     * 	通过商品ID获取商品
     * 
     */
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
   /*	
    * 根据分页信息（page，row）获取一列商品
    */	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	/*
	 * 保存商品到数据库
	 */
	@RequestMapping("/save")
	@ResponseBody
		public TaotaoResult saveItem(TbItem item, String desc) throws Exception {
			//添加商品信息
			itemService.saveItem(item, desc, null);
			return TaotaoResult.ok();
		}

	/*
	 * 创建一个商品
	 */
	@RequestMapping(value="/item/save",method=RequestMethod.POST)
	@ResponseBody
	private TaotaoResult createItem(TbItem item,String desc) throws Exception{
		TaotaoResult result = itemService.createItem(item, desc);
		return result;
	}


}
