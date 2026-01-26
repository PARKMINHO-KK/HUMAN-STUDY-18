
SELECT * FROM emp;

SELECT * FROM emp WHERE deptno = 10;--3명
SELECT * FROM emp WHERE deptno = 20;--5명

UNION
SELECT * FROM EMP WHERE deptno = 20;

SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10
UNION 
SELECT sal, job, deptno, sal
FROM EMP
WHERE deptno = 20;

SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10
UNION 
SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10;

SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10
UNION ALL 
SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10;

SELECT * --q1
FROM EMP
WHERE ename LIKE '%S' ;

SELECT empno, ename, job, sal, deptno --Q2
FROM emp
WHERE job LIKE 'SALESMAN' ;

SELECT empno, ename, job, sal, deptno --Q3-1
FROM EMP
WHERE DEPTNO = 20 AND SAL > 2000
UNION 
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE DEPTNO = 30 AND SAL > 2000 ;

SELECT empno, ename, job, sal, deptno --Q3-2
FROM EMP
WHERE DEPTNO = 20 AND SAL > 2000
UNION ALL
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE DEPTNO = 30 AND SAL > 2000 ;

SELECT * --Q4
FROM EMP
WHERE SAL < 2000 OR SAL > 3000 ;

SELECT ENAME, EMPNO, SAL, DEPTNO --Q5
FROM EMP
WHERE ENAME LIKE '%E%' AND DEPTNO = 30 AND SAL NOT BETWEEN 1000 AND 2000 ;

SELECT * --Q6
FROM EMP
WHERE COMM IS NULL AND MGR IS NOT NULL
AND (JOB = 'MANAGER' OR JOB = 'CLERK')
AND ENAME NOT LIKE '_L%' ;

SELECT ename, upper(ename), lower(ename), initcap(ename) --실습6-1
FROM EMP ;

SELECT 1 from dual ; 
SELECT upper('abc'), upper(lower('abc')) FROM dual ;

SELECT *
FROM emp
WHERE lower(ename) LIKE lower('%am%') ;

SELECT ename, LENGTH(ename) --실습6-4
FROM emp ;

SELECT *
FROM EMP
WHERE length(ename) = 5 ;

SELECT empno, ename, sal, deptno --gpt q1
FROM EMP ;

SELECT * --gpt q2
FROM EMP
WHERE deptno = 10 ;

SELECT ename, sal --gpt q3
FROM EMP
WHERE sal >= 3000 ;

SELECT * --gpt q4
FROM EMP
WHERE ename LIKE 'A%' ;

SELECT empno, ename, job --gpt q5
FROM EMP
WHERE ename LIKE '%L%' ;

SELECT * --gpt q6
FROM emp
WHERE ename LIKE '_A%' ;

SELECT * --gpt q7
FROM EMP
WHERE comm IS null ;

SELECT * --gpt q8
FROM EMP
WHERE mgr IS NOT NULL 
AND comm IS NULL ;

SELECT * --GPT Q9
FROM  EMP
WHERE JOB IN ('MANAGER', 'CLERK')
AND SAL >= 2000 ;

SELECT * --GPT Q10
FROM EMP
WHERE DEPTNO = 10 
UNION
SELECT *
FROM EMP
WHERE DEPTNO = 30 ;

SELECT LENGTH('a'), LENGTH('한'), LENGTHb('a'), LENGTHb('한') FROM dual ; --12/16 수업

SELECT job, --실습 6-7
	SUBSTR(job, 1, 2), 
	SUBSTR(job, 3, 2), 
	SUBSTR(job, 5)
FROM emp ;

SELECT  
	SUBSTR(ename, 2, 3) --마지막 숫자가 커도 끝가지만 출력
FROM emp ;

SELECT  
	SUBSTR(ename, 20, 3) --실제 길이보다 시작이 크면 null
FROM emp ;

SELECT ename,
	SUBSTR(ename, -3, 2) --시작위치 음수는 뒤에서부터 센다
FROM emp ;

