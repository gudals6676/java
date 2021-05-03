DROP TABLE "BOARD" CASCADE CONSTRAINTS;
DROP TABLE "CLASS" CASCADE CONSTRAINTS;
DROP TABLE "SCORE" CASCADE CONSTRAINTS;
DROP TABLE "STUDENT" CASCADE CONSTRAINTS;
DROP TABLE "TEACHER" CASCADE CONSTRAINTS;
CREATE TABLE board (
    bd_number          VARCHAR2(20) NOT NULL,
    stu_number         VARCHAR2(10) NOT NULL,
    tea_number         VARCHAR2(20) NOT NULL,
    bd_numberofpeople  VARCHAR2(20) NOT NULL,
    bd_content         VARCHAR2(200) NOT NULL
);

ALTER TABLE board ADD CONSTRAINT board_pk PRIMARY KEY ( bd_number );

CREATE TABLE class (
    class_number  VARCHAR2(20) NOT NULL,
    tea_number    VARCHAR2(20) NOT NULL,
    class_name    VARCHAR2(20) NOT NULL,
    class_branch  VARCHAR2(20)
);

ALTER TABLE class ADD CONSTRAINT class_pk PRIMARY KEY ( class_number );

CREATE TABLE score (
    sco_number   VARCHAR2(20) NOT NULL,
    stu_number   VARCHAR2(10) NOT NULL,
    sco_date     VARCHAR2(20),
    sco_subject  VARCHAR2(20),
    sco_score    VARCHAR2(20)
);

ALTER TABLE score ADD CONSTRAINT score_pk PRIMARY KEY ( sco_number );

CREATE TABLE student (
    stu_number    VARCHAR2(10) NOT NULL,
    class_number  VARCHAR2(20) NOT NULL,
    tea_number    VARCHAR2(20) NOT NULL,
    stu_id        VARCHAR2(20) NOT NULL,
    stu_pw        VARCHAR2(20) NOT NULL,
    stu_name      VARCHAR2(20) NOT NULL,
    stu_birthday  VARCHAR2(20) NOT NULL,
    stu_tel       VARCHAR2(20),
    stu_address   VARCHAR2(50) NOT NULL,
    stu_email     VARCHAR2(20),
    stu_meet      VARCHAR2(10)
);

ALTER TABLE student ADD CONSTRAINT student_pk PRIMARY KEY ( stu_number );

CREATE TABLE teacher (
    tea_number   VARCHAR2(20) NOT NULL,
    tea_id       VARCHAR2(20) NOT NULL,
    tea_pw       VARCHAR2(20) NOT NULL,
    tea_name     VARCHAR2(20) NOT NULL,
    tea_subject  VARCHAR2(20)
);

ALTER TABLE teacher ADD CONSTRAINT teacher_pk PRIMARY KEY ( tea_number );

ALTER TABLE board
    ADD CONSTRAINT board_student_fk FOREIGN KEY ( stu_number )
        REFERENCES student ( stu_number );

ALTER TABLE board
    ADD CONSTRAINT board_teacher_fk FOREIGN KEY ( tea_number )
        REFERENCES teacher ( tea_number );

ALTER TABLE class
    ADD CONSTRAINT class_teacher_fk FOREIGN KEY ( tea_number )
        REFERENCES teacher ( tea_number );

ALTER TABLE score
    ADD CONSTRAINT score_student_fk FOREIGN KEY ( stu_number )
        REFERENCES student ( stu_number );

ALTER TABLE student
    ADD CONSTRAINT student_class_fk FOREIGN KEY ( class_number )
        REFERENCES class ( class_number );

ALTER TABLE student
    ADD CONSTRAINT student_teacher_fk FOREIGN KEY ( tea_number )
        REFERENCES teacher ( tea_number );
        
insert into Teacher values('0','admin','admin','admin','all');
insert into Teacher values('1','a1','a123','최성우','파이썬');
insert into Teacher values('2','a2','a234','이상준','자바');
insert into Teacher values('3','a3','a345','김미희','자바');
insert into Class values('0','0','admin','none');
insert into Class values('1','1','빅데이터','CGI');
insert into Class values('2','2','IOT','CGI');
insert into Class values('3','3','인공지능','아트센터');
insert into Student values('0','0','0','Sadmin','Sadmin','Sadmin','0/0','0/0','none','none','none');
insert into Student values('1','1','1','b1','b123','정지윤','1/2','010','북구','na','none');
insert into Student values('2','1','1','b2','b234','박주현','1/3','020','남구','na','none');
insert into Student values('3','1','1','b3','b345','장경진','1/4','030','서구','na','none');
insert into Student values('4','1','1','b4','b456','박형민','1/5','040','동구','da','none');
insert into Student values('5','1','1','b5','b567','김남진','1/6','050','광산구','da','none');
insert into Student values('6','2','2','c1','c123','가길동','1/2','010','북구','na','none');
insert into Student values('7','2','2','c2','c234','나길동','1/3','020','남구','na','none');
insert into Student values('8','2','2','c3','c345','다길동','1/4','030','서구','na','none');
insert into Student values('9','2','2','c4','c456','라길동','1/5','040','동구','da','none');
insert into Student values('10','2','2','c5','c567','마길동','1/6','050','광산구','da','none');
insert into Student values('11','3','3','d1','d123','홍가동','1/2','010','북구','na','none');
insert into Student values('12','3','3','d2','d234','홍나동','1/3','020','남구','na','none');
insert into Student values('13','3','3','d3','d345','홍다동','1/4','030','서구','na','none');
insert into Student values('14','3','3','d4','d456','홍라동','1/5','040','동구','da','none');
insert into Student values('15','3','3','d5','d567','홍마동','1/6','050','광산구','da','none');
insert into Board values('1','1','0','5','파이썬 공부');
insert into Board values('2','1','0','5','자바 공부');
insert into Board values('3','1','0','4','디비 공부');
insert into Board values('4','0','1','5','자바 공부');
insert into Board values('5','0','1','4/22','디비 공부');
insert into Score values('1','1','4/1','JAVA','95');
insert into Score values('2','2','4/1','JAVA','90');
insert into Score values('3','3','4/1','JAVA','85');
insert into Score values('4','4','4/1','JAVA','80');
insert into Score values('5','5','4/1','DB','100');
insert into Score values('6','1','4/2','DB','95');
insert into Score values('7','2','4/2','DB','90');
insert into Score values('8','3','4/2','DB','85');
insert into Score values('9','4','4/2','DB','80');
insert into Score values('10','5','4/2','DB','100');
