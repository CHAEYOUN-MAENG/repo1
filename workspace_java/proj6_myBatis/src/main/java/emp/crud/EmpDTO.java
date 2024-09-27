package emp.crud; //emp2.dto 패키지

import java.sql.Date; //date타입을 사용할수 있게 해줌

public class EmpDTO { // 클래스명
// 이 페이지는 뭐 하는건지 모르겠음.
private Integer empno; //private은 보안상 문제로 사용 Integer는 int(숫자)로 호환시켜줌
private String ename; //String 문자
private String job;
private Integer mgr;
private Date hireDate;
private int sal;
private Integer comm;
private int deptno;

private int rnum;
private int lv;

private String keyword;
private String searchType;
private String[] checks;
private String orderType;

public int getLv() {
	return lv;
}

public int setLv(int lv) {
	return lv;
}

public int getRnum() {
   return rnum;// rnum의 값을 돌려줌
}

public void setRnum(int rnum) {
   this.rnum = rnum;
}

public Integer getEmpno() {
return this.empno;
}

public void setEmpno(Integer empno) {
this.empno = empno;
}

public String getEname() {
return ename;
}

public void setEname(String ename) {
this.ename = ename;
}

public String getJob() {
return job;
}

public void setJob(String job) {
this.job = job;
}

public Integer getMgr() {
return mgr;
}

public void setMgr(Integer mgr) {
this.mgr = mgr;
}

public Date getHireDate() {
return hireDate;
}

public void setHireDate(Date hireDate) {
this.hireDate = hireDate;
}

public int getSal() {
return sal;
}

public void setSal(int sal) {
this.sal = sal;
}

public Integer getComm() {
return comm;
}

public void setComm(Integer comm) {
this.comm = comm;
}

public int getDeptno() {
return deptno; 
}
// 인트로 하고 , 보이드로 하고 왜 두번하는건지 잘 모름.
public void setDeptno(int deptno) {
this.deptno = deptno;
}

public String getKeyword() {
	return keyword;
}

public void setKeyword(String keyword) {
	this.keyword = keyword;
}

public String getSearchType() {
	return searchType;
}

public void setSearchType(String searchType) {
	this.searchType = searchType;
}

public String[] getChecks() {
	return checks;
}

public void setChecks(String[] checks) {
	this.checks = checks;
}

@Override
public String toString() {
	return "EmpDTO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hireDate="
			+ hireDate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + ", keyword=" + keyword + "]";
}


}