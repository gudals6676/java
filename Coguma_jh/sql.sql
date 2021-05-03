select * from student


DROP TABLE "BOARD" CASCADE CONSTRAINTS;
DROP TABLE "CLASS" CASCADE CONSTRAINTS;
DROP TABLE "SCORE" CASCADE CONSTRAINTS;
DROP TABLE "STUDENT" CASCADE CONSTRAINTS;
DROP TABLE "TEACHER" CASCADE CONSTRAINTS;


--DROP TABLE "BOARDMANAGER" CASCADE CONSTRAINTS;
CREATE TABLE board(
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
insert into Teacher values('a1','a123','최성우','파이썬');
insert into Teacher values('a2','a234','이상준','자바');
insert into Teacher values('a3','a345','김미희','자바');
insert into Class values('0','admin','admin','none');
insert into Class values('1','a1','빅데이터','CGI');
insert into Class values('2','a2','IOT','CGI');
insert into Class values('3','a3','인공지능','아트센터');
insert into Student values('Sadmin','admin','0','Sadmin','Sadmin','0/0/0','000','none','none','0','0');
insert into Student values('b1','a1','1','b123','정지윤','97/1/2','010-1234-5678','광주 연제동','na','0','0');
insert into Student values('b2','a1','1','b234','박주현','96/1/3','010-1548-8451','광주 두암동','na','0','0');
insert into Student values('b3','a1','1','b345','장경진','95/1/4','010-2115-4451','광주 소태동','na','0','0');
insert into Student values('b4','a1','1','b456','박형민','93/1/5','010-1111-1111','광주 양림동','da','0','0');
insert into Student values('b5','a1','1','b567','김남진','98/1/6','010-1212-1212','광주 양산동','da','0','0');
insert into Student values('c1','a2','2','c123','주익정','91/1/2','010-1313-1313','나주 혁신도시','na','0','0');
insert into Student values('c2','a2','2','c234','안은식','98/1/3','010-1414-1414','광주 방림동','na','0','0');
insert into Student values('c3','a2','2','c345','김은혜','95/1/4','010-1515-1515','광주 봉선동','na','0','0');
insert into Student values('c4','a2','2','c456','이대교','94/1/5','010-1616-1616','전남 화순군','da','0','0');
insert into Student values('c5','a2','2','c567','남수환','91/1/6','010-1717-1717','광주 매곡동','da','0','0');
insert into Student values('d1','a3','3','d123','장영우','00/1/2','010-1818-1818','광주 운암동','na','0','0');
insert into Student values('d2','a3','3','d234','손민호','99/1/3','010-1919-1919','전남 담양군','na','0','0');
insert into Student values('d3','a3','3','d345','김온유','98/1/4','010-2222-2222','광주 진월동','na','0','0');
insert into Student values('d4','a3','3','d456','신근아','99/1/5','010-3333-3333','광주 신안동','da','0','0');
insert into Student values('d5','a3','3','d567','전영욱','93/1/6','010-4444-4444','광주 양림동','da','0','0');
insert into Student values('e1','a1','1','e123','정종원','94/1/2','010-5154-5154','광주 두암동','na','0','0');
insert into Student values('e2','a2','2','e345','이준혁','95/1/8','010-1518-4254','전남 화순','na','0','0');
insert into Student values('e3','a3','3','e567','최현영','96/3/6','010-6154-2154','광주 소태동','na','0','0');
insert into Student values('e4','a1','3','e789','김채원','97/5/2','010-4512-5124','전남 담양군','na','0','0');
insert into Board values('1','a1','Sadmin','파이썬 공부','0');
insert into Board values('2','a1','Sadmin','파이썬 공부 2차','0');
insert into Board values('3','a2','Sadmin','디비 공부','0');
insert into Board values('4','a3','Sadmin','자바 공부','0');
insert into Board values('5','admin','b1','파이썬 보강','0');
insert into Board values('6','admin','b2','디비 보강','0');
insert into Board values('7','admin','b3','자바 보강','0');

insert into Score values('1','b1','4/1','JAVA','95');
insert into Score values('2','b2','4/1','JAVA','90');
insert into Score values('3','b3','4/1','JAVA','85');
insert into Score values('4','b4','4/1','JAVA','80');
insert into Score values('5','b5','4/1','DB','100');
insert into Score values('6','b1','4/2','DB','95');
insert into Score values('7','b2','4/2','DB','90');
insert into Score values('8','b3','4/2','DB','85');
insert into Score values('9','b4','4/2','DB','80');
insert into Score values('10','b5','4/2','DB','100');
insert into Score values('11','b1','4/3','JAVA-2','95');
insert into BOARDMANAGER values('1','b1','1');
insert into BOARDMANAGER values('2','b2','1');
insert into BOARDMANAGER values('3','b3','1');
insert into BOARDMANAGER values('4','b4','1');
insert into BOARDMANAGER values('5','b1','2');
insert into BOARDMANAGER values('6','b2','2');
select * from student
