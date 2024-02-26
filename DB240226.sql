-- 주석
/*
    주석
    학생 테이블을 만들어 보자.
    ==> 학번, 이름, 학과, 연락처, 주소, 재학여부, 등록일(입학일) 등등
    
    테이블을 만드는 형식
    형식)
        create table 테이블 이름(
            학번 자료형(크기) [제약조건],
            이름 자료형(크기) [제약조건],
            학과 자료형(크기) [제약조건],
            연락처 자료형(크기) [제약조건],
            주소 자료형(크기) [제약조건],
            재학여부 자료형(크기) [제약조건],
            등록일 자료형(크기) [제약조건],
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

-- insert into 테이블이름 not null 제약 조건 컬럼명을 기재?
-- values()
-- ************** db커밋해야 저장됨 **************
-- commit


/*
insert into student(student_id, student_name, student_phone, student_regdate)
            values('2024_002', '세종대왕', '010-2222-3333', sysdate);
*/

-- 학번, 이름, 학과, 연락처, 주소, 재학여부, 등록일(입학일)  sysdate는 시스템 date가 자동 마킹
-- insert into student values('2024_001', '홍길동', '경제학과', '010-3777-5555', '서울시 구로구', 'y', sysdate);

-- insert into student values('2024_003', '홍길동2', '경제학과', '010-2222-3277', '서울시 구로구','y', sysdate);
-- insert into student values('2024_004', '홍길동3', '경제학과', '010-2222-3277', '서울시 구로구','y', sysdate);
-- insert into student values('2024_005', '홍길동4', '경제학과', '010-2222-3277', '서울시 구로구','y', sysdate);
/*
SELECT * FROM student WHERE student_id IN('2024_004', '2024_005');
COMMIT;
*/

-- 만약 테이블에 컬럼을 추가해야 하는 경우
-- alter table 테이블 이름 add(추가할 컬럼명 자료형(크기) [제약조건]);
-- ALTER TABLE student ADD(student_age NUMBER);

-- 테이블의 컬럼을 수정해야 하는 경우(컬럼의 전체적인 내용 수정)
-- 형식 alter table 테이블이름 modify(컬럼명 자료형(크기));
-- alter table student modify(student_age VARCHAR2(3));

-- 테이블의 컬럼명을 변경하는 방법
-- alter table 테이블명 rename column 기존컬럼명 to 변경이름;
-- alter table student rename column student_age to student_ages;

-- 컬럼 삭제
-- ALTER TABLE student DROP COLUMN student_ages;

/*
    1. DDL (Data Define Langage : 데이터 정의 언어) ==> 테이블 관련 명령어
    - CREATE : 데이터베이스 또는 테이블을 생성하는 명령어.
    - ALRTER : 테이블을 수정하는 명령어.
    - DROP : 데이터베이스 또는 테이블을 삭제하는 명령어.
    - TRUNCATE : 테이블을 초기화하는 명령어
    
    2. DML (Data Manipulation Language : 데이터 조작 언어)
    ==> 데이터베이스에서 가장 많이 사용하는 명령어
    - SELECT : 데이터를 검색하는 명령어
    - INSERT : 데이터를 추가하는 명령어
    - UPDATE : 데이터를 수정하는 명령어
    - DELETE : 데이터를 삭제하는 명령어
    
    3. DCL(Data Control Language : 데이터 제어 언어)
    - GRANT : 특정 데이터베이스 사용자에게 작업의 특정 수행 권한을 부여하는 명령어.
    - REVOKE : 특정 데이터베이스 사용자에게 작업의 특정 수행 권한을 삭제하는 명령어.
    - COMMIT : 트랜잭션 작업을 완료하는 명령어.
    - ROLLBACK : 트랜잭션 작업을 취소하거나, 이전 상태로 복구하는 역할을 하는 명령어.
    
*/

-- 데이터를 수정하는 방법
-- 형식) update 테이블 이름 set 수정할 컬럼명 = 값, 수정할 컬럼명 = 값
--                  where 기본키컬럼명 = 값

-- update student set student_addr = '종로구 평창동', STUDENT_STATUS = 'n', STUDENT_MAJOR = '컴퓨터 공학부', STUDENT_REGDATE = sysdate
-- where student_id = '2024_002';

-- SELECT empno, ename, job , deptno FROM emp;

-- [문제2] emp 테이블에서 이름, 입사일 , 급여를 화면에 보여주세요
-- select ename, hiredate, sal from emp;
-- [문제3] emp 테이블에서 사번, 이름, 담당업무, 보너스를 화면에 보여주세요.
-- select empno, ename, job, comm from emp;
-- [문제4] emp 테이블에서 사번, 이름, 급여, 보너스, 급여 + 보너스 결과를 화면에 보여주세요.
-- nvl() 함수 null값을 특정한 값으로 변환시켜 주는 함수
-- nvl(null이있는 col, 변환값)
-- select empno, ename, job, nvl(comm+sal,sal) from emp;

-- nvl2()함수 : 3항 연산자와 비슷 (comm, comm, 0)이면 comm있으면 comm 넣고 null이면 0 넣어라
-- select empno, ename, job, nvl2(comm, comm, 0)+sal as "comm+sal" from emp;

-- [문제] emp 테이블에서 사번, 이름, 급여, 급여의 10% 인상액을 화면에 보여주세요
-- select empno, ename, sal, round(sal*1.1) as "인상액" from emp;

-- emp 테이블에서 각 사원의 담당업무를 화면에 보여주세요.
-- distinct ==> 중복을 제거해주는 키워드
-- select distinct job from emp;

-- emp 테이블에서 각 사원의 관리자를 중복이 되지 않게 화면에 출력
-- select distinct mgr from emp;

-- [문제] emp 테이블에서 담당업무와 관리자, 부서번호를 화면에 보여주세요.
-- select distinct job, mgr, deptno from emp;
