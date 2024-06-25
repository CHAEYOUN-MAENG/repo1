-- 한줄 주석
/* 범위 주석 */
select 
    *   -- 모든 컬럼
from 
    emp;
-- sql developer 자동 정렬 단축키 : ctrl + f7    
select 
    empno, ename, deptno --조회하고 싶은 컬럼 명을 작성
from 
    emp;    
    
select * from dept;
select * from salgrade;

select deptno from emp;
-- 한줄 복사 단축키 : ctrl + shift + d

-- distinct는 select에서 중복되는 자료를 제외하고 보여줌
select distinct deptno from emp; 
select distinct job from emp;

select deptno, job from emp; -- emp table에서 deptno, job를 가져와서 모두 보여줘라
-- 컬럼이 여러개인 경우 컬럼들의 조합이 중복되는걸 제거
select distinct deptno, job from emp; 

-- null과 연산하면 무조건 null이다
select ename, sal, sal*12+comm, comm from emp;
-- 별칭안에 띄어쓰기가 있는 경우, "" 생략 불가  
-- 가능하면 띄어쓰기보다 _를 넣자 (as 생략가능)
select ename, sal, sal*12+comm as "new_sal", comm from emp; -- 컬럼명을 바꿈

-- order by 해당 컬럼으로 정렬, asc(오름차순)을 붙이는데 생략 가능
select * from emp order by sal; -- sal이 정렬되서 출력 (중복은 보장X)
select * from emp order by comm; -- null 인 애들은 순서가 지금 정해지지 않음
select * from emp order by sal desc; -- desc는 내림차순

-- 순서는 첫번째꺼로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하는 방식 ex. deptno정렬하고 sal정렬하는 방식
select * from emp order by deptno asc, sal desc; 

select distinct job from emp order by job asc;

select * from emp where deptno = 30; 
select * from emp where empno = 7782;
select * from emp where sal >= 2000 order by sal;
select * from emp where ename = 'KING'; -- 문자는 ''만 가능, 대소문자 구분함

select * from emp where deptno = 30 and job = 'SALESMAN';
select * from emp where job = 'CLERK' and deptno = 30;
-- and가 or보다 우선순위가 높음
select * from emp where job = 'CLERK' and deptno = 30 or deptno = 20;
select * from emp where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp where sal >= 2000 and sal < 3000;

select * from emp where sal <> 3000; -- <> 와 != 가 동일하다

-- 논리부정연산자 not
select * from emp where not(sal >= 2000 and sal < 3000); -- 여집합개념

select * from emp where job in('MANAGER','SALESMAN','CLERK'); -- or의 축약형
select * from emp where job not in('MANAGER','SALESMAN','CLERK'); -- in 앞에 not

select * from emp where sal >=2000 and sal <= 3000; 
select * from emp where sal between 2000 and 3000; -- sql 전용
select * from emp where sal not between 2000 and 3000;  -- not 위치

-- % 어떤거든 상관없음 (글자수도 상관없음)
select * from emp where ename like 'S%'; -- 대소문자 잘적기
select * from emp where ename like 'A%';
select * from emp where ename like '_L%'; -- 앞글자는 상과없고 두번째 글자만 L인사람
select * from emp where ename like '_____'; -- _딱 한글자인데 어떤 글자도 관계없음
select * from emp where ename like '%AM%'; -- 중간에 AM이 포함되어있는 글자 찾기

select * from emp where comm <= 400; -- null이 빠짐, 비교가 되지 않는다
select * from emp where comm is null; --  is null  -> null만 출력
select * from emp where comm is not null; -- in not null -> null 제외 출력

-- emp 에서 deptno가 10 또는 20인 사원의
-- empno, ename, sal, deptno를 출력하세요
select empno, ename, sal, deptno from emp where deptno = 10 or deptno = 20;
select empno, ename, sal, deptno from emp where deptno in (10, 20);

-- 개수와 타입을 같게 맞춰주고 ;을 지우고 union 을 작성
-- 서로 다른 조회 결과물을 합쳐줌
select empno, ename, sal, deptno from emp where deptno = 10 union
select empno, ename, sal, deptno from emp where deptno = 20;
-- union은 중복된 자료를 제거해준다
select empno, ename, sal, deptno from emp where deptno = 10 union
select empno, ename, sal, deptno from emp where deptno = 10;
-- union all은 중복 자료를 제거해주지 않는다 (중복신경 X)
select empno, ename, sal, deptno from emp where deptno = 10 union all
select empno, ename, sal, deptno from emp where deptno = 10;

-- 문제1
select * from emp where ename like '%S';
-- 문제2
select empno, ename, job, sal, deptno from emp where deptno = 30 and job = 'SALESMAN';
-- 문제3
-- 집합연산자 사용X
select empno, ename, job, sal, deptno from emp where (deptno = 20 or deptno = 30) and sal > 2000;
select empno, ename, job, sal, deptno from emp where deptno in (20, 30) and sal > 2000;
-- 집합연산자 사용
select empno, ename, job, sal, deptno from emp where deptno = 20 and sal > 2000 union
select empno, ename, job, sal, deptno from emp where deptno = 30 and sal > 2000;
-- 문제4
select * from emp where not (sal >= 2000 and sal <=3000);
-- 문제5
select ename, empno, sal, deptno from emp 
where ename like '%E%' and not(sal >= 1000 and sal <=2000) and deptno = 30;
-- 문제6
select * from emp where ename not like '_L%' and comm is null and mgr is not null 
and job = 'MANAGER' or  job = 'CLERK'; -- job in ('MANAGER', 'CLERK')

select ename, upper(ename), lower(ename), initcap(ename) from emp;
-- 앞에서부터 전부 대문자, 전부 소문자, 앞글자만 대문자
select * from emp where lower(ename) like lower('%Mi%'); -- 전부다 소문자로 바꿔서 검색

select ename, length(ename) from emp; -- 글자 길이
select ename from emp where length(ename) >= 5 ; 
select length('한'), lengthb('한') from dual; -- 글씨수 / byte 수

-- substr은 대상이 되는 문자, 시작위치, 가져올 개수
-- 첫번째부터 두개만 잘라라, 세번째부터 2개만 잘라라, 5번째부터 나오게 해라
-- 뒤에서 3번까지 오다가 3번부터 다시 뒤로 두번 읽는다
-- 맨뒤에 터무니없는 큰 숫자가 오면 끝까지 간다라는 의미
-- length('')로 숫자대신 적어도 됨
select job, lower(substr(job, length('job'), 2)), substr(job, 0, 2), 
substr(job, 3, 2), substr(job, 5), ename, 
substr(job, -3, 2), substr(job, 5, 100) from emp;

select job, replace(job,'A','*') from emp; -- job 에서 a를 *로 바꿔라

select job, length(job), (length(job)+1)/2, -- job 안에 내용의 글씨수 +1 / 2
substr(job, (length(job)+1)/2, 1), -- (length(job)+1)/2 글씨만 잘라라
replace(job, substr(job, (length(job)+1)/2, 1), '*') from emp;

