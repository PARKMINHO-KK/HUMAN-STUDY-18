
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
and e.sal > 2000
ORDER BY e.deptno, job;

-- Q2
SELECT e.deptno, d.dname, FLOOR(avg(e.sal)) AS AVG_SAL, max(e.sal) AS MAX_SAL, min(e.sal) AS MIN_SAL, COUNT(*) AS CNT
FROM EMP E, DEPT D
WHERE e.deptno = d.deptno
GROUP BY e.deptno, d.dname;

-- Q3
SELECT d.DEPTNO, d.dname, e.EMPNO, e.ENAME, e.job, e.sal
FROM emp e FULL OUTER JOIN dept d on(e.deptno = d.deptno)
ORDER BY deptno, ename;

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



----------------------------------------
-- 서브쿼리
----------------------------------------

SELECT *
FROM EMP
--WHERE sal > 2975;
WHERE sal > (SELECT SAL 
			 FROM EMP
			 WHERE ename = 'JONES');

SELECT *
FROM EMP
WHERE HIREDATE < 	(SELECT HIREDATE 
				 	 FROM EMP
					 WHERE ename = 'SCOTT');


SELECT *
FROM emp
WHERE sal > (SELECT avg(sal) FROM emp);

SELECT max(sal) FROM EMP 
GROUP BY deptno;

SELECT * FROM emp
WHERE sal IN (2850, 3000, 5000);

SELECT * FROM emp
WHERE sal IN (SELECT max(sal) FROM EMP 
			  GROUP BY deptno);

SELECT *
FROM (	SELECT deptno, ename 
		FROM emp 
		WHERE deptno = 10) e10, dept d
WHERE e10.deptno = d.deptno;

SELECT job, count(*)
FROM EMP
GROUP BY job
HAVING count(*) >= 3;

-- cnt는 select에서 동작하고
-- where는 그 전에 실행된다
SELECT job, count(*) cnt
FROM EMP
WHERE cnt >= 3
GROUP BY job;

SELECT *
FROM (	SELECT job, count(*) cnt
		FROM EMP
		GROUP BY job)
WHERE cnt >= 3;

SELECT rownum, e.*
FROM emp e;

SELECT rownum, e.*
FROM emp e
ORDER BY sal;

-- 깜짝퀴즈
-- 연봉 오름차순으로 정렬된채로 줄번호 적용
/* 오답
 * SELECT e.*
FROM emp e (	SELECT rownum 
				FROM emp )
ORDER BY e.sal;
 */
-- 정답
SELECT rownum, e.*
FROM (	SELECT * 
		FROM emp
		ORDER BY sal) e;
-- WHERE rownum = 6; -- rownum 자체가 의미가 있다

-- 작동순서가 rnum보다 where가 빨라서 에러남
SELECT rownum rnum, e.*
FROM (	SELECT * 
		FROM emp
		ORDER BY sal) e
WHERE rnum = 6;

-- select를 하나더 써서 순서를 맞춰준다
SELECT *
FROM (
	SELECT rownum rnum, e.*
	FROM (	
		SELECT * FROM emp
		ORDER BY sal
	) e
)
WHERE rnum >= 6 AND rnum <= 10;

WITH e10 AS (
	SELECT * FROM emp WHERE deptno = 10
)
SELECT * FROM e10;

SELECT 
	sal,
	ename,
	(SELECT 
		grade
	FROM SALGRADE
	WHERE e.sal BETWEEN losal AND hisal) grade
FROM emp e;

-- 문제1
-- 커미션(comm)이 null인 사원을 급여 내림차순으로 정렬
SELECT *
FROM EMP
WHERE comm is NULL
ORDER BY sal desc;

-- 문제2
-- 급여 등급 별 사원 수를 등급 오름차순으로 정렬
-- 출력결과 : 등급, 몇 명
SELECT grade, count(*)
FROM SALGRADE s, EMP e
WHERE e.sal >= s.losal
	AND e.sal <= s.hisal
group BY grade
ORDER BY grade;

