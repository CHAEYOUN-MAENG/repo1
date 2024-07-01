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
select deptno, floor(avg(sal)), max(sal), min(sal), count(*) from emp group by deptno;

-- ����2
select job, count(*) from emp group by job having count(*) >= 3;

-- �ǽ�
select rpad(substr('210612-3123456', 1, 8), length('210612-3123456'),'*') from dual;
select rpad(substr('210612-3123456', 1, 2), length('210612'),'*') 
    || '-' || '*******' from dual;


select * from dept; -- �μ���ȣ�� ���� emp�� dept table�� ���谡 ����

/*5*/ select job, count(*) cnt /*1*/ from emp 
    /*2*/ where sal > 1000 /*3*/ group by job /*4*/ having count(*) >=3 
        /*6*/ order by cnt desc;
        
select * from emp, dept order by empno;   -- 14 * 4 (��� ������ �� ������)

select emp.ename, dept.loc, emp.deptno /* emp.loc(emp���� loc�� ����), deptno(�ߺ�) */ 
    from emp, dept where emp.deptno = dept.deptno -- �����
        order by empno; 
-- ���̺� �ΰ� �̻� ��ȸ�Ҷ� ���踦 �� �˷���� ���ϴ� ������ ��� (��ü ���̺� �� - 1���� ����)

-- table���ٰ� ��Ī�ٶ��� as�� �ָ� �ȵ�, ��ҹ��� ������ ����
select * from eMp E, dept d where E.deptno = d.deptno; -- ��Ī �� ��, emp.deptno�� ���� �ȵ�

-- * �� �÷��� ���� ���� ���, *�� table�� ��������� �Ѵ�
-- �ǹ������� *�� �� ��������ʰ� �÷����� �����ؼ� �ۼ���
select ename, e.* from eMp E, dept d where E.deptno = d.deptno;

select * from salgrade;

select * from emp E, salgrade S where E.sal >= s.losal and e.sal <= s.hisal;

select * from emp;
-- null�� �����ʹ� �ϴ� ���� X, ex. king(mgr = null)�� ���� ����
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename from emp E1, emp E2 
    where e1.mgr = e2.empno; -- mgr�� ����ڵ�, empno ����ڵ带 �޾� ���� (��ü����)

-- emp ���̺� dept�� �����ض�    
select * from emp join dept using (deptno); -- using�� �� �� ���� �÷����� �ִ� ��츸 ��� 
-- select * from emp e1, emp e2 where e1.deptno = e2.deptno 

select * from emp join dept on (emp.deptno = dept.deptno);

select * from emp e1 join emp e2 on (e1.mgr = e2.empno);
/* select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename from emp E1, emp E2 
    where e1.mgr = e2.empno; */
    
-- king�� ��µǳ� �ȵǳ� ��, null���� ��µǳ� �ȵǳĶ�� �� 
-- left outer join �������̺�(e1)�� null�̴� �ƴϴ� ������ ���
select * from emp e1 left outer join emp e2 on (e1.mgr = e2.empno);  
select * from emp e1 right outer join emp e2 on (e1.mgr = e2.empno);  

-- quiz 1 (2�� ����)
-- empno, ename, dname, loc ���, 14��
select e.empno, e.ename, d.dname, d.loc from emp E, dept d 
    where e.deptno = d.deptno;
    
select e.empno, e.ename, d.dname, d.loc from emp E join dept d using(deptno);
    
-- quiz 2 (3�� ����)
-- ���, �̸�, �μ���, �޿������ ���, 14��
select e.empno, e.ename, d.dname, s.grade from emp e, dept d, salgrade s
    where e.deptno = d.deptno and (E.sal >= s.losal and e.sal <= s.hisal);

-- emp �� dept�� �������� ��� emp �� salgrade�� where�� ���
select e.empno, e.ename, d.dname from salgrade s, emp e 
    join dept d using(deptno) where(E.sal >= s.losal and e.sal <= s.hisal);
    
select e.empno, e.ename, d.dname, s.grade from emp e
    left outer join dept d on (e.deptno = d.deptno)
    left outer join salgrade s on (E.sal >= s.losal and e.sal <= s.hisal);
    
 select * from emp;
 select * from dept;
 select * from salgrade;
 
