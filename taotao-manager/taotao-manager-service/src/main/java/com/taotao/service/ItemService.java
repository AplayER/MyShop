package com.taotao.service;

import com.taotao.pojo.TbItem;
import com.taotao.utils.EUDataGridResult;
import com.taotao.utils.TaotaoResult;

public interface ItemService {
	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page,int row);
	void saveItem(TbItem item, String desc, String itemParams) throws Exception;
	TaotaoResult createItem(TbItem item, String desc) throws Exception;
}
