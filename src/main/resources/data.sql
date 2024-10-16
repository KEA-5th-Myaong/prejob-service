insert into "category" (category_id, category_name, created_at, updated_at) values
	(1, '카테고리1', now(), now()),
	(2, '카테고리2', now(), now()),
	(3, '카테고리3', now(), now());

insert into "job" (job_id, category_id, job_name, "index", created_at, updated_at) values
	(1, 1, '직군1', 1, now(), now()),
	(2, 1, '직군2', 2, now(), now()),
	(3, 1, '직군3', 3, now(), now()),
	(4, 2, '직군4', 1, now(), now()),
	(5, 2, '직군5', 2, now(), now()),
	(6, 3, '직군6', 1, now(), now()),
	(7, 3, '직군7', 2, now(), now()),
	(8, 3, '직군8', 3, now(), now()),
	(9, 3, '직군9', 4, now(), now());

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