-- quiz 3 
-- ��纸�� ������ ���� ����� �̸�, �޿�, ��� �̸�, ��� �޿�
select e1.ename, e1.sal, d.dname , e2.ename, e2.sal from emp e1, emp e2, dept d
    where (e1.mgr = e2.empno) and (e1.sal > e2.sal) and (e1.deptno = d.deptno);
    
-- ����1
select e.deptno, d.dname, e.empno, e.ename, e.sal from emp e, dept d 
    where (e.sal > 2000) and (e.deptno = d.deptno) order by deptno;
    
-- ����2
select e.deptno, d.dname, floor(avg(e.sal)), max(e.sal), min(e.sal), count(*) 
    from emp e, dept d where (e.deptno = d. deptno) group by e.deptno, d.dname;
    
select e.deptno, d.dname, floor(avg(e.sal)), max(e.sal), min(e.sal), count(*)
    from emp e left outer join dept d on (e.deptno = d.deptno) group by e.deptno, d.dname;
      
-- ����3
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal from emp e, dept d
    where e.deptno = d.deptno order by deptno;

select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal from emp e
    right outer join dept d on (e.deptno = d.deptno); -- ������ �ܺ�����
    
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal from dept d
    left outer join emp e on (e.deptno = d.deptno) order by d.deptno; -- ���� �ܺ�����
    
-- ����4
select d.deptno, d.dname, e1.empno, e1.ename, e1.mgr, e1.sal, 
    e2.deptno, s.losal, s.hisal, s.grade, e2.empno, e2.ename 
        from emp e1, emp e2, dept d, salgrade s 
            where (e1.mgr = e2.empno) and (e1.deptno = d.deptno) 
                and (e1.sal >= s.losal and e1.sal <= s.hisal) order by d.deptno;
                
select d.deptno, d.dname, e1.empno, e1.ename, e1.mgr, e1.sal, 
    e2.deptno, s.losal, s.hisal, s.grade, e2.empno, e2.ename from dept d
        left outer join emp e1 on (e1.deptno = d.deptno) 
        left outer join emp e2 on (e1.mgr = e2.empno)
        left outer join salgrade s on (e1.sal >= s.losal and e1.sal <= s.hisal) 
            order by d.deptno, e1.empno;
    
    
-- ��������
select sal from emp where ename = 'JONES';    
select * from emp where sal > 2975;
select * from emp where sal > (select sal from emp where ename = 'JONES');

-- ������ ��������
select avg(sal) from emp;
select * from emp where sal > (select avg(sal) from emp);

select sal from emp where ename='BLAKE';
select * from emp where sal > (select sal from emp where ename='BLAKE');

select job from emp where ename='JONES';
select * from emp where job = (select job from emp where ename='JONES');

-- ������ ��������
select max(sal) from emp group by deptno;
select * from emp where sal in (select max(sal) from emp group by deptno);

select max(sal) from emp where deptno = 30;
select * from emp where sal > (select max(sal) from emp where deptno = 30) order by deptno desc;

-- from�� ���� ���� ������ �ᵵ ���X
select * from emp where deptno = 10;
select * from (select * from emp where deptno = 10);

select rownum, emp.* from emp; -- �ٹ�ȣ ���   
-- where rownum = 1; rownum�� where���� ���� ���Ѵ�
-- order by ename; ���� �������� ����Ǳ� ������ rownum �� ���׹��� ��

select * from emp order by ename;
select rownum, e.* from (select * from emp order by ename) e;

select job, count(*) from emp group by job having count(*) >= 3 ;
select * from (select job, count(*) cnt from emp group by job)
    where cnt >= 3 ; -- count(*)��� �÷����� �ƴ϶� ����� �����ϱ� ������ ��Ī�� �ٿ��� ��        

-- select ���� e10�̶�� ��Ī���� ������ �� (���ѷ��� ���� ex.���� ����� ���)
-- select���ٰ� �ۼ��� ��� ����� �Ѱ��� ��µǴ� �ɷ� �ۼ��ؾ���
with e10 as (select * from emp where deptno = 10) select ename from e10;

-- ����1
select job from emp where ename = 'ALLEN';
/* select job, empno, ename, sal, d.deptno, d.dname from emp, dept d 
    where job = (select job from emp where ename = 'ALLEN') group by d.dname; */
    
select job, empno, ename, sal, d.deptno, d.dname from emp
    left outer join dept d on (emp.deptno = d.deptno)
        where job = (select job from emp where ename = 'ALLEN');

