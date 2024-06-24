-- ���� �ּ�
/* ���� �ּ� */
select 
    *   -- ��� �÷�
from 
    emp;
-- sql developer �ڵ� ���� ����Ű : ctrl + f7    
select 
    empno, ename, deptno --��ȸ�ϰ� ���� �÷� ���� �ۼ�
from 
    emp;    
    
select * from dept;
select * from salgrade;

select deptno from emp;
-- ���� ���� ����Ű : ctrl + shift + d

-- distinct�� select���� �ߺ��Ǵ� �ڷḦ �����ϰ� ������
select distinct deptno from emp; 
select distinct job from emp;

select deptno, job from emp; -- emp table���� deptno, job�� �����ͼ� ��� �������
-- �÷��� �������� ��� �÷����� ������ �ߺ��Ǵ°� ����
select distinct deptno, job from emp; 

-- null�� �����ϸ� ������ null�̴�
select ename, sal, sal*12+comm, comm from emp;
-- ��Ī�ȿ� ���Ⱑ �ִ� ���, "" ���� �Ұ�  
-- �����ϸ� ���⺸�� _�� ���� (as ��������)
select ename, sal, sal*12+comm as "new_sal", comm from emp; -- �÷����� �ٲ�

-- order by �ش� �÷����� ����, asc(��������)�� ���̴µ� ���� ����
select * from emp order by sal; -- sal�� ���ĵǼ� ��� (�ߺ��� ����X)
select * from emp order by comm; -- null �� �ֵ��� ������ ���� �������� ����
select * from emp order by sal desc; -- desc�� ��������

-- ������ ù��°���� �����ϰ�
-- �� �߿� ������ �ִٸ� �����ŷ� �����ϴ� ��� ex. deptno�����ϰ� sal�����ϴ� ���
select * from emp order by deptno asc, sal desc; 

select distinct job from emp order by job asc;

select * from emp where deptno = 30; 
select * from emp where empno = 7782;
select * from emp where sal >= 2000 order by sal;
select * from emp where ename = 'KING'; -- ���ڴ� ''�� ����, ��ҹ��� ������

select * from emp where deptno = 30 and job = 'SALESMAN';
select * from emp where job = 'CLERK' and deptno = 30;
-- and�� or���� �켱������ ����
select * from emp where job = 'CLERK' and deptno = 30 or deptno = 20;
select * from emp where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp where sal >= 2000 and sal < 3000;

select * from emp where sal <> 3000; -- <> �� != �� �����ϴ�

-- ������������ not
select * from emp where not(sal >= 2000 and sal < 3000); -- �����հ���

select * from emp where job in('MANAGER','SALESMAN','CLERK'); -- or�� �����
select * from emp where job not in('MANAGER','SALESMAN','CLERK'); -- in �տ� not

select * from emp where sal >=2000 and sal <= 3000; 
select * from emp where sal between 2000 and 3000; -- sql ����
select * from emp where sal not between 2000 and 3000;  -- not ��ġ

-- % ��ŵ� ������� (���ڼ��� �������)
select * from emp where ename like 'S%'; -- ��ҹ��� ������
select * from emp where ename like 'A%';
select * from emp where ename like '_L%'; -- �ձ��ڴ� ������� �ι�° ���ڸ� L�λ��
select * from emp where ename like '_____'; -- _�� �ѱ����ε� � ���ڵ� �������
select * from emp where ename like '%AM%'; -- �߰��� AM�� ���ԵǾ��ִ� ���� ã��

select * from emp where comm <= 400; -- null�� ����, �񱳰� ���� �ʴ´�
select * from emp where comm is null; --  is null  -> null�� ���
select * from emp where comm is not null; -- in not null -> null ���� ���

-- emp ���� deptno�� 10 �Ǵ� 20�� �����
-- empno, ename, sal, deptno�� ����ϼ���
select empno, ename, sal, deptno from emp where deptno = 10 or deptno = 20;
select empno, ename, sal, deptno from emp where deptno in (10, 20);

-- ������ Ÿ���� ���� �����ְ� ;�� ����� union �� �ۼ�
-- ���� �ٸ� ��ȸ ������� ������
select empno, ename, sal, deptno from emp where deptno = 10 union
select empno, ename, sal, deptno from emp where deptno = 20;
-- union�� �ߺ��� �ڷḦ �������ش�
select empno, ename, sal, deptno from emp where deptno = 10 union
select empno, ename, sal, deptno from emp where deptno = 10;
-- union all�� �ߺ� �ڷḦ ���������� �ʴ´� (�ߺ��Ű� X)
select empno, ename, sal, deptno from emp where deptno = 10 union all
select empno, ename, sal, deptno from emp where deptno = 10;

