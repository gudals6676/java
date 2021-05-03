select * from student;
select * from teacher;
select * from class;
select * from SCORE;
select stu_id, sco_date, sco_subject, sco_score from Score

delete from CLASS where CLASS_NUMBER = '4';

insert into CLASS values('4','a1','1','1')

update STUDENT set STU_PW = '������' where STU_ID = 'b1';

DROP TABLE "BOARD" CASCADE CONSTRAINTS;
DROP TABLE "CLASS" CASCADE CONSTRAINTS;
DROP TABLE "SCORE" CASCADE CONSTRAINTS;
DROP TABLE "STUDENT" CASCADE CONSTRAINTS;
DROP TABLE "TEACHER" CASCADE CONSTRAINTS;
DROP TABLE "BOARDMANAGER" CASCADE CONSTRAINTS;
CREATE TABLE board (
    bd_number   VARCHAR2(20) NOT NULL,
    tea_id      VARCHAR2(20) NOT NULL,
    stu_id      VARCHAR2(20) NOT NULL,
    bd_content  VARCHAR2(200) NOT NULL,
    bd_nop      VARCHAR2(20) NOT NULL
);

ALTER TABLE board ADD CONSTRAINT board_pk PRIMARY KEY ( bd_number );

CREATE TABLE boardmanager (
    bm_number  VARCHAR2(20) NOT NULL,
    stu_id     VARCHAR2(20) NOT NULL,
    bd_number  VARCHAR2(20) NOT NULL
);

ALTER TABLE boardmanager ADD CONSTRAINT boardmanager_pk PRIMARY KEY ( bm_number );

CREATE TABLE class (
    class_number  VARCHAR2(20) NOT NULL,
    tea_id        VARCHAR2(20) NOT NULL,
    class_name    VARCHAR2(20) NOT NULL,
    class_branch  VARCHAR2(20) NOT NULL
);

ALTER TABLE class ADD CONSTRAINT class_pk PRIMARY KEY ( class_number );

CREATE TABLE score (
    sco_number   VARCHAR2(20) NOT NULL,
    stu_id       VARCHAR2(20) NOT NULL,
    sco_date     VARCHAR2(20) NOT NULL,
    sco_subject  VARCHAR2(20) NOT NULL,
    sco_score    VARCHAR2(20) NOT NULL
);

ALTER TABLE score ADD CONSTRAINT score_pk PRIMARY KEY ( sco_number );

CREATE TABLE student (
    stu_id        VARCHAR2(20) NOT NULL,
    tea_id        VARCHAR2(20) NOT NULL,
    class_number  VARCHAR2(20) NOT NULL,
    stu_name      VARCHAR2(20) NOT NULL,
    stu_pw        VARCHAR2(20) NOT NULL,
    stu_birthday  VARCHAR2(20) NOT NULL,
    stu_tel       VARCHAR2(20) NOT NULL,
    stu_address   VARCHAR2(20) NOT NULL,
    stu_email     VARCHAR2(20) NOT NULL,
    stu_meet      VARCHAR2(20) NOT NULL,
    stu_bmn       VARCHAR2(20) NOT NULL
);

ALTER TABLE student ADD CONSTRAINT student_pk PRIMARY KEY ( stu_id );

CREATE TABLE teacher (
    tea_id       VARCHAR2(20) NOT NULL,
    tea_pw       VARCHAR2(20) NOT NULL,
    tea_name     VARCHAR2(20) NOT NULL,
    tea_subject  VARCHAR2(20) NOT NULL
);

ALTER TABLE teacher ADD CONSTRAINT teacher_pk PRIMARY KEY ( tea_id );

ALTER TABLE board
    ADD CONSTRAINT board_student_fk FOREIGN KEY ( stu_id )
        REFERENCES student ( stu_id );

ALTER TABLE board
    ADD CONSTRAINT board_teacher_fk FOREIGN KEY ( tea_id )
        REFERENCES teacher ( tea_id );

ALTER TABLE boardmanager
    ADD CONSTRAINT boardmanager_student_fk FOREIGN KEY ( stu_id )
        REFERENCES student ( stu_id );