-- deptno�� emp�� dept�� �� �ֱ� ������ ��ĪX
select job, empno, ename, sal, deptno, d.dname from emp 
    join dept d using (deptno) where job = (select job from emp where ename = 'ALLEN');    
        
-- ����2
select floor(avg(sal)) from emp;
select e.empno, e.ename, d.dname, e.hiredate, d.loc, e.sal, s.grade
    from emp e left outer join dept d on (e.deptno = d.deptno)
        left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
         where e.sal > (select floor(avg(sal)) from emp) order by e.sal desc;
         
-- ����3
-- 30�� �μ��� �����ϴ� ����� 10�� �μ��� �����ϴ� ����� 
-- not in -> in�� �ݴ�� ���� �༮
select job from emp where deptno = 10;
select e.empno, e.ename, e.job, d.deptno, d.dname, d.loc from emp e
    left outer join dept d on (e.deptno = d.deptno)
        where job not in(select job from emp where deptno = 30) and d.deptno = 10;        
        
-- ����4
select max(sal) from emp where job ='SALESMAN';
select e.empno, e.ename, e.sal, s.grade from emp e 
    left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
        where sal > (select max(sal) from emp where job ='SALESMAN') order by empno;


-- 12�� (������ ���Ǿ� DDL) -> ������ �����ϴ� �� create, drop, alter
create table emp_ddl(
    empno number(4), -- ���� ���ڸ� 
    ename varchar2(10), -- 10����Ʈ (�۾��� 3����)
    job varchar2(9), -- ���Ѻ��� ���� �۾��� ������ �۾� ��ŭ�� ������ ����
    mgr number(4), -- empno�� ���;��ϴϱ� ���� Ÿ���̵��;���
    hiredate date,
    sal number(7, 2), -- 2�� �Ҽ� ��°�ڸ������� ��� ����
    comm number(7, 2),
    deptno number(2)
);

create table dept_ddl as select * from dept; -- dept table�� ���翡�� dept_ddl table�� ����
select * from dept_ddl;

create table emp_ddl_30 as 
    select empno, ename, sal, deptno from emp where deptno = 30; 
select * from emp_ddl_30;

create table emp_alter as select * from emp;
select * from emp_alter;

alter table emp_alter add hp varchar2(20); -- �÷��߰�

alter table emp_alter rename column hp to tel; -- �÷����� �ٲ�

alter table emp_alter modify empno number(5); -- Ÿ���� �ٲ�
desc emp_alter;

-- alter table emp_alter modify empno number(4); 
-- ũ�Ⱑ Ŀ���� ���� �����ϳ� �پ��� ���� �Ұ���

-- ����Ŭ�� ����� �ǵ����°� ���� ��, drop�� �����ϰ� �ؾ��� 
-- ����� �ٽ� �߰��ص� �÷� ������ null ���ο� �� 
alter table emp_alter drop column tel;
select * from emp_alter;

alter table emp_alter drop column hiredate;
select * from emp_alter;

rename emp_alter to emp_rename;
select * from emp_rename;

-- ������� ����ִµ� ���빰�� ������, �ٽ� �ǵ������� ����, �����ؾ���
truncate table emp_rename; 

-- ��������� ������, �׳� table�� ����, �ٽ� �ǵ������� ����, �����ؾ���
drop table emp_rename;


-- 10�� (������ ���Ǿ� DML) -> ������ ������ �����ϴ� �� select, update, insert, delete
create table dept_demp as select * from dept;

select * from dept_demp;
drop table dept_demp; -- ���̺�� ��Ÿ��..

create table dept_temp as select * from dept;
select * from dept_temp;

insert into dept_temp (deptno, dname, loc)
    values (50, 'DATABASE', 'SEOUL'); -- ������ ���� �߰� (�÷����� ���缭 �ۼ�)
    
insert into dept_temp -- table �� �ڿ� ()�� �����ϸ� ��� �÷�
    values (60, 'network', 'Busan'); -- ��ҹ��� ���� ����
    
-- null �ڸ��� ''���� ��������� java���� null�� �Ǵ��� �ȵ�   
-- null �ڸ��� null�̶�� ���� ����
insert into dept_temp
    values (70, 'web', null);
    
select * from dept_temp;

insert into dept_temp(deptno, loc)
    values (90, '��õ'); -- �÷��� �����ϸ� �ڵ����� null�� ��
    
    
create table emp_temp as select * from emp;
select * from emp_temp;    

insert into emp_temp (empno, ename, hiredate)
    values (9999, 'ȫ�浿', '2001/01/02');

insert into emp_temp (empno, ename, hiredate)
    values (1111, '������', '2001/01/05'); -- 2001-01-05 -> 01/02/030
    
insert into emp_temp (empno, ename, hiredate)
    values (1111, '�̼���', to_date('2002-03-04', 'yyyy-mm-dd'));    

insert into emp_temp (empno, ename, hiredate)
    values (3111, '��û��', sysdate); -- sysdate�� �׳� �۾��� ���̴�, ���� X

insert into emp_temp    
select * from emp where deptno = 10; -- deptno 10��(3��)�� emp_temp �� �߰�
select * from emp_temp order by deptno desc;    

create table dept_temp2 as select * from dept; 
select * from dept_temp2;

update dept_temp2 set loc = 'seoul';

rollback; -- update ������ Ʋ�ȴٸ�, ddl ������ �ٽ� ���� ����

update dept_temp2 set loc = 'SEOUL', dname = 'DataBase'
    where deptno = 40; -- ���߿�
    
-- update�ϱ� �� ����!!!
-- �� select ���� where ������ ��Ȯ���� Ȯ���ϰ� update�ϱ�!
select * from dept_temp2 where deptno = 40;

create table emp_temp2 as select * from emp;
select * from emp_temp2;

select * from emp_temp2 where job = 'MANAGER';  
delete emp_temp2 where job = 'MANAGER';    

-- ����1
-- �޿��� 1000 ������ ����� �޿��� 3% �λ��ض�
select * from emp_temp2 where sal <= 1000;
-- select ename, sal, sal*1.03 from emp_temp2 where sal <= 1000;
update emp_temp2 set sal = sal + (sal * 0.03)
    where sal <= 1000;
-- update emp_temp2 set sal = sal*1.03 where sal <= 1000;    
select * from emp_temp2;    
select * from emp_temp2;    

delete emp_temp2;
select * from emp_temp2; -- DDL truncate�� �����

rollback; -- update�ϰ� commit�� ���߱� ������ ���� create�� ���ư� -> 3% �ݿ� �ȵ�����

-- DDL (���Ǿ�, table ���� ��ü�� ����) create ����� alter �����ϱ� drop �����
-- commit�� �ڵ����� �ȴ�

-- DML (���۾�) 
-- select, insert �ڷ��߰�(����), update �ڷ����, delete �ڷ���� ��, update�� delete�� where ����
-- DML�� ������ commit�� �������

-- rollback, commit, Ʈ�����, ����, Lock


-- ���� 1.
select rpad(substr(empno, 1,2), length(empno), '*') as empno, ename from emp order by empno desc;

-- ���� 2.
select e.empno, e.ename, d.dname, d.loc from emp e
    left outer join dept d on (e.deptno = d.deptno) order by d.dname desc;
    
    
-- 13��
-- ���� > ����Ŭ > �ؿ� �ִ� ����
select * from dict;    
select * from user_tables;    


-- index ���� (�����ͺ��̽��� �ӵ��� idx�� ������� ����)
-- ��������, �������� ���� ����
create index idx_emp_sal on emp(sal);
select * from user_indexes;

drop index idx_emp_sal; -- �ڵ�Ŀ��

create index idx_emp_sal on emp(sal);

-- ���� hint 
select /*+ index(idx_emp_sal) */ * from emp e order by sal;

-- plan
-- sql developer������ ��� ����° ������ '��ȹ����'
-- option�� full ���� ��ü�� �а� �����͸� �̾Ҵ�
-- cost ����� 2��ŭ ���� (�ð��� ���)

select max(empno), max(empno)+1 from emp;
insert into emp_temp2 (empno, ename) 
    values ((select max(empno)+1 from emp_temp2), '������2');
    
delete from emp_temp2 where empno = '7935' and ename = '������2';    
select * from emp_temp2;    


-- sequence
create table tb_user(user_id number, user_name varchar2(30));
select * from tb_user;

create sequence seq_user;

select seq_user.nextval from dual; -- ������ ����
select seq_user.currval from dual; -- ���ݲ� ����

