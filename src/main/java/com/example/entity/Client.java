package com.example.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

@Table(name = "auth_client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_auth_client.nextval from dual")
	private Integer id;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String code;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String secret;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String name;

	private String locked = "0";
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String description;

	@Column(name = "crt_time")
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private Date crtTime;

	@Column(name = "crt_user")
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String crtUser;

	@Column(name = "crt_name")
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String crtName;

	@Column(name = "crt_host")
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String crtHost;

	@Column(name = "upd_time")
	private Date updTime;

	@Column(name = "upd_user")
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String updUser;

	@Column(name = "upd_name")
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String updName;

	@Column(name = "upd_host")
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String updHost;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String attr1;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String attr2;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String attr3;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String attr4;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String attr5;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String attr6;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String attr7;
	@ColumnType(jdbcType = JdbcType.VARCHAR)
	private String attr8;
	@Transient
	private Integer page = 1;
	@Transient
	private Integer rows = 10;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return secret
	 */
	public String getSecret() {
		return secret;
	}

	/**
	 * @param secret
	 */
	public void setSecret(String secret) {
		this.secret = secret;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return locked
	 */
	public String getLocked() {
		return locked;
	}

	/**
	 * @param locked
	 */
	public void setLocked(String locked) {
		this.locked = locked;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return crt_time
	 */
	public Date getCrtTime() {
		return crtTime;
	}

	/**
	 * @param crtTime
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	/**
	 * @return crt_user
	 */
	public String getCrtUser() {
		return crtUser;
	}

	/**
	 * @param crtUser
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}

	/**
	 * @return crt_name
	 */
	public String getCrtName() {
		return crtName;
	}

	/**
	 * @param crtName
	 */
	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}

	/**
	 * @return crt_host
	 */
	public String getCrtHost() {
		return crtHost;
	}

	/**
	 * @param crtHost
	 */
	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}

	/**
	 * @return upd_time
	 */
	public Date getUpdTime() {
		return updTime;
	}

	/**
	 * @param updTime
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}

	/**
	 * @return upd_user
	 */
	public String getUpdUser() {
		return updUser;
	}

	/**
	 * @param updUser
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}

	/**
	 * @return upd_name
	 */
	public String getUpdName() {
		return updName;
	}

	/**
	 * @param updName
	 */
	public void setUpdName(String updName) {
		this.updName = updName;
	}

	/**
	 * @return upd_host
	 */
	public String getUpdHost() {
		return updHost;
	}

	/**
	 * @param updHost
	 */
	public void setUpdHost(String updHost) {
		this.updHost = updHost;
	}

	/**
	 * @return attr1
	 */
	public String getAttr1() {
		return attr1;
	}

	/**
	 * @param attr1
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	/**
	 * @return attr2
	 */
	public String getAttr2() {
		return attr2;
	}

	/**
	 * @param attr2
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	/**
	 * @return attr3
	 */
	public String getAttr3() {
		return attr3;
	}

	/**
	 * @param attr3
	 */
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}

	/**
	 * @return attr4
	 */
	public String getAttr4() {
		return attr4;
	}

	/**
	 * @param attr4
	 */
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}

	/**
	 * @return attr5
	 */
	public String getAttr5() {
		return attr5;
	}

	/**
	 * @param attr5
	 */
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}

	/**
	 * @return attr6
	 */
	public String getAttr6() {
		return attr6;
	}

	/**
	 * @param attr6
	 */
	public void setAttr6(String attr6) {
		this.attr6 = attr6;
	}

	/**
	 * @return attr7
	 */
	public String getAttr7() {
		return attr7;
	}

	/**
	 * @param attr7
	 */
	public void setAttr7(String attr7) {
		this.attr7 = attr7;
	}

	/**
	 * @return attr8
	 */
	public String getAttr8() {
		return attr8;
	}

	/**
	 * @param attr8
	 */
	public void setAttr8(String attr8) {
		this.attr8 = attr8;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
}