-- ����1
select * from emp where ename like '%S';
-- ����2
select empno, ename, job, sal, deptno from emp where deptno = 30 and job = 'SALESMAN';
-- ����3
-- ���տ����� ���X
select empno, ename, job, sal, deptno from emp where (deptno = 20 or deptno = 30) and sal > 2000;
select empno, ename, job, sal, deptno from emp where deptno in (20, 30) and sal > 2000;
-- ���տ����� ���
select empno, ename, job, sal, deptno from emp where deptno = 20 and sal > 2000 union
select empno, ename, job, sal, deptno from emp where deptno = 30 and sal > 2000;
-- ����4
select * from emp where not (sal >= 2000 and sal <=3000);
-- ����5
select ename, empno, sal, deptno from emp 
where ename like '%E%' and not(sal >= 1000 and sal <=2000) and deptno = 30;
-- ����6
select * from emp where ename not like '_L%' and comm is null and mgr is not null 
and job = 'MANAGER' or  job = 'CLERK'; -- job in ('MANAGER', 'CLERK')

select ename, upper(ename), lower(ename), initcap(ename) from emp;
-- �տ������� ���� �빮��, ���� �ҹ���, �ձ��ڸ� �빮��
select * from emp where lower(ename) like lower('%Mi%'); -- ���δ� �ҹ��ڷ� �ٲ㼭 �˻�

select ename, length(ename) from emp; -- ���� ����
select ename from emp where length(ename) >= 5 ; 
select length('��'), lengthb('��') from dual; -- �۾��� / byte ��

-- substr�� ����� �Ǵ� ����, ������ġ, ������ ����
-- ù��°���� �ΰ��� �߶��, ����°���� 2���� �߶��, 5��°���� ������ �ض�
-- �ڿ��� 3������ ���ٰ� 3������ �ٽ� �ڷ� �ι� �д´�
-- �ǵڿ� �͹��Ͼ��� ū ���ڰ� ���� ������ ���ٶ�� �ǹ�
-- length('')�� ���ڴ�� ��� ��
select job, lower(substr(job, length('job'), 2)), substr(job, 0, 2), 
substr(job, 3, 2), substr(job, 5), ename, 
substr(job, -3, 2), substr(job, 5, 100) from emp;

select job, replace(job,'A','*') from emp; -- job ���� a�� *�� �ٲ��

select job, length(job), (length(job)+1)/2, -- job �ȿ� ������ �۾��� +1 / 2
substr(job, (length(job)+1)/2, 1), -- (length(job)+1)/2 �۾��� �߶��
replace(job, substr(job, (length(job)+1)/2, 1), '*') from emp;

