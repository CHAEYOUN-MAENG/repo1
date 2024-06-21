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
select ename, rpad(substr(ename, 1, 2), length(ename),'*') from emp;

-- 문제3
-- 앞글자 하나만
-- WARD -> *ARD, MARTIN -> *ARTIN
select ename, lpad(substr(ename, 2, length(ename)), length(ename),'*') from emp;

-- 문제4
-- 두번째 글씨만 *
-- WARD -> W*RD, MARTIN -> M*RTIN
select ename, replace(ename, (substr(ename, 2, 1)), '*') from emp; -- 동일한 문자열까지 *로 바뀜
select ename, substr(ename, 1, 1) || '*' || substr(ename, (length(ename)/2 + 1), 100) from emp;

-- 문제5
-- 가운데 글씨만 *
-- MARTIN -> MA*TIN, SCOTT -> SC*TT
select ename, substr(ename, length(ename)/2 + 1, 1) from emp;
select ename, Rpad(substr(ename, 1, (length(ename)/2)), length(ename)/2 + 1 ,'*')
                || substr(ename, length(ename)/2 + 2, 2) from emp;

select RPAD(substr(ename, 1, (length(ename)/2-0.5)), 
            length(ename)/2+0.5, '*') 
        || substr(ename, length(ename)/2+1.5) from emp;

select substr(ename, 1, (length(ename)/2-0.5)) from emp;
select ename, length(ename)/2+0.5 from emp;
select substr(ename, length(ename)/2+1.5) from emp;

select rpad(substr(ename, 1, (length(ename)/2-0.5)), length(ename)/2+0.5,'*') 
        || substr(ename, length(ename)/2+1.5) from emp;






