package com.taotao.utils;

import java.util.List;


/*
 * 这是一个为支持EasyUI的格式而创造的pojo
*/
public class EUDataGridResult {
	
	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
