package kr.co.itcen.jblog.vo;

public class CategoryVo {

	private Long categoryNo;
	private String name;
	private String description;
	private String regDate;
	private int delYn;
	private String id;
	private int postCnt;
	
	public Long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getDelYn() {
		return delYn;
	}
	public void setDelYn(int delYn) {
		this.delYn = delYn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPostCnt() {
		return postCnt;
	}
	public void setPostCnt(int postCnt) {
		this.postCnt = postCnt;
	}
	
	@Override
	public String toString() {
		return "CategoryVo [categoryNo=" + categoryNo + ", name=" + name + ", description=" + description + ", regDate="
				+ regDate + ", delYn=" + delYn + ", id=" + id + ", postCnt=" + postCnt + "]";
	}
	
	

}
