-- �ּ�
/*
    �ּ�
    �л� ���̺��� ����� ����.
    ==> �й�, �̸�, �а�, ����ó, �ּ�, ���п���, �����(������) ���
    
    ���̺��� ����� ����
    ����)
        create table ���̺� �̸�(
            �й� �ڷ���(ũ��) [��������],
            �̸� �ڷ���(ũ��) [��������],
            �а� �ڷ���(ũ��) [��������],
            ����ó �ڷ���(ũ��) [��������],
            �ּ� �ڷ���(ũ��) [��������],
            ���п��� �ڷ���(ũ��) [��������],
            ����� �ڷ���(ũ��) [��������],
*/

/*
create table student(
    student_id varchar2(10) primary key,
    student_name varchar2(30) not null,
    student_major varchar2(40),
    student_phone varchar2(20) not null,
    student_addr varchar2(200),
    student_status varchar2(1) check(student_status in ('y', 'n')),
    student_regdate date not null
);
*/

-- insert into ���̺��̸� not null ���� ���� �÷����� ����?
-- values()
-- ************** dbĿ���ؾ� ����� **************
-- commit


/*
insert into student(student_id, student_name, student_phone, student_regdate)
            values('2024_002', '�������', '010-2222-3333', sysdate);
*/

-- �й�, �̸�, �а�, ����ó, �ּ�, ���п���, �����(������)  sysdate�� �ý��� date�� �ڵ� ��ŷ
-- insert into student values('2024_001', 'ȫ�浿', '�����а�', '010-3777-5555', '����� ���α�', 'y', sysdate);

-- insert into student values('2024_003', 'ȫ�浿2', '�����а�', '010-2222-3277', '����� ���α�','y', sysdate);
-- insert into student values('2024_004', 'ȫ�浿3', '�����а�', '010-2222-3277', '����� ���α�','y', sysdate);
-- insert into student values('2024_005', 'ȫ�浿4', '�����а�', '010-2222-3277', '����� ���α�','y', sysdate);
/*
SELECT * FROM student WHERE student_id IN('2024_004', '2024_005');
COMMIT;
*/

-- ���� ���̺� �÷��� �߰��ؾ� �ϴ� ���
-- alter table ���̺� �̸� add(�߰��� �÷��� �ڷ���(ũ��) [��������]);
-- ALTER TABLE student ADD(student_age NUMBER);

-- ���̺��� �÷��� �����ؾ� �ϴ� ���(�÷��� ��ü���� ���� ����)
-- ���� alter table ���̺��̸� modify(�÷��� �ڷ���(ũ��));
-- alter table student modify(student_age VARCHAR2(3));

-- ���̺��� �÷����� �����ϴ� ���
-- alter table ���̺�� rename column �����÷��� to �����̸�;
-- alter table student rename column student_age to student_ages;

-- �÷� ����
-- ALTER TABLE student DROP COLUMN student_ages;

/*
    1. DDL (Data Define Langage : ������ ���� ���) ==> ���̺� ���� ��ɾ�
    - CREATE : �����ͺ��̽� �Ǵ� ���̺��� �����ϴ� ��ɾ�.
    - ALRTER : ���̺��� �����ϴ� ��ɾ�.
    - DROP : �����ͺ��̽� �Ǵ� ���̺��� �����ϴ� ��ɾ�.
    - TRUNCATE : ���̺��� �ʱ�ȭ�ϴ� ��ɾ�
    
    2. DML (Data Manipulation Language : ������ ���� ���)
    ==> �����ͺ��̽����� ���� ���� ����ϴ� ��ɾ�
    - SELECT : �����͸� �˻��ϴ� ��ɾ�
    - INSERT : �����͸� �߰��ϴ� ��ɾ�
    - UPDATE : �����͸� �����ϴ� ��ɾ�
    - DELETE : �����͸� �����ϴ� ��ɾ�
    
    3. DCL(Data Control Language : ������ ���� ���)
    - GRANT : Ư�� �����ͺ��̽� ����ڿ��� �۾��� Ư�� ���� ������ �ο��ϴ� ��ɾ�.
    - REVOKE : Ư�� �����ͺ��̽� ����ڿ��� �۾��� Ư�� ���� ������ �����ϴ� ��ɾ�.
    - COMMIT : Ʈ����� �۾��� �Ϸ��ϴ� ��ɾ�.
    - ROLLBACK : Ʈ����� �۾��� ����ϰų�, ���� ���·� �����ϴ� ������ �ϴ� ��ɾ�.
    
*/

-- �����͸� �����ϴ� ���
-- ����) update ���̺� �̸� set ������ �÷��� = ��, ������ �÷��� = ��
--                  where �⺻Ű�÷��� = ��

-- update student set student_addr = '���α� ��â��', STUDENT_STATUS = 'n', STUDENT_MAJOR = '��ǻ�� ���к�', STUDENT_REGDATE = sysdate
-- where student_id = '2024_002';

-- SELECT empno, ename, job , deptno FROM emp;

-- [����2] emp ���̺��� �̸�, �Ի��� , �޿��� ȭ�鿡 �����ּ���
-- select ename, hiredate, sal from emp;
-- [����3] emp ���̺��� ���, �̸�, ������, ���ʽ��� ȭ�鿡 �����ּ���.
-- select empno, ename, job, comm from emp;
-- [����4] emp ���̺��� ���, �̸�, �޿�, ���ʽ�, �޿� + ���ʽ� ����� ȭ�鿡 �����ּ���.
-- nvl() �Լ� null���� Ư���� ������ ��ȯ���� �ִ� �Լ�
-- nvl(null���ִ� col, ��ȯ��)
-- select empno, ename, job, nvl(comm+sal,sal) from emp;

-- nvl2()�Լ� : 3�� �����ڿ� ��� (comm, comm, 0)�̸� comm������ comm �ְ� null�̸� 0 �־��
-- select empno, ename, job, nvl2(comm, comm, 0)+sal as "comm+sal" from emp;

-- [����] emp ���̺��� ���, �̸�, �޿�, �޿��� 10% �λ���� ȭ�鿡 �����ּ���
-- select empno, ename, sal, round(sal*1.1) as "�λ��" from emp;

-- emp ���̺��� �� ����� �������� ȭ�鿡 �����ּ���.
-- distinct ==> �ߺ��� �������ִ� Ű����
-- select distinct job from emp;

-- emp ���̺��� �� ����� �����ڸ� �ߺ��� ���� �ʰ� ȭ�鿡 ���
-- select distinct mgr from emp;

-- [����] emp ���̺��� �������� ������, �μ���ȣ�� ȭ�鿡 �����ּ���.
-- select distinct job, mgr, deptno from emp;