ALTER TABLE class
    ADD CONSTRAINT class_teacher_fk FOREIGN KEY ( tea_id )
        REFERENCES teacher ( tea_id );

ALTER TABLE score
    ADD CONSTRAINT score_student_fk FOREIGN KEY ( stu_id )
        REFERENCES student ( stu_id );

ALTER TABLE student
    ADD CONSTRAINT student_class_fk FOREIGN KEY ( class_number )
        REFERENCES class ( class_number );

ALTER TABLE student
    ADD CONSTRAINT student_teacher_fk FOREIGN KEY ( tea_id )
        REFERENCES teacher ( tea_id );
insert into Teacher values('admin','admin','admin','all');
insert into Teacher values('a1','a123','�ּ���','���̽�');
insert into Teacher values('a2','a234','�̻���','�ڹ�');
insert into Teacher values('a3','a345','�����','�ڹ�');
insert into Class values('0','admin','admin','none');
insert into Class values('1','a1','������','CGI');
insert into Class values('2','a2','IOT','CGI');
insert into Class values('3','a3','�ΰ�����','��Ʈ����');
insert into Student values('Sadmin','admin','0','Sadmin','Sadmin','0/0/0','000','none','none','0','0');
insert into Student values('b1','a1','1','b123','������','97/1/2','010','�ϱ�','na','0','0');
insert into Student values('b2','a1','1','b234','������','96/1/3','020','����','na','0','0');
insert into Student values('b3','a1','1','b345','�����','95/1/4','030','����','na','0','0');
insert into Student values('b4','a1','1','b456','������','93/1/5','040','����','da','0','0');
insert into Student values('b5','a1','1','b567','�賲��','98/1/6','050','���걸','da','0','0');
insert into Student values('c1','a2','2','c123','���浿','91/1/2','010','�ϱ�','na','0','0');
insert into Student values('c2','a2','2','c234','���浿','98/1/3','020','����','na','0','0');
insert into Student values('c3','a2','2','c345','�ٱ浿','95/1/4','030','����','na','0','0');
insert into Student values('c4','a2','2','c456','��浿','94/1/5','040','����','da','0','0');
insert into Student values('c5','a2','2','c567','���浿','91/1/6','050','���걸','da','0','0');
insert into Student values('d1','a3','3','d123','ȫ����','00/1/2','010','�ϱ�','na','0','0');
insert into Student values('d2','a3','3','d234','ȫ����','99/1/3','020','����','na','0','0');
insert into Student values('d3','a3','3','d345','ȫ�ٵ�','98/1/4','030','����','na','0','0');
insert into Student values('d4','a3','3','d456','ȫ��','99/1/5','040','����','da','0','0');
insert into Student values('d5','a3','3','d567','ȫ����','93/1/6','050','���걸','da','0','0');
insert into Board values('01','a1','Sadmin','���̽� ����','0');
insert into Board values('02','a1','Sadmin','���̽� ���� 2��','0');
insert into Board values('03','a2','Sadmin','��� ����','0');
insert into Board values('04','a3','Sadmin','�ڹ� ����','0');
insert into Board values('05','admin','b1','���̽� ����','0');
insert into Board values('06','admin','b2','��� ����','0');
insert into Board values('07','admin','b3','�ڹ� ����','0');

insert into Score values('01','b1','4/1','JAVA','95');
insert into Score values('02','b2','4/1','JAVA','90');
insert into Score values('03','b3','4/1','JAVA','85');
insert into Score values('04','b4','4/1','JAVA','80');
insert into Score values('05','b5','4/1','DB','100');
insert into Score values('06','b1','4/2','DB','95');
insert into Score values('07','b2','4/2','DB','90');
insert into Score values('08','b3','4/2','DB','85');
insert into Score values('09','b4','4/2','DB','80');
insert into Score values('10','b5','4/2','DB','100');
insert into Score values('11','b1','4/3','JAVA-2','95');
insert into BOARDMANAGER values('01','b1','1');
insert into BOARDMANAGER values('02','b2','1');
insert into BOARDMANAGER values('03','b3','1');
insert into BOARDMANAGER values('04','b4','1');
insert into BOARDMANAGER values('05','b1','2');
insert into BOARDMANAGER values('06','b2','2');



