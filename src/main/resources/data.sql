insert into "category" (category_id, category_name, created_at, updated_at) values
(1, '기술', now(), now()),
(2, '영업', now(), now()),
(3, '교육', now(), now());

insert into "job" (job_id, category_id, job_name, "index", created_at, updated_at) values
(1, 1, '소프트웨어 엔지니어', 1, now(), now()),
(2, 1, '시스템 엔지니어', 2, now(), now()),
(3, 1, '데이터 과학자', 3, now(), now()),
(4, 2, '영업 관리자', 1, now(), now()),
(5, 2, '고객 담당자', 2, now(), now()),
(6, 3, '수학 교사', 1, now(), now()),
(7, 3, '영어 교사', 2, now(), now()),
(8, 3, '체육 교사', 3, now(), now()),
(9, 3, '음악 교사', 4, now(), now());

insert into "preferred_job" (preferred_job_id, member_id, job_id, created_at, updated_at) values
(1, 5, 1, now(), now()),
(2, 5, 5, now(), now()),
(3, 6, 1, now(), now()),
(4, 6, 4, now(), now()),
(5, 6, 6, now(), now()),
(6, 6, 7, now(), now()),
(7, 7, 5, now(), now()),
(8, 8, 3, now(), now()),
(9, 9, 6, now(), now()),
(10, 9, 7, now(), now()),
(11, 9, 1, now(), now()),
(12, 9, 9, now(), now()),
(13, 9, 8, now(), now());