-- lpad는 앞, rpad는 뒤 (대상이 되는 문자, 전체 자리 수, 채울 문자(안채울시 공백) 
select job, lpad(job, 10, '#'), lpad(job, 4, '#') from emp;  

-- 문자끼리 합치는 것 ||
select empno || ename from emp;

-- 앞 뒤 공백제거, 다만 글씨 사이에 있는 공백은 제거해주지 않음
select '   a b c   ', trim('   a b c   ') from dual;

-- 문제1
select '210612-3123456' from dual;
-- substr('210612-3123456', 1, 8) || 
-- rpad(substr('210612-3123456', 1, 8), 14,'*')from dual;
select rpad(substr('210612-3123456', 1, 8), length('210612-3123456'),'*')from dual;

-- 문제2
-- 사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시
-- 정답의 예 : WARD -> WA**, MARTIN -> MA****
-- 쉬운버전 : 앞 두글자 + '***'
select ename, substr(ename, 1, 2) || rpad(substr(ename, 3, 100), length(ename), '*') from emp;
select ename, rpad(substr(ename, 3, 100), length(ename), '*') from emp;
select ename, rpad(substr(ename, 1, 2), length(ename),'*') from emp;

-- 문제3
-- 앞글자 하나만
-- WARD -> *ARD, MARTIN -> *ARTIN
select ename, lpad(substr(ename, 2, length(ename)), length(ename),'*') from emp;
select ename, '*' || substr(ename, 2, length(ename))from emp;

-- 문제4
-- 두번째 글씨만 *
-- WARD -> W*RD, MARTIN -> M*RTIN
select ename, replace(ename, (substr(ename, 2, 1)), '*') from emp; -- 동일한 문자열까지 *로 바뀜
select ename, substr(ename, 1, 1) || '*' || substr(ename, (length(ename)/2 + 1), 100) from emp;
select ename, substr(ename, (length(ename)/2 + 1), 100) from emp;

-- 문제5
-- 가운데 글씨만 *
-- MARTIN -> MA*TIN, SCOTT -> SC*TT
select ename, substr(ename, length(ename)/2 + 1, 1) from emp;
select ename, rpad(substr(ename, 1, (length(ename)/2)), length(ename)/2 + 1 ,'*')
                || substr(ename, length(ename)/2 + 2) from emp;

select RPAD(substr(ename, 1, (length(ename)/2-0.5)), 
            length(ename)/2+0.5, '*') 
        || substr(ename, length(ename)/2+1.5) from emp;

select substr(ename, 1, (length(ename)/2-0.5)) from emp;
select ename, length(ename)/2+0.5 from emp;
select substr(ename, length(ename)/2+1.5) from emp;

select rpad(substr(ename, 1, (length(ename)/2-0.5)), length(ename)/2+0.5,'*') 
        || substr(ename, length(ename)/2+1.5) from emp;
        

select trunc(1234.5678) from dual; -- 소수점 밑으로 다 버림
select trunc(1234.5678,2) from dual; -- 버릴 자리 지정해서 버림
select trunc(1234.5678,-2) from dual; -- 소수점 기준으로 앞 두자리 버림

-- ceil 가장 가까운 큰 정수, floor 가장 가까운 작은 정수
select ceil(3.14), floor(3.14), ceil(-3.14), floor(-3.14) from dual; 

-- 현재 오라클 pc의 시간 년/월/일 출력
-- 영국 0시 기준 한국 +9시
-- 날짜 정보 중 일부만 select로 표시됨
select sysdate, sysdate+1, sysdate-1 from dual;       
select sysdate, add_months(sysdate, 3) from dual;   

-- 컬럼에 +를 적으면 모두 숫자로 변경해서 적용함
-- || 숫자도 문자로 적용 즉, || 뒤에 문자/ + 뒤에 숫자

-- 9시간 전이라는 것을 꼭 고려!
select to_char(sysdate+(9/24), 'yyyy"년"mm/dd hh24:mi:ss') from dual; -- 한글은 ""

select sysdate - to_date('2024-05-07', 'yyyy-mm-dd') from dual;
select to_char(to_date('2024-05-07', 'yyyy-mm-dd'), 'yyyy"년"mm/dd hh24:mi:ss') from dual;
-- 날짜만 넣게 되면 시간은 0시 0분 0초가 됨

select comm, nvl(comm, -1) from emp; -- null 일 경우 지정한 데이터로 반환
select comm, sal, sal + comm, sal+nvl(comm,0) from emp; -- 원래 null은 계산이 안됨
select * from emp where comm = 0 or comm is null;
-- null인 경우 0으로 바뀌고 그 값이 0 이라면 참이라 출력 (where은 조건만 주고 select * 은 원본 그대로 출력)
select * from emp where nvl(comm,0) = 0;

-- 숫자는 숫자와, 문자는 문자와 타입을 동일하게 맞춰줘야함
select 
    case 
        when comm is null then 'N/A' 
        else to_char(comm) 
    end 
from emp; -- ''||comm (문자로 바꿈)

select 
    case 
        when comm is null then 0 
        else comm 
    end 
from emp;


-- 문제1
select empno, rpad(substr(empno,1,2),length(empno),'*') as MASKING_EMPNO,
    ename, rpad(substr(ename,1,1),length(ename),'*') as MASKING_ENAME
    from emp;

-- 문제2
select empno, ename, sal, trunc(sal/21.5, 2) as DAY_PAY, 
    round(trunc((sal/21.5)/8,2),1) as TIME_PAY1,
    round((sal/21.5)/8, 1) as TIME_PAY2 from emp; -- 더 좋은 방법

-- 문제3
select empno, ename, hiredate, 
    to_char(add_months(hiredate, 3),'yyyy-mm-dd') as R_JOB1, 
    -- next day 는 일요일부터 토요일까지 (1~7)
    to_char(next_day(add_months(hiredate, 3), 2), 'yyyy-mm-dd') as r_job2,
    nvl(to_char(comm),'N/A') as comm from emp;
    
-- 문제4
select empno, ename,
    case
        when mgr is null then ' '
        else to_char(mgr) 
    end as mgr,    
    case 
        when to_char(mgr) is null then '0000'
        when substr(mgr,1,2) = '75' then '5555'
        when substr(mgr,1,2) = '76' then '6666'
        when substr(mgr,1,2) = '77' then '7777'
        when substr(mgr,1,2) = '78' then '8888'
        else to_char(mgr)
    end as CHG_mgr from emp;


-- count처럼 null은 제외됨
-- count는 *를 많이 씀
select sum(sal) from emp;
select count(sal), count(*), count(comm) from emp;
select count(*) from emp where ename like '%A%';

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;  

select * from emp;
select sum(sal), round(avg(sal),1) from emp where deptno = 10 union all
select sum(sal), round(avg(sal),1) from emp where deptno = 20 union all
select sum(sal), round(avg(sal),1) from emp where deptno = 30;

-- distinct처럼 중복을 제거, 분류 해줌
-- select group by 한 것이나 다중행 함수(집계함수)(ex.sum)만 올 수 있음 
select deptno from emp group by deptno;
select deptno, avg(sal), sum(sal), count(*) from emp group by deptno;    
-- 중복된 것이 없음 (count(*) 보면 알 수 있음)
select deptno, empno, sum(sal), count(*) from emp group by deptno, empno;  
-- group by, select 둘다 포함되어있어야함
select deptno, job, count(*) from emp group by deptno, job order by deptno;

-- HAVING: group by에서만 사용, 집계함수를 조건으로 걸고 싶을때 사용
select deptno, job, count(*) from emp 
-- where count(*) > 2
group by deptno, job order by deptno;

select deptno, job, count(*) from emp group by deptno, job;
select deptno, job, avg(sal) from emp group by deptno, job
    having count(*) >= 2 order by deptno;


-- 문제1
select deptno, floor(avg(sal)), max(sal), min(sal), count(*) from emp group by deptno;

-- 문제2
select job, count(*) from emp group by job having count(*) >= 3;

-- 실습
select rpad(substr('210612-3123456', 1, 8), length('210612-3123456'),'*') from dual;
select rpad(substr('210612-3123456', 1, 2), length('210612'),'*') 
    || '-' || '*******' from dual;


select * from dept; -- 부서번호를 통해 emp와 dept table이 관계가 있음

/*5*/ select job, count(*) cnt /*1*/ from emp 
    /*2*/ where sal > 1000 /*3*/ group by job /*4*/ having count(*) >=3 
        /*6*/ order by cnt desc;
        
select * from emp, dept order by empno;   -- 14 * 4 (모든 조합을 다 보여줌)

select emp.ename, dept.loc, emp.deptno /* emp.loc(emp에는 loc가 없음), deptno(중복) */ 
    from emp, dept where emp.deptno = dept.deptno -- 등가조인
        order by empno; 
-- 테이블 두개 이상 조회할때 관계를 꼭 알려줘야 원하는 정보가 출력 (전체 테이블 수 - 1개의 조건)

-- table에다가 별칭줄때는 as를 주면 안됨, 대소문자 가리지 않음
select * from eMp E, dept d where E.deptno = d.deptno; -- 별칭 준 후, emp.deptno는 이제 안됨

-- * 와 컬럼을 같이 쓰는 경우, *에 table을 지정해줘야 한다
-- 실무에서는 *를 잘 사용하지않고 컬럼명을 나열해서 작성함
select ename, e.* from eMp E, dept d where E.deptno = d.deptno;

select * from salgrade;

select * from emp E, salgrade S where E.sal >= s.losal and e.sal <= s.hisal;

select * from emp;
-- null인 데이터는 일단 조인 X, ex. king(mgr = null)의 상사는 없음
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename from emp E1, emp E2 
    where e1.mgr = e2.empno; -- mgr이 상사코드, empno 상사코드를 받아 조인 (자체조인)

-- emp 테이블에 dept를 조인해라    
select * from emp join dept using (deptno); -- using에 둘 다 같은 컬럼명이 있는 경우만 사용 
-- select * from emp e1, emp e2 where e1.deptno = e2.deptno 

select * from emp join dept on (emp.deptno = dept.deptno);

select * from emp e1 join emp e2 on (e1.mgr = e2.empno);
/* select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename from emp E1, emp E2 
    where e1.mgr = e2.empno; */
    
-- king이 출력되냐 안되냐 즉, null값이 출력되냐 안되냐라는 뜻 
-- left outer join 왼쪽테이블(e1)은 null이던 아니던 무조건 출력
select * from emp e1 left outer join emp e2 on (e1.mgr = e2.empno);  
select * from emp e1 right outer join emp e2 on (e1.mgr = e2.empno);  

-- quiz 1 (2개 조인)
-- empno, ename, dname, loc 출력, 14줄
select e.empno, e.ename, d.dname, d.loc from emp E, dept d 
    where e.deptno = d.deptno;
    
select e.empno, e.ename, d.dname, d.loc from emp E join dept d using(deptno);
    
-- quiz 2 (3개 조인)
-- 사번, 이름, 부서명, 급여등급을 출력, 14줄
select e.empno, e.ename, d.dname, s.grade from emp e, dept d, salgrade s
    where e.deptno = d.deptno and (E.sal >= s.losal and e.sal <= s.hisal);

-- emp 와 dept는 조인으로 사용 emp 와 salgrade는 where로 사용
select e.empno, e.ename, d.dname from salgrade s, emp e 
    join dept d using(deptno) where(E.sal >= s.losal and e.sal <= s.hisal);
    
select e.empno, e.ename, d.dname, s.grade from emp e
    left outer join dept d on (e.deptno = d.deptno)
    left outer join salgrade s on (E.sal >= s.losal and e.sal <= s.hisal);
    
 select * from emp;
 select * from dept;
 select * from salgrade;
 
-- quiz 3 
-- 상사보다 월급이 높은 사원의 이름, 급여, 상사 이름, 상사 급여
select e1.ename, e1.sal, d.dname , e2.ename, e2.sal from emp e1, emp e2, dept d
    where (e1.mgr = e2.empno) and (e1.sal > e2.sal) and (e1.deptno = d.deptno);
    
-- 문제1
select e.deptno, d.dname, e.empno, e.ename, e.sal from emp e, dept d 
    where (e.sal > 2000) and (e.deptno = d.deptno) order by deptno;
    
-- 문제2
select e.deptno, d.dname, floor(avg(e.sal)), max(e.sal), min(e.sal), count(*) 
    from emp e, dept d where (e.deptno = d. deptno) group by e.deptno, d.dname;
    
select e.deptno, d.dname, floor(avg(e.sal)), max(e.sal), min(e.sal), count(*)
    from emp e left outer join dept d on (e.deptno = d.deptno) group by e.deptno, d.dname;
    
-- 문제3
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal from emp e, dept d
    where e.deptno = d.deptno order by deptno;

select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal from emp e
    right outer join dept d on (e.deptno = d.deptno); -- 오른쪽 외부조인
    
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal from dept d
    left outer join emp e on (e.deptno = d.deptno) order by d.deptno; -- 왼쪽 외부조인
    
-- 문제4
select d.deptno, d.dname, e1.empno, e1.ename, e1.mgr, e1.sal, 
    e2.deptno, s.losal, s.hisal, s.grade, e2.empno, e2.ename 
        from emp e1, emp e2, dept d, salgrade s 
            where (e1.mgr = e2.empno) and (e1.deptno = d.deptno) 
                and (e1.sal >= s.losal and e1.sal <= s.hisal) order by d.deptno;
                
select d.deptno, d.dname, e1.empno, e1.ename, e1.mgr, e1.sal, 
    e2.deptno, s.losal, s.hisal, s.grade, e2.empno, e2.ename from dept d
        left outer join emp e1 on (e1.deptno = d.deptno) 
        left outer join emp e2 on (e1.mgr = e2.empno)
        left outer join salgrade s on (e1.sal >= s.losal and e1.sal <= s.hisal) order by d.deptno, e1.empno;
    
-- 서브쿼리
select sal from emp where ename = 'JONES';    
select * from emp where sal > 2975;
select * from emp where sal > (select sal from emp where ename = 'JONES');

-- 단일행 서브쿼리
select avg(sal) from emp;
select * from emp where sal > (select avg(sal) from emp);

select sal from emp where ename='BLAKE';
select * from emp where sal > (select sal from emp where ename='BLAKE');

select job from emp where ename='JONES';
select * from emp where job = (select job from emp where ename='JONES');

-- 다중행 서브쿼리
select max(sal) from emp group by deptno;
select * from emp where sal in (select max(sal) from emp group by deptno);

select max(sal) from emp where deptno = 30;
select * from emp where sal > (select max(sal) from emp where deptno = 30) order by deptno desc;


        
        