DROP TABLE "BOARD" CASCADE CONSTRAINTS;
DROP TABLE "CLASS" CASCADE CONSTRAINTS;
DROP TABLE "SCORE" CASCADE CONSTRAINTS;
DROP TABLE "STUDENT" CASCADE CONSTRAINTS;
DROP TABLE "TEACHER" CASCADE CONSTRAINTS;
DROP TABLE "BOARDMANAGER" CASCADE CONSTRAINTS;
CREATE TABLE board (
    bd_number   VARCHAR2(20) NOT NULL,
    tea_id      VARCHAR2(20) NOT NULL,
    stu_id      VARCHAR2(20) NOT NULL,
    bd_content  VARCHAR2(200) NOT NULL,
    bd_nop      VARCHAR2(20) NOT NULL
);

ALTER TABLE board ADD CONSTRAINT board_pk PRIMARY KEY ( bd_number );

CREATE TABLE boardmanager (
    bm_number  VARCHAR2(20) NOT NULL,
    stu_id     VARCHAR2(20) NOT NULL,
    bd_number  VARCHAR2(20) NOT NULL
);

ALTER TABLE boardmanager ADD CONSTRAINT boardmanager_pk PRIMARY KEY ( bm_number );

CREATE TABLE class (
    class_number  VARCHAR2(20) NOT NULL,
    tea_id        VARCHAR2(20) NOT NULL,
    class_name    VARCHAR2(20) NOT NULL,
    class_branch  VARCHAR2(20) NOT NULL
);

ALTER TABLE class ADD CONSTRAINT class_pk PRIMARY KEY ( class_number );

CREATE TABLE score (
    sco_number   VARCHAR2(20) NOT NULL,
    stu_id       VARCHAR2(20) NOT NULL,
    sco_date     VARCHAR2(20) NOT NULL,
    sco_subject  VARCHAR2(20) NOT NULL,
    sco_score    VARCHAR2(20) NOT NULL
);

ALTER TABLE score ADD CONSTRAINT score_pk PRIMARY KEY ( sco_number );

CREATE TABLE student (
    stu_id        VARCHAR2(20) NOT NULL,
    tea_id        VARCHAR2(20) NOT NULL,
    class_number  VARCHAR2(20) NOT NULL,
    stu_pw        VARCHAR2(20) NOT NULL,
    stu_name      VARCHAR2(20) NOT NULL,
    stu_birthday  VARCHAR2(20) NOT NULL,
    stu_tel       VARCHAR2(20) NOT NULL,
    stu_address   VARCHAR2(20) NOT NULL,
    stu_email     VARCHAR2(20) NOT NULL,
    stu_meet      VARCHAR2(20) NOT NULL,
    stu_bmn       VARCHAR2(20) NOT NULL
);

ALTER TABLE student ADD CONSTRAINT student_pk PRIMARY KEY ( stu_id );

CREATE TABLE teacher (
    tea_id       VARCHAR2(20) NOT NULL,
    tea_pw       VARCHAR2(20) NOT NULL,
    tea_name     VARCHAR2(20) NOT NULL,
    tea_subject  VARCHAR2(20) NOT NULL
);

ALTER TABLE teacher ADD CONSTRAINT teacher_pk PRIMARY KEY ( tea_id );

ALTER TABLE board
    ADD CONSTRAINT board_student_fk FOREIGN KEY ( stu_id )
        REFERENCES student ( stu_id );

ALTER TABLE board
    ADD CONSTRAINT board_teacher_fk FOREIGN KEY ( tea_id )
        REFERENCES teacher ( tea_id );

ALTER TABLE boardmanager
    ADD CONSTRAINT boardmanager_student_fk FOREIGN KEY ( stu_id )
        REFERENCES student ( stu_id );

ALTER TABLE class
    ADD CONSTRAINT class_teacher_fk FOREIGN KEY ( tea_id )
        REFERENCES teacher ( tea_id );