-- lpad�� ��, rpad�� �� (����� �Ǵ� ����, ��ü �ڸ� ��, ä�� ����(��ä��� ����) 
select job, lpad(job, 10, '#'), lpad(job, 4, '#') from emp;  

-- ���ڳ��� ��ġ�� �� ||
select empno || ename from emp;

-- �� �� ��������, �ٸ� �۾� ���̿� �ִ� ������ ���������� ����
select '   a b c   ', trim('   a b c   ') from dual;

-- ����1
select '210612-3123456' from dual;
-- substr('210612-3123456', 1, 8) || 
-- rpad(substr('210612-3123456', 1, 8), 14,'*')from dual;
select rpad(substr('210612-3123456', 1, 8), length('210612-3123456'),'*')from dual;

-- ����2
-- ����� �̸��� �տ� ���ڸ��� ���̰� �ϰ� �������� *�� ǥ��
-- ������ �� : WARD -> WA**, MARTIN -> MA****
-- ������� : �� �α��� + '***'
select ename, substr(ename, 1, 2) || rpad(substr(ename, 3, 100), length(ename), '*') from emp;
select ename, rpad(substr(ename, 3, 100), length(ename), '*') from emp;
select ename, rpad(substr(ename, 1, 2), length(ename),'*') from emp;

-- ����3
-- �ձ��� �ϳ���
-- WARD -> *ARD, MARTIN -> *ARTIN
select ename, lpad(substr(ename, 2, length(ename)), length(ename),'*') from emp;
select ename, '*' || substr(ename, 2, length(ename))from emp;

-- ����4
-- �ι�° �۾��� *
-- WARD -> W*RD, MARTIN -> M*RTIN
select ename, replace(ename, (substr(ename, 2, 1)), '*') from emp; -- ������ ���ڿ����� *�� �ٲ�
select ename, substr(ename, 1, 1) || '*' || substr(ename, (length(ename)/2 + 1), 100) from emp;
select ename, substr(ename, (length(ename)/2 + 1), 100) from emp;

-- ����5
-- ��� �۾��� *
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
        

select trunc(1234.5678) from dual; -- �Ҽ��� ������ �� ����
select trunc(1234.5678,2) from dual; -- ���� �ڸ� �����ؼ� ����
select trunc(1234.5678,-2) from dual; -- �Ҽ��� �������� �� ���ڸ� ����

-- ceil ���� ����� ū ����, floor ���� ����� ���� ����
select ceil(3.14), floor(3.14), ceil(-3.14), floor(-3.14) from dual; 

-- ���� ����Ŭ pc�� �ð� ��/��/�� ���
-- ���� 0�� ���� �ѱ� +9��
-- ��¥ ���� �� �Ϻθ� select�� ǥ�õ�
select sysdate, sysdate+1, sysdate-1 from dual;       
select sysdate, add_months(sysdate, 3) from dual;   

-- �÷��� +�� ������ ��� ���ڷ� �����ؼ� ������
-- || ���ڵ� ���ڷ� ���� ��, || �ڿ� ����/ + �ڿ� ����

-- 9�ð� ���̶�� ���� �� ���!
select to_char(sysdate+(9/24), 'yyyy"��"mm/dd hh24:mi:ss') from dual; -- �ѱ��� ""

select sysdate - to_date('2024-05-07', 'yyyy-mm-dd') from dual;
select to_char(to_date('2024-05-07', 'yyyy-mm-dd'), 'yyyy"��"mm/dd hh24:mi:ss') from dual;
-- ��¥�� �ְ� �Ǹ� �ð��� 0�� 0�� 0�ʰ� ��

select comm, nvl(comm, -1) from emp; -- null �� ��� ������ �����ͷ� ��ȯ
select comm, sal, sal + comm, sal+nvl(comm,0) from emp; -- ���� null�� ����� �ȵ�
select * from emp where comm = 0 or comm is null;
-- null�� ��� 0���� �ٲ�� �� ���� 0 �̶�� ���̶� ��� (where�� ���Ǹ� �ְ� select * �� ���� �״�� ���)
select * from emp where nvl(comm,0) = 0;

-- ���ڴ� ���ڿ�, ���ڴ� ���ڿ� Ÿ���� �����ϰ� ���������
select 
    case 
        when comm is null then 'N/A' 
        else to_char(comm) 
    end 
from emp; -- ''||comm (���ڷ� �ٲ�)

select 
    case 
        when comm is null then 0 
        else comm 
    end 
from emp;


-- ����1
select empno, rpad(substr(empno,1,2),length(empno),'*') as MASKING_EMPNO,
    ename, rpad(substr(ename,1,1),length(ename),'*') as MASKING_ENAME
    from emp;

-- ����2
select empno, ename, sal, trunc(sal/21.5, 2) as DAY_PAY, 
    round(trunc((sal/21.5)/8,2),1) as TIME_PAY1,
    round((sal/21.5)/8, 1) as TIME_PAY2 from emp; -- �� ���� ���

-- ����3
select empno, ename, hiredate, 
    to_char(add_months(hiredate, 3),'yyyy-mm-dd') as R_JOB1, 
    -- next day �� �Ͽ��Ϻ��� ����ϱ��� (1~7)
    to_char(next_day(add_months(hiredate, 3), 2), 'yyyy-mm-dd') as r_job2,
    nvl(to_char(comm),'N/A') as comm from emp;
    
-- ����4
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


-- countó�� null�� ���ܵ�
-- count�� *�� ���� ��
select sum(sal) from emp;
select count(sal), count(*), count(comm) from emp;
select count(*) from emp where ename like '%A%';

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;  

select * from emp;
select sum(sal), round(avg(sal),1) from emp where deptno = 10 union all
select sum(sal), round(avg(sal),1) from emp where deptno = 20 union all
select sum(sal), round(avg(sal),1) from emp where deptno = 30;

-- distinctó�� �ߺ��� ����, �з� ����
-- select group by �� ���̳� ������ �Լ�(�����Լ�)(ex.sum)�� �� �� ���� 
select deptno from emp group by deptno;
select deptno, avg(sal), sum(sal), count(*) from emp group by deptno;    
-- �ߺ��� ���� ���� (count(*) ���� �� �� ����)
select deptno, empno, sum(sal), count(*) from emp group by deptno, empno;  
-- group by, select �Ѵ� ���ԵǾ��־����
select deptno, job, count(*) from emp group by deptno, job order by deptno;

-- HAVING: group by������ ���, �����Լ��� �������� �ɰ� ������ ���
select deptno, job, count(*) from emp 
-- where count(*) > 2
group by deptno, job order by deptno;

select deptno, job, count(*) from emp group by deptno, job;
select deptno, job, avg(sal) from emp group by deptno, job
    having count(*) >= 2 order by deptno;


-- ����1
select deptno, trunc(avg(sal)), max(sal), min(sal), count(*) from emp group by deptno;

-- ����2
select job, count(*) from emp group by job having count(*) >= 3;

-- �ǽ�
select rpad(substr('210612-3123456', 1, 8), length('210612-3123456'),'*') from dual;
select rpad(substr('210612-3123456', 1, 2), length('210612'),'*') 
    || '-' || '*******' from dual;





        
        
        






