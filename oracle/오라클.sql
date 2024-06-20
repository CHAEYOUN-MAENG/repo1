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

select * from emp where sal between 2000 and 3000; -- sql 전용