ALTER TABLE score
    ADD CONSTRAINT score_student_fk FOREIGN KEY ( stu_id )
        REFERENCES student ( stu_id );

ALTER TABLE student
    ADD CONSTRAINT student_class_fk FOREIGN KEY ( class_number )
        REFERENCES class ( class_number );

ALTER TABLE student
    ADD CONSTRAINT student_teacher_fk FOREIGN KEY ( tea_id )
        REFERENCES teacher ( tea_id );
insert into Teacher values('admin','admin','admin','all');
insert into Teacher values('a1','a123','�ּ���','���̽�');
insert into Teacher values('a2','a234','�̻���','�ڹ�');
insert into Teacher values('a3','a345','�����','�ڹ�');
insert into Class values('0','admin','admin','none');
insert into Class values('1','a1','������','CGI');
insert into Class values('2','a2','IOT','CGI');
insert into Class values('3','a3','�ΰ�����','��Ʈ����');
insert into Student values('Sadmin','admin','0','Sadmin','Sadmin','0/0/0','000','none','none','0','0');
insert into Student values('b1','a1','1','b123','������','97/1/2','010','�ϱ�','na','0','0');
insert into Student values('b2','a1','1','b234','������','96/1/3','020','����','na','0','0');
insert into Student values('b3','a1','1','b345','�����','95/1/4','030','����','na','0','0');
insert into Student values('b4','a1','1','b456','������','93/1/5','040','����','da','0','0');
insert into Student values('b5','a1','1','b567','�賲��','98/1/6','050','���걸','da','0','0');
insert into Student values('c1','a2','2','c123','���浿','91/1/2','010','�ϱ�','na','0','0');
insert into Student values('c2','a2','2','c234','���浿','98/1/3','020','����','na','0','0');
insert into Student values('c3','a2','2','c345','�ٱ浿','95/1/4','030','����','na','0','0');
insert into Student values('c4','a2','2','c456','��浿','94/1/5','040','����','da','0','0');
insert into Student values('c5','a2','2','c567','���浿','91/1/6','050','���걸','da','0','0');
insert into Student values('d1','a3','3','d123','ȫ����','00/1/2','010','�ϱ�','na','0','0');
insert into Student values('d2','a3','3','d234','ȫ����','99/1/3','020','����','na','0','0');
insert into Student values('d3','a3','3','d345','ȫ�ٵ�','98/1/4','030','����','na','0','0');
insert into Student values('d4','a3','3','d456','ȫ��','99/1/5','040','����','da','0','0');
insert into Student values('d5','a3','3','d567','ȫ����','93/1/6','050','���걸','da','0','0');
insert into Board values('01','a1','Sadmin','���̽� ����','0');
insert into Board values('02','a1','Sadmin','���̽� ���� 2��','0');
insert into Board values('03','a2','Sadmin','��� ����','0');
insert into Board values('04','a3','Sadmin','�ڹ� ����','0');
insert into Board values('05','admin','b1','���̽� ����','0');
insert into Board values('06','admin','b2','��� ����','0');
insert into Board values('07','admin','b3','�ڹ� ����','0');

insert into Score values('01','b1','4/1','JAVA','95');
insert into Score values('02','b2','4/1','JAVA','90');
insert into Score values('03','b3','4/1','JAVA','85');
insert into Score values('04','b4','4/1','JAVA','80');
insert into Score values('05','b5','4/1','DB','100');
insert into Score values('06','b1','4/2','DB','95');
insert into Score values('07','b2','4/2','DB','90');
insert into Score values('08','b3','4/2','DB','85');
insert into Score values('09','b4','4/2','DB','80');
insert into Score values('10','b5','4/2','DB','100');
insert into Score values('11','b1','4/3','JAVA-2','95');
insert into BOARDMANAGER values('01','b1','1');
insert into BOARDMANAGER values('02','b2','1');
insert into BOARDMANAGER values('03','b3','1');
insert into BOARDMANAGER values('04','b4','1');
insert into BOARDMANAGER values('05','b1','2');
insert into BOARDMANAGER values('06','b2','2');