SELECT --실습 6-12
	'a-b-c',
	REPLACE('a-b-c', '-', ' '),
	REPLACE('a-b-c', '-', ';'),
	REPLACE('a-b-c', '-'),
	REPLACE('a-b-c', '-', '')
FROM dual ;

--사원이름에 A를 모두 소문자 a 로 교체

SELECT ename,
	REPLACE(ename, 'A', 'a')
FROM emp ;

SELECT ename, --실습 6-13
	lpad(ename, 10, '#') , lpad(ename, 5, '#')
FROM emp ;

SELECT ename, --모자르면 채우고, 넘어가면 짤림
	lpad(ename, 5, '#') 
FROM emp ;

--강사퀴즈1
-- 문제1
--    ename에서 앞에 두 글자만 출력
--    substr, lpad, replace
-- 문제2
--    ename의 앞 두글자만 원본을 출력하고
--    나머지는 4개의 *로 표시
-- 문제3
--    ename의 앞 두글자만 원본을 출력하고
--    나머지는로 출력
--     단, 전체 길이는 원래 이름의 길이만큼
--    WARD >> WA, SMITH >> SM*

SELECT ename, --문제1
	substr(ename, 1, 2), 
	rpad(ename, 2),
	replace(ename, SUBSTR(ename, 3), '') --원본에서 3번째부터 끝까지 없애자
FROM emp ;

SELECT ename, --문제2
	rpad(substr(ename, 1, 2), 6, '*')
FROM emp ;

SELECT ename, --문제3
	rpad(substr(ename, 1, 2), LENGTH(ename), '*')
FROM emp ; 

SELECT 'ab'|| 'cd' FROM dual ;
SELECT empno || ':' || ename FROM emp ;


SELECT ename, --문제4 앞 두글자만 *처리(마스킹처리)
	'**' || SUBSTR(ename, 3)
FROM emp ;

SELECT ename,
	lpad(SUBSTR(ename, 3), length(ename), '*')
FROM emp ;

SELECT --trim 앞뒤 공백만 없애줌
	'[' || '   _ _oracle_ _   '||']',
	'[' || trim('   _ _oracle_ _   ')||']'
FROM dual ;

SELECT 
	ROUND(14.46),
	ROUND(14.46, 1), -- 14.5
	ROUND(14.46, -1) -- 10
FROM emp ;

SELECT 
	TRUNC(14.46),
	TRUNC(14.46, 0),
	TRUNC(14.46, 1),
	TRUNC(14.46, -1),
	TRUNC(-14.46)
FROM emp ;

SELECT 
	ceil(3.14),
	floor(3.14),
	ceil(-3.14),
	floor(-3.14),
	TRUNC(-3.14)
FROM emp ;

SELECT 
	mod(15, 6), mod(15, 0)
FROM dual ;

SELECT 15/6, 15/0 FROM dual ;

SELECT 
	mod(6, 3), 
	mod(7, 3),
	mod(8, 3),
	mod(9, 3)
from dual ;

SELECT sysdate FROM dual ;

SELECT --실습 6-33
	TO_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') AS 현재날짜시간
FROM dual ;

