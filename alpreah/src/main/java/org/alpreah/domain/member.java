package org.alpreah.domain;

public class member {
	private String m_id;
	private String m_pw;
	private Integer seq;
	
	
	public String getM_id() {
		return m_id;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
}
