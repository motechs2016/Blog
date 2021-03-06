package cn.kee.core.entity.bo;

import java.util.Date;

import cn.kee.core.exception.ServiceException;
import cn.kee.core.util.StringUtil;

/**
 * 博客文章
 * @author jinhang
 * 2014年8月13日
 */
public class BlogArticleBo {
	
	private int id;
	/**
	 * 文章标题
	 */
	private String title = "";
	/**
	 * 文章主体内容
	 */
	private String content = "";
	/**
	 * 文章内容的前面200字的节选,展示到列表上
	 */
	private String contentDesc = "";
	/**
	 * 发表时间
	 */
	private Date publishTime = new Date();
	/**
	 * 作者
	 */
	private String author = "博客";
	/**
	 * 阅读次数
	 */
	private int userReadCount = 1;
	/**
	 * 分类
	 */
	private int category = 1;
	
	private Date createTime = new Date();
	
	/**
	 * 广告类型：1.alimama2.baidu3.谷歌  
	 */
	private int adCompanyType = 1;
	/**
	 * 广告内容类型：1.宽度640*90;2.宽度
	 */
	private int adBoxType = 1;
	/**
	 * 网页的关键词
	 */
	private String keyWords = "博客,coding";
	/**
	 * 网页的描述
	 */
	private String description = "作为一个java程序员,博客希望将自己懂得技术,包含但不限于nginx,tomcat,spring mvc,ssh等分享给大家。";

	/**
	 * 网页的tag
	 */
	private String tag = "";
	/**
	 * 是否展示：1展示，2不展示
	 */
	private int showFlag = 2;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContentDesc() {
		return contentDesc;
	}

	public void setContentDesc(String contentDesc) {
		this.contentDesc = contentDesc;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getUserReadCount() {
		return userReadCount;
	}

	public void setUserReadCount(int userReadCount) {
		this.userReadCount = userReadCount;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public int getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(int showFlag) {
		this.showFlag = showFlag;
	}

	@Override
	public String toString() {
		return "BlogArticleBo [id=" + id + ", title=" + title + ", content="
				+ content + ", contentDesc=" + contentDesc + ", publishTime="
				+ publishTime + ", author=" + author + ", userReadCount="
				+ userReadCount + ", category=" + category + ", createTime="
				+ createTime + ", adCompanyType=" + adCompanyType
				+ ", adBoxType=" + adBoxType + ", keyWords=" + keyWords
				+ ", description=" + description + ", tag=" + tag
				+ ", showFlag=" + showFlag + "]";
	}
	
	public void saveVlidate() throws ServiceException{
		if(StringUtil.isEmpty(this.getTitle())){
			throw new ServiceException("title不可以为空");
		}
		if(StringUtil.isEmpty(this.getContent())){
			throw new ServiceException("内容不可以为空");
		}
	}
	
	

	public int getAdCompanyType() {
		return adCompanyType;
	}

	public void setAdCompanyType(int adCompanyType) {
		this.adCompanyType = adCompanyType;
	}

	public int getAdBoxType() {
		return adBoxType;
	}

	public void setAdBoxType(int adBoxType) {
		this.adBoxType = adBoxType;
	}

	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getHtmlTitle(){
		return this.getTitle() + "_博客_博客";
	}
	
	
	
}
