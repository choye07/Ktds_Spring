package com.hello.common.vo;

public abstract class Search {

	private int pageNo;
	private int listSize;
	private int pageCount;

	private int pageCountInGroup;
	private int groupCount;
	private int groupNo;
	private int groupStartPageNo;
	private int groupEndPageNo;
	private boolean hasNextGroup;
	private boolean hasPrevGroup;
	private int nextGroupStartPageNo;
	private int prevGroupStartPageNo;

	public Search() {
		this.listSize = 10;
		this.pageCountInGroup = 10;
	}

	public int getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getListSize() {
		return this.listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public int getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(int searchCount) {
		// 총 페이지수 구하기
		this.pageCount = (int) Math.ceil((double) searchCount / this.listSize);
		
		// 총 그룹 수 구하기
		this.groupCount = (int) Math.ceil( (double) this.pageCount / this.pageCountInGroup);
		
		// 현재 페이지 그룹 번호 구하기
		this.groupNo = this.pageNo / this.pageCountInGroup;
		
		// 현재 페이지 그룹의 시작 페이지 번호 구하기
		this.groupStartPageNo = this.groupNo * this.pageCountInGroup;
		
		// 현재 페이지 그룹의 마지막 페이지 번호 구하기
		this.groupEndPageNo = (this.groupNo + 1) * this.pageCountInGroup - 1;
		
		// 총 페이지의 수가 현재 페이지 그룹의 마지막 페이지보다 작을 때 
		//  현재 페이지 그룹의 마지막 페이지를 수정.
		if (this.groupEndPageNo > this.pageCount) {
			this.groupEndPageNo = this.pageCount - 1;
		}
		if (this.groupEndPageNo < 0) {
			this.groupEndPageNo = 0;
		}
		
		// 다음 그룹이 있는지 확인하기
		this.hasNextGroup = this.groupNo + 1 < this.groupCount;
		
		// 이전 그룹이 있는지 확인하기
		this.hasPrevGroup = this.groupNo > 0;
		
		// 다음 페이지 그룹의 시작 페이지 번호 구하기
		this.nextGroupStartPageNo = this.groupEndPageNo + 1;
		this.prevGroupStartPageNo = this.groupStartPageNo - this.pageCountInGroup;
	}

	public int getPageCountInGroup() {
		return this.pageCountInGroup;
	}

	public int getGroupCount() {
		return this.groupCount;
	}

	public int getGroupNo() {
		return this.groupNo;
	}

	public int getGroupStartPageNo() {
		return this.groupStartPageNo;
	}

	public int getGroupEndPageNo() {
		return this.groupEndPageNo;
	}

	public boolean isHasNextGroup() {
		return this.hasNextGroup;
	}

	public boolean isHasPrevGroup() {
		return this.hasPrevGroup;
	}

	public int getNextGroupStartPageNo() {
		return this.nextGroupStartPageNo;
	}

	public int getPrevGroupStartPageNo() {
		return this.prevGroupStartPageNo;
	}

}
