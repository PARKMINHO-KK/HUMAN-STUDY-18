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