insert into tb_user (user_id, user_name) values (seq_user.nextval, '������1');
insert into tb_user (user_id, user_name) values (seq_user.nextval, '������2');
insert into tb_user (user_id, user_name) values (seq_user.nextval, '������3');
select * from tb_user;



--6�� 28�� 
--index �˻� �Ǵ� ��ȸ�� ������ �ϱ� ���� 
--where������ �� ���� order by�� ������ �� ���� ����
--349p
--10000���� �����ؼ� 100�� ����
create sequence seq_test 
    start with 10000  --���ۼ��� 10000(�⺻��: 1)
        increment by 100; --�������� 100(�⺻��: 1)

--nextval�� �ѹ��� ������� ���� ��� 
--currval ������
select seq_test.currval from dual; -- ����
select seq_test.nextval from dual; -- ����

--377p 
--primary key, PK, �ֿ�Ű, �߿�Ű, �⺻Ű
--not null + unique ���� (null�� �ƴϸ鼭 �����ؾ� ��)
--������ ���ÿ� index�� �������� 
--create table������ primary key�� �� �ϳ��� ��������
--�� �� �̻��� �÷��� primary key�� �����Ϸ��� alter ���  
create table table_pk(
    login_id varchar2(20) primary key,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
    );
    
desc table_pk;

select * from user_constraints --����Ŭ�� �������ִ� �������̺� �������� ���� ����
where table_name = 'TABLE_PK';
--pk�� index�� �ڵ����� ��������
select * from user_indexes;

--�Ʒ�ó�� �ϸ� ������ ���� (������ �����صױ� ������)
insert into table_pk (login_id,login_pwd, tel)
values(null, null, null);
insert into table_pk (login_id,login_pwd, tel)
values('id', 'pw', null); 
insert into table_pk (login_pwd, tel)
values('pw', null); 

--381p
create table table_pk3(
    login_id varchar2(20),
    login_pwd varchar2(20),
    tel varchar2(20),
    
    primary key(login_id, login_pwd)
    );
insert into table_pk3 values ('id1','pw1', null);
insert into table_pk3 values ('id1','pw2', null);
select * from table_pk3;
--�÷� 2���ε� �ϳ��� ������������ ���� , �ε��� as well 

--384p foreign key 
create table  dept_fk(
    deptno1 number primary key,
    dname varchar2(14)
    );
--foreign key, FK, �ܷ�Ű, ����Ű 
--����� �Ǵ� ���̺��� �÷��� ���� Ÿ������ �����ؾ� �Ѵ� 
--deptno1�� number�� �ص����� �Ʒ� emp������ deptno�� number�� ��������� �� 
--�÷����� ���� �޶� ���� ����(���� ���� �Ѵ�)
--����� �Ǵ� �÷��� pk���� �Ѵ�
create table emp_fk1 (
    empno number primary key,
    ename varchar2(10),
    deptno number references dept_fk(deptno1)
    --���� �÷� ���� ���ٸ� �÷��� ��������
    --deptno number references dept_fk
    );
--�Ʒ��� foreign key �� �����Ἥ �ϴ�     
create table emp_fk2 (
    empno number primary key,
    ename varchar2(10),
    deptno number,
    
    foreign key(deptno) references dept_fk(deptno1)
    );
select * from emp    
--emp�� �ڷḦ �����ϸ� > ������ �� ���� 
--��? dept ���̺��� ���� ä����� ����
insert into dept_fk values(100,'1���ǽ�');

insert into emp_fk values(1, '�̸�', 101); --���ʿ� �����ϱ� ����
insert into emp_fk values(1, '�̸�', 100);

update emp_fk set deptno = 101; --���� 
--emp_fk���� 100�� �����ϰ� �־ ����, ���� �Ұ�
update dept_fk set deptno1 = 101; 
--�̰͵� ������ emp_fk���� 100�� �����ϰ� �־ ����, ���� �Ұ�
delete dept_fk;

delete emp_fk; --�̷��� �����ϰ� update �غ��� 
update dept_fk set deptno1 = 101;
--������� emp ���̺���� �������� 

--392p default
create table table_default(
    login_id varchar2(20),
    login_pwd varchar2(20),
    tel varchar2(20) default'000-0000'
    );
insert into table_default values ('id','pw','010-1233-4567');
insert into table_default (login_id, login_pwd) values ('id2','pw2');
select * from table_default;






    
    

