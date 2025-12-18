<<<<<<< HEAD
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


>>>>>>> 93a8d7e05421c4ffb3db3131618cac305e885781
	