-- 문제3
-- 출력 : 이름, 급여, 급여 등급, 부서이름
-- 급여등급 3 이상만, 급여 등급 내림차순
-- 급여등급이 같은 경우 급여 내림 차순
SELECT ename, sal, grade, dname
FROM EMP e, SALGRADE s, DEPT d
WHERE e.DEPTNO = d.DEPTNO 
	AND e.sal >= s.LOSAL 
	AND e.SAL <= s.HISAL 
	AND s.GRADE >= 3
ORDER BY grade DESC, sal desc;

-- 문제4
-- 부서명이 sales인 사원 중
-- 급여 등급이 2 또는 3인 사원의 급여를 내림차순으로 정렬
SELECT *
FROM EMP e, SALGRADE s, DEPT d
WHERE e.DEPTNO = d.DEPTNO 
	AND e.sal >= s.LOSAL 
	AND e.SAL <= s.HISAL
	AND d.dname = 'SALES'
	AND grade >= 2
	AND grade <= 3
ORDER BY sal DESC;

-- page249
-- Q1
SELECT job, empno, ename, e.sal, d.deptno, dname
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO
	AND e.job = (
				SELECT job
				FROM EMP
				WHERE ename = 'ALLEN'
				);

-- Q2
SELECT empno, ename, dname, hiredate, loc, sal, grade
FROM EMP e , DEPT d , SALGRADE s 
WHERE e.DEPTNO = d.DEPTNO 
	AND e.sal >= s.LOSAL 
	AND e.SAL <= s.HISAL
	AND e.sal > (SELECT avg(sal)
				FROM emp)
ORDER BY sal DESC;

-- Q3
SELECT empno, ename, job, e.deptno, dname, LOC
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
	AND e.deptno = 10
	AND e.job NOT IN (
				SELECT e.job 
				FROM emp e
				WHERE e.deptNO = 30
				);

-- Q4
SELECT empno, ename, sal, grade
FROM EMP e , SALGRADE s 
WHERE e.sal >= s.LOSAL
	AND e.SAL <= s.HISAL
	AND e.sal > (
				SELECT max(sal)
				FROM EMP
				WHERE job = 'SALESMAN'
				)
ORDER BY e.empno;




--------------------------------
-- 12장
--------------------------------
DESC emp; -- dbeaver에서 안된다(근데 원래 되야함)
SELECT * FROM emp;

CREATE TABLE emp_ddl (
    empno number(4),
    ename varchar2(10), 
    job varchar2(9), 
    mgr  number(4),
    hiredate DATE,
    sal number(7,2),
    comm number(7,2),
    deptno number(2)
);
SELECT * FROM emp_ddl;

CREATE TABLE dept_ddl
AS SELECT * FROM dept;

SELECT * FROM dept_ddl;

CREATE TABLE emp_ddl_30
AS SELECT * FROM emp WHERE deptno = 30;
SELECT * FROM emp_ddl_30;

CREATE TABLE empdept_ddl
AS 
SELECT empno, ename, job job2, d.deptno, dname
FROM emp e, dept d
WHERE 1 <> 1;

SELECT * FROM empdept_ddl;

CREATE TABLE emp_alter
AS SELECT * FROM emp;

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
ADD hp varchar2(20);
SELECT * FROM emp_alter;

ALTER TABLE emp_alter
RENAME COLUMN hp TO tel;
SELECT * FROM emp_alter;

ALTER TABLE emp_alter
MODIFY empno number(5);
-- 크기는 늘어나는 경우만 가능. 줄어들지 못함
-- 다른 타입으로 변경할 경우 모든 값이 null일 때만 가능하다

ALTER TABLE emp_alter
DROP COLUMN tel;
SELECT * FROM emp_alter;

RENAME emp_alter TO emp_rename;
SELECT * FROM emp_rename;

TRUNCATE TABLE emp_rename;

DROP TABLE emp_rename;

--------------------------------
-- 10장
--------------------------------
CREATE TABLE dept_temp
AS SELECT * FROM dept;

SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, dname, loc)
VALUES (50, 'DATABASE', 'SEOUL');
SELECT * FROM dept_temp;