SELECT 
	TO_char(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"')
FROM dual ;

SELECT * FROM emp
WHERE HIREDATE > to_date('1981/06/01', 'yyyy/mm/dd') ;

SELECT 
	sal, 
	comm, 
	nvl(comm, 0),
	sal+nvl(comm, 0),
	sal+comm,
	nvl(to_char(comm), 'N/A')
FROM emp ;

SELECT empno, ename, job, sal,
	decode(job,
			'MANAGER', SAL*1.1, --잡이 정확히 매니저라면
			'SALESMAN', SAL*1.05,
			'ANALYST', SAL,
			SAL*1.03) AS UPSAL --위 조건에 없다면
FROM EMP ;

SELECT empno, ename, job, sal,
	CASE JOB
		WHEN 'MANAGER' THEN SAL*1.1
		WHEN 'SALESMAN' THEN SAL*1.05
		WHEN 'ANALYST' THEN SAL
		ELSE SAL*1.03
	END AS UPSAL
	FROM EMP ;

SELECT EMPNO, ENAME, COMM, --실습 6-49
	CASE 
		WHEN COMM IS NULL THEN '해당 사항 없음'
		WHEN COMM = 0 THEN '수당 없음'
		WHEN COMM > 0 THEN '수당 : ' || COMM
	END AS COMM_TEXT
FROM EMP ;

--되새김 문제

SELECT EMPNO, --Q1
	SUBSTR(EMPNO, 1, 2) || '**' AS MASKING_EMPNO,
	ENAME,
	SUBSTR(ENAME, 1, 1) || '****' AS MASKING_ENAME 
FROM EMP
WHERE LENGTH(ENAME) = 5 ;

SELECT EMPNO, ENAME, SAL, --Q2
	TRUNC(SAL/21.5, 2) AS DAY_PAY,
	ROUND(SAL/21.5/8, 1) AS TIME_PAY
FROM EMP ;
=======
SELECT * FROM emp;

SELECT * FROM emp WHERE deptno = 10;--3명
SELECT * FROM emp WHERE deptno = 20;--5명

UNION
SELECT * FROM EMP WHERE deptno = 20;

SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10
UNION 
SELECT sal, job, deptno, sal
FROM EMP
WHERE deptno = 20;

SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10
UNION 
SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10;

SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10
UNION ALL 
SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10;

SELECT * --q1
FROM EMP
WHERE ename LIKE '%S' ;

SELECT empno, ename, job, sal, deptno --Q2
FROM emp
WHERE job LIKE 'SALESMAN' ;

SELECT empno, ename, job, sal, deptno --Q3-1
FROM EMP
WHERE DEPTNO = 20 AND SAL > 2000
UNION 
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE DEPTNO = 30 AND SAL > 2000 ;

SELECT empno, ename, job, sal, deptno --Q3-2
FROM EMP
WHERE DEPTNO = 20 AND SAL > 2000
UNION ALL
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE DEPTNO = 30 AND SAL > 2000 ;

SELECT * --Q4
FROM EMP
WHERE SAL < 2000 OR SAL > 3000 ;

SELECT ENAME, EMPNO, SAL, DEPTNO --Q5
FROM EMP
WHERE ENAME LIKE '%E%' AND DEPTNO = 30 AND SAL NOT BETWEEN 1000 AND 2000 ;

SELECT * --Q6
FROM EMP
WHERE COMM IS NULL AND MGR IS NOT NULL
AND (JOB = 'MANAGER' OR JOB = 'CLERK')
AND ENAME NOT LIKE '_L%' ;

SELECT ename, upper(ename), lower(ename), initcap(ename) --실습6-1
FROM EMP ;

SELECT 1 from dual ; 
SELECT upper('abc'), upper(lower('abc')) FROM dual ;

SELECT *
FROM emp
WHERE lower(ename) LIKE lower('%am%') ;

SELECT ename, LENGTH(ename) --실습6-4
FROM emp ;

SELECT *
FROM EMP
WHERE length(ename) = 5 ;

SELECT empno, ename, sal, deptno --gpt q1
FROM EMP ;

SELECT * --gpt q2
FROM EMP
WHERE deptno = 10 ;

SELECT ename, sal --gpt q3
FROM EMP
WHERE sal >= 3000 ;

SELECT * --gpt q4
FROM EMP
WHERE ename LIKE 'A%' ;

SELECT empno, ename, job --gpt q5
FROM EMP
WHERE ename LIKE '%L%' ;

SELECT * --gpt q6
FROM emp
WHERE ename LIKE '_A%' ;

SELECT * --gpt q7
FROM EMP
WHERE comm IS null ;

SELECT * --gpt q8
FROM EMP
WHERE mgr IS NOT NULL 
AND comm IS NULL ;

SELECT * --GPT Q9
FROM  EMP
WHERE JOB IN ('MANAGER', 'CLERK')
AND SAL >= 2000 ;

SELECT * --GPT Q10
FROM EMP
WHERE DEPTNO = 10 
UNION
SELECT *
FROM EMP
WHERE DEPTNO = 30 ;

SELECT LENGTH('a'), LENGTH('한'), LENGTHb('a'), LENGTHb('한') FROM dual ; --12/16 수업

SELECT job, --실습 6-7
	SUBSTR(job, 1, 2), 
	SUBSTR(job, 3, 2), 
	SUBSTR(job, 5)
FROM emp ;

SELECT  
	SUBSTR(ename, 2, 3) --마지막 숫자가 커도 끝가지만 출력
FROM emp ;

SELECT  
	SUBSTR(ename, 20, 3) --실제 길이보다 시작이 크면 null
FROM emp ;

SELECT ename,
	SUBSTR(ename, -3, 2) --시작위치 음수는 뒤에서부터 센다
FROM emp ;

SELECT --실습 6-12
	'a-b-c',
	REPLACE('a-b-c', '-', ' '),
	REPLACE('a-b-c', '-', ';'),
	REPLACE('a-b-c', '-'),
	REPLACE('a-b-c', '-', '')
FROM dual ;

--사원이름에 A를 모두 소문자 a 로 교체

SELECT ename,
	REPLACE(ename, 'A', 'a')
FROM emp ;

SELECT ename, --실습 6-13
	lpad(ename, 10, '#') , lpad(ename, 5, '#')
FROM emp ;

SELECT ename, --모자르면 채우고, 넘어가면 짤림
	lpad(ename, 5, '#') 
FROM emp ;

--강사퀴즈1
-- 문제1
--    ename에서 앞에 두 글자만 출력
--    substr, lpad, replace
-- 문제2
--    ename의 앞 두글자만 원본을 출력하고
--    나머지는 4개의 *로 표시
-- 문제3
--    ename의 앞 두글자만 원본을 출력하고
--    나머지는로 출력
--     단, 전체 길이는 원래 이름의 길이만큼
--    WARD >> WA, SMITH >> SM*

SELECT ename, --문제1
	substr(ename, 1, 2), 
	rpad(ename, 2),
	replace(ename, SUBSTR(ename, 3), '') --원본에서 3번째부터 끝까지 없애자
FROM emp ;

SELECT ename, --문제2
	rpad(substr(ename, 1, 2), 6, '*')
FROM emp ;

SELECT ename, --문제3
	rpad(substr(ename, 1, 2), LENGTH(ename), '*')
FROM emp ; 

SELECT 'ab'|| 'cd' FROM dual ;
SELECT empno || ':' || ename FROM emp ;


SELECT ename, --문제4 앞 두글자만 *처리(마스킹처리)
	'**' || SUBSTR(ename, 3)
FROM emp ;

SELECT ename,
	lpad(SUBSTR(ename, 3), length(ename), '*')
FROM emp ;

SELECT --trim 앞뒤 공백만 없애줌
	'[' || '   _ _oracle_ _   '||']',
	'[' || trim('   _ _oracle_ _   ')||']'
FROM dual ;

SELECT 
	ROUND(14.46),
	ROUND(14.46, 1), -- 14.5
	ROUND(14.46, -1) -- 10
FROM emp ;

SELECT 
	TRUNC(14.46),
	TRUNC(14.46, 0),
	TRUNC(14.46, 1),
	TRUNC(14.46, -1),
	TRUNC(-14.46)
FROM emp ;

SELECT 
	ceil(3.14),
	floor(3.14),
	ceil(-3.14),
	floor(-3.14),
	TRUNC(-3.14)
FROM emp ;

SELECT 
	mod(15, 6), mod(15, 0)
FROM dual ;

SELECT 15/6, 15/0 FROM dual ;

SELECT 
	mod(6, 3), 
	mod(7, 3),
	mod(8, 3),
	mod(9, 3)
from dual ;

SELECT sysdate FROM dual ;

SELECT --실습 6-33
	TO_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') AS 현재날짜시간
FROM dual ;

SELECT 
	TO_char(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"')
FROM dual ;

SELECT * FROM emp
WHERE HIREDATE > to_date('1981/06/01', 'yyyy/mm/dd') ;

SELECT 
	sal, 
	comm, 
	nvl(comm, 0),
	sal+nvl(comm, 0),
	sal+comm,
	nvl(to_char(comm), 'N/A')
FROM emp ;

SELECT empno, ename, job, sal,
	decode(job,
			'MANAGER', SAL*1.1, --잡이 정확히 매니저라면
			'SALESMAN', SAL*1.05,
			'ANALYST', SAL,
			SAL*1.03) AS UPSAL --위 조건에 없다면
FROM EMP ;

SELECT empno, ename, job, sal,
	CASE JOB
		WHEN 'MANAGER' THEN SAL*1.1
		WHEN 'SALESMAN' THEN SAL*1.05
		WHEN 'ANALYST' THEN SAL
		ELSE SAL*1.03
	END AS UPSAL
	FROM EMP ;

SELECT EMPNO, ENAME, COMM, --실습 6-49
	CASE 
		WHEN COMM IS NULL THEN '해당 사항 없음'
		WHEN COMM = 0 THEN '수당 없음'
		WHEN COMM > 0 THEN '수당 : ' || COMM
	END AS COMM_TEXT
FROM EMP ;

--되새김 문제

SELECT EMPNO, --Q1
	SUBSTR(EMPNO, 1, 2) || '**' AS MASKING_EMPNO,
	ENAME,
	SUBSTR(ENAME, 1, 1) || '****' AS MASKING_ENAME 
FROM EMP
WHERE LENGTH(ENAME) = 5 ;

SELECT EMPNO, ENAME, SAL, --Q2
	TRUNC(SAL/21.5, 2) AS DAY_PAY,
	ROUND(SAL/21.5/8, 1) AS TIME_PAY
FROM EMP ;

SELECT ename , LENGTH(ename) FROM emp;

SELECT sum(comm) FROM emp;

SELECT sum(sal) FROM emp;

SELECT count(sal) FROM emp;
SELECT count(comm) FROM emp;
SELECT count(*) FROM emp;

SELECT COUNT(*) FROM emp
WHERE deptno = 30;

SELECT max(sal) FROM emp;
SELECT min(sal) FROM emp;

SELECT 
	max(sal), min(sal), min(hiredate), min(comm),
	count(*), sum(sal)
FROM emp;

SELECT avg(sal) FROM emp;

-- 이름에 a가 들어가는 사람은 몇명?
-- 'a'

SELECT count(*) FROM emp
WHERE lower(ename) LIKE lower('%a%');

SELECT DISTINCT deptno FROM emp;

-----------------
-- group by
/* 
 *  제약 1. select에는 group by에 적은 컬럼 명만 가능하다
 *  제약 2. select에 집계함수는 가능하다
 */
SELECT deptno
FROM emp
GROUP BY deptno;

SELECT deptno, count(*), sum(sal)
FROM EMP
GROUP BY deptno;

SELECT deptno, job
FROM EMP
GROUP BY deptno, job;

SELECT deptno, job, count(*)
FROM EMP
GROUP BY deptno, job;

/* group function is not allowed here
SELECT * FROM EMP
WHERE avg(sal) < sal;
*/

SELECT deptno, job 
FROM EMP
WHERE deptno = 10
GROUP BY deptno, job;

SELECT deptno, job 
FROM EMP
--WHERE deptno = 10
GROUP BY deptno, job
HAVING deptno = 10;

SELECT deptno, job, avg(sal)
FROM EMP
GROUP BY deptno, job;

SELECT deptno, job, avg(sal)
FROM EMP
GROUP BY deptno, job
HAVING avg(sal) > 2000;

-- job별로 3명 이상인 job과 count(*)를 표시
SELECT job, count(*)
FROM EMP
GROUP BY job
HAVING count(*) >= 3;

-- 실행 순서
/* 5 */ SELECT job, 1 AS num
/* 1 */ FROM emp
/* 2 */ WHERE sal > 1000
/* 3 */ GROUP BY job
/* 4 */ HAVING count(*) >= 3
/* 6 */ ORDER BY num DESC;

SELECT * FROM dept;
SELECT * FROM EMP;

-- 모든 조합이 다 나온다
SELECT *
FROM emp, dept
ORDER BY empno;

-- SMITH의 deptno만 emp에서 출력
SELECT deptno FROM EMP e WHERE ename = 'SMITH';
-- dept에서 deptno가 20인 줄 모든 컬럼 출력
SELECT * FROM dept WHERE deptno = 20;

-- where로 필요한 것만 뽑는다
SELECT *
FROM emp, DEPT
WHERE emp.deptno = dept.deptno;

-- 별칭을 주면 다음부터 별칭으로만 쓸 수 있음
SELECT *
FROM emp e, dept d
-- WHERE emp.deptno = d.deptno;
WHERE e.deptno = d.deptno;

-- deptno를 두 테이블 모두 들고있어서 애매하다는 에러가 뜸
SELECT ename, deptno
FROM emp e, dept d
-- WHERE emp.deptno = d.deptno;
WHERE e.deptno = d.deptno;

SELECT ename, e.deptno, e.*
FROM emp e, dept d
-- WHERE emp.deptno = d.deptno;
WHERE e.deptno = d.deptno;

SELECT * FROM salgrade;

-- 800
SELECT sal FROM emp WHERE ename = 'SMITH';

SELECT ename, sal, grade, losal, hisal
FROM emp e, SALGRADE s
WHERE e.sal >= s.losal AND e.sal <= s.hisal;

--7902
SELECT mgr FROM emp WHERE ename = 'SMITH';
SELECT * FROM emp WHERE empno = 7902;


-- king은 mgr이 null이어서 결과에서 빠졌다
SELECT  e1.empno, e1.ename, e1.mgr,
		e2.empno, e2.ename, e2.mgr
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;

SELECT *
FROM emp e NATURAL JOIN dept 9;

SELECT d.DEPTNO, d.*
FROM emp e JOIN dept d on(e.deptno = d.deptno)
WHERE sal <= 2000;

SELECT * 
FROM  emp e1 JOIN emp e2 on(e1.mgr = e2.empno);

-- left outer join기준 왼쪽 테이블을 모두 나오게 함.
SELECT * 
FROM  emp e1 LEFT OUTER JOIN emp e2 on(e1.mgr = e2.empno);

SELECT * 
FROM  emp e1 RIGHT OUTER JOIN emp e2 on(e1.mgr = e2.empno);

SELECT * 
FROM  emp e1 FULL OUTER JOIN emp e2 on(e1.mgr = e2.empno);

-- 퀴즈
-- 각 부서별로
-- 가장 높은 급여,
-- 가장 낮은 급여, 
-- 급여 차액,
-- 부서 번호
-- 힌트 : 결과는 총 3줄
SELECT deptno, max(sal), min(sal), MAX(sal) - min(sal)
FROM emp
GROUP BY deptno;


-- 교재 226페이지 1~4번
-- Q1
SELECT e.deptno, d.dname, e.empno, e.ename, e.sal
FROM dept d, EMP e
WHERE e.deptno = d.deptno
and e.sal > 2000;

-- Q2
SELECT e.deptno, d.dname, FLOOR(avg(e.sal)) AS AVG_SAL, max(e.sal) AS MAX_SAL, min(e.sal) AS MIN_SAL, COUNT(*) AS CNT
FROM EMP E, DEPT D
WHERE e.deptno = d.deptno
GROUP BY e.deptno, d.dname;

-- Q3
SELECT d.DEPTNO, d.dname, e.EMPNO, e.ENAME, e.job, e.sal
FROM emp e FULL OUTER JOIN dept d on(e.deptno = d.deptno);

-- Q4
SELECT d.deptno, d.dname, e.EMPNO, 
		e.ename, e.mgr, e.sal, 
		e.deptno AS DEPTNO_1,
		s.losal, s.hisal, s.grade, 
		e.mgr AS mgr_empno, 
		e1.ename AS mgr_ename
FROM dept d left OUTER JOIN emp e ON(e.deptno = d.deptno)
		LEFT OUTER JOIN salgrade s ON(e.sal >= s.losal AND e.sal <= s.hisal)
		LEFT OUTER JOIN emp e1 ON(e.mgr = e1.empno)
ORDER BY d.DEPTNO, e.empno;

