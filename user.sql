DROP TABLE IF EXISTS tb_user;
CREATE TABLE tb_user (
  t_user_id bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  t_user_name varchar(32) DEFAULT NULL COMMENT '姓名',
  t_user_password varchar(32) DEFAULT NULL COMMENT '密码',
  t_user_phone varchar(32) DEFAULT NULL,
	t_user_sex varchar(32) DEFAULT NULL,
	t_user_age varchar(32) DEFAULT NULL,
  PRIMARY KEY (t_user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_user(t_user_name,t_user_password,t_user_phone,t_user_sex,t_user_age) VALUES
('张三','Abcd1234','13725567048','男','25'),
('李四','Abcd1234','13725567049','女','26'),
('王五','Abcd1234','13725567040','男','27');



DROP TABLE IF EXISTS teacher;
 CREATE TABLE teacher(
     t_id INT PRIMARY KEY AUTO_INCREMENT,
    t_name VARCHAR(20)
 );
DROP TABLE IF EXISTS class;
 CREATE TABLE class(
     c_id INT PRIMARY KEY AUTO_INCREMENT,
     c_name VARCHAR(20),
     teacher_id INT
 );
 ALTER TABLE class ADD CONSTRAINT fk_teacher_id FOREIGN KEY (teacher_id) REFERENCES teacher(t_id);

 INSERT INTO teacher(t_name) VALUES('teacher1');
 INSERT INTO teacher(t_name) VALUES('teacher2');

 INSERT INTO class(c_name, teacher_id) VALUES('class_a', 1);
 INSERT INTO class(c_name, teacher_id) VALUES('class_b', 2);

DROP TABLE IF EXISTS student;
CREATE TABLE student(
    s_id INT PRIMARY KEY AUTO_INCREMENT,
    s_name VARCHAR(20),
    class_id INT
);
INSERT INTO student(s_name, class_id) VALUES('student_A', 1);
INSERT INTO student(s_name, class_id) VALUES('student_B', 1);
INSERT INTO student(s_name, class_id) VALUES('student_C', 1);
INSERT INTO student(s_name, class_id) VALUES('student_D', 2);
INSERT INTO student(s_name, class_id) VALUES('student_E', 2);
INSERT INTO student(s_name, class_id) VALUES('student_F', 2);


DROP TABLE IF EXISTS p_user;
create table p_user(
    id int primary key auto_increment,
    name varchar(10),
    sex char(2)
);

INSERT INTO p_user(name,sex) VALUES('A',"男");
insert into p_user(name,sex) values('B',"女");
insert into p_user(name,sex) values('C',"男");

-- 创建存储过程(查询得到男性或女性的数量, 如果传入的是0就女性否则是男性)
DELIMITER $
CREATE PROCEDURE study.ges_user_count(IN sex_id INT, OUT user_count INT)
BEGIN
IF sex_id=0 THEN
SELECT COUNT(*) FROM study.p_user WHERE p_user.sex='女' INTO user_count;
ELSE
SELECT COUNT(*) FROM study.p_user WHERE p_user.sex='男' INTO user_count;
END IF;
END
$

-- 调用存储过程
DELIMITER ;
SET @user_count = 0;
CALL study.ges_user_count(0, @user_count);
SELECT @user_count;