INSERT INTO dept_temp
VALUES (60, 'NEtwork', 'BUSAL');
SELECT * FROM dept_temp;

INSERT INTO dept_temp
VALUES (70, 'WEB', null);
SELECT * FROM dept_temp;

-- ''도 null 취급
INSERT INTO dept_temp
VALUES (80, 'MOBILE', '');
SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, loc)
VALUES (90, 'incheon');
SELECT * FROM dept_temp;

CREATE TABLE emp_temp
AS SELECT * FROM emp WHERE 1 <> 1;
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (999, '홍길동', '2026/01/27');
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (7051, '최민수', to_date('2026/01/27', 'yyy-mm-dd'));
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (3111, '심청이', sysdate);
SELECT * FROM emp_temp; 

INSERT INTO EMP_TEMP 
SELECT * FROM emp WHERE deptno = 10;
SELECT * FROM emp_temp;

INSERT ALL
INTO EMP_TEMP (empno, ename, hiredate)
	VALUES (3112, '심청이2', sysdate)
INTO EMP_TEMP (empno, ename, hiredate)
	VALUES (3113, '심청이3', sysdate)
SELECT * FROM dual;

SELECT * FROM emp_temp;

--------------------------------------------------
-- update
--------------------------------------------------
CREATE TABLE dept_temp2
AS SELECT * FROM dept;
SELECT * FROM dept_temp2;

UPDATE dept_temp2
SET loc = 'seoul';
SELECT * FROM dept_temp2;

ROLLBACK;

-- update, delete 실행 하기 전에 
-- where를 무조건 검증해보기
SELECT * FROM dept_temp2
WHERE deptno = 40;

UPDATE dept_temp2
SET dname = 'DATABASE', loc = 'SEOUL'
WHERE deptno = 40;
SELECT * FROM dept_temp2;

UPDATE dept_temp2
SET dname = (SELECT dname
			FROM DEPT
			WHERE deptno = 40),
	loc = (SELECT Loc
			FROM DEPT
			WHERE deptno = 40)
WHERE deptno = 40;
SELECT * FROM dept_temp2;

CREATE TABLE EMP_tmp
AS SELECT * FROM emp;
SELECT * FROM emp_tmp;

SELECT sal, sal * 1.08 FROM emp_tmp
WHERE sal < 1000;

UPDATE emp_tmp
SET sal = sal * 1.08
WHERE sal < 1000;

SELECT * FROM emp_tmp
WHERE ename IN ('SMITH', 'JAMES');

CREATE TABLE emp_temp2
AS SELECT * FROM emp;

DELETE FROM emp_temp2
WHERE job = 'MANAGER';

SELECT * FROM emp_temp2;

DELETE FROM emp_temp2;
SELECT * FROM emp_temp2;

ROLLBACK;

DELETE FROM emp_temp2
WHERE job = 'MANAGER';

COMMIT;
ROLLBACK;
SELECT * FROM emp_temp2;

-----------------------------------------
-- 13장
-----------------------------------------

SELECT * FROM dict;
SELECT * FROM user_tables;

-----------------------------------------
-- index --
-----------------------------------------

CREATE INDEX IDX_EMP_SAL
ON EMP (SAL ASC);

SELECT * FROM USER_INDEXES;
SELECT * FROM USER_IND_COLUMNS;

SELECT /*+ index(e idx_emp_sal)   */ -- 강제HINT
	ename, sal
FROM emp e
WHERE sal = 3000;

CREATE VIEW vw_emp20
AS (SELECT empno, ename, job, deptno
	FROM EMP
	WHERE deptno = 20);

SELECT * FROM vw_emp20;

SELECT * FROM vw_emp20
WHERE job = 'CLERK';

CREATE TABLE dept_seq
AS SELECT * FROM dept WHERE 1 != 1;
SELECT * FROM dept_seq;

CREATE SEQUENCE seq_dept;

SELECT * FROM USER_sequences;

-- 다음 값
SELECT seq_dept.nextval FROM dual;
SELECT seq_dept.nextval FROM dual;

-- 현재 값
-- 생성 후에 nextval 한번은 실행하고나서
-- currval 사용 가능
SELECT seq_dept.currval FROM dual;

CREATE SEQUENCE seq_dept_10
START WITH 10
INCREMENT BY 10;

SELECT seq_dept_10.nextval FROM dual;
SELECT seq_dept_10.nextval FROM dual;
SELECT seq_dept_10.nextval FROM dual;

SELECT seq_dept_10.currval FROM dual;

INSERT INTO dept_seq (deptno, dname, loc)
VALUES (seq_dept_10.nextval, 'database', 'seoul');
SELECT  * FROM dept_seq;

INSERT INTO dept_seq (deptno, dname, loc)
VALUES (seq_dept_10.nextval, 'database2', 'seoul');
SELECT  * FROM dept_seq;

-----------------------------------------
-- 제약 조건 --
-----------------------------------------

-- 방법1 
-- primary key를 두개 이상 줄 수 없다
CREATE TABLE table_pk (
	login_id varchar2(20) PRIMARY KEY,
	login_pw varchar2(20) NOT NULL,
	tel varchar2(20)
);
SELECT * FROM table_pk;

-- pk를 지정하면 index 자동 생성
SELECT * FROM user_indexes;

INSERT INTO table_pk
VALUES ('id1', 'pw1', null);

-- id 중복
INSERT INTO table_pk
VALUES ('id1', 'pw1', null);

-- not null에 null추가
INSERT INTO table_pk
VALUES ('id2', null, null);

INSERT INTO table_pk (login_id)
VALUES ('id3');

INSERT INTO table_pk (login_id)
VALUES (null);

SELECT * FROM table_pk;

-- pk나 not null을 null로 변경
UPDATE table_pk
SET login_id = NULL
WHERE login_id = 'id1';

INSERT INTO table_pk
VALUES ('id2', 'pw2', null);
SELECT * FROM table_pk;

-- pk를 중복되는 값으로 변경
UPDATE table_pk
SET login_id = 'id1'
WHERE login_id = 'id2';

-- 방법2
-- pk 하나 이상 지정 가능
CREATE TABLE table_pk2 (
	login_id varchar2(20),
	login_pw varchar2(20),
	tel varchar2(20),
	
	PRIMARY KEY (login_id, login_pw)
);
SELECT * FROM table_pk2;

-- 방법3
CREATE TABLE table_pk4 (
	login_id varchar2(20),
	login_pw varchar2(20),
	tel varchar2(20)
);
ALTER TABLE table_pk4
ADD PRIMARY key(login_id, login_pw);

ALTER TABLE table_pk4
MODIFY login_id PRIMARY KEY;

-----------------------------------------
-- foreign key --
----------------------------------------- 
CREATE TABLE dept_fk(
	deptno number(2) PRIMARY KEY,
	dname varchar2(14),
	loc varchar2(13)
);

-- references 지정방법 1
CREATE TABLE emp_fk(
	empno number(4) PRIMARY KEY,
	ename varchar2(10),
	deptno number(2) REFERENCES dept_fk(deptno)
);

-- references 지정방법 2

-- references 지정방법 3


-- null 됨(항상 됨)
INSERT INTO emp_fk
values(1, '이름2',null);

-- 없는 값 안됨
INSERT INTO emp_fk
values(2, '이름2',1);

INSERT INTO dept_fk
VALUES (10, '부서', '위치');
SELECT * FROM dept_fk;

INSERT INTO emp_fk
VALUES (2, '이름2', 10);

INSERT INTO emp_fk
VALUES (3, '이름3', 10);
SELECT * FROM emp_fk;

-- 없는 값으로 update 안됨
UPDATE emp_fk
SET deptno = 20

-- 쳐다보고 있는 원본 값 삭제 안됨
DELETE dept_fk
WHERE deptno = 10;

DROP TABLE dept_fk;

UPDATE dept_fk
SET deptno = 20
WHERE deptno = 10;

TRUNCATE TABLE dept_fk;

WHERE deptno = 10;

DELETE emp_fk
WHERE deptno = 10;

UPDATE dept_fk
SET deptno = 20
WHERE deptno = 10;





