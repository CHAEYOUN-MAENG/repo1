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

select * from emp where sal between 2000 and 3000; -- sql ����




