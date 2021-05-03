DROP TABLE MEMBER CASCADE CONSTRAINTS;
DROP TABLE PLAYER CASCADE CONSTRAINTS;
DROP TABLE GAME CASCADE CONSTRAINTS;
DROP TABLE GAMERESULT CASCADE CONSTRAINTS;
DROP TABLE BOARD CASCADE CONSTRAINTS;
DROP SEQUENCE PLAYERNUM_SEQ;
DROP SEQUENCE TITLENUM_SEQ;
DROP SEQUENCE GAMENUM_SEQ;
DROP VIEW team_rank

create sequence playernum_seq
increment by 1
start with 1
nocache;

create sequence gamenum_seq
increment by 1
start with 1
nocache;

create sequence titlenum_seq
increment by 1
start with 1
nocache;

create table MEMBER
(
TEAM varchar2(30) not null,
ID varchar2(15) not null,
PW varchar2(15) not null,
AREA varchar2(20) not null,
constraint member_team_pk primary key(team),
constraint member_id_uk unique(id)
);

create table PLAYER
(
PLAYERNUM number(10) not null,
TEAM varchar2(30) not null,
NAME varchar2(20) not null,
AGE number(10) not null,
ELITE varchar2(10),
TITLE varchar2(20),
constraint player_elite_ch check(elite in('Y', 'N', null)),
constraint player_team_fk foreign key(TEAM) references member(team)
);

create table GAME
(
GAMENUM number(10) not null,
TEAM varchar2(30) not null,
OPPOSE varchar2(30),
G_TIME varchar2(20) not null,
G_PLACE varchar2(30) not null,
G_DATE varchar2(20) not null,
STATUS varchar2(10) default null,
constraint game_team_fk foreign key(TEAM) references member(team),
constraint game_status_ch check(status in('APPROVED', 'REJECTED', null))
);

create table GAMERESULT
(
TEAM varchar2(30) not null,
GOAL number(3),
LOST number(3),
RESULT varchar2(3) not null,
G_DATE varchar2(20) not null,
constraint result_team_fk foreign key(team) references member(team),
constraint result_ch check(result in('승', '패', '무'))
);

create view team_rank
as
select team, sum(goal) total_goal, sum(lost) total_lost, count(case when result = '승' then 1 end) total_win
from gameresult
group by team
order by total_win desc

create table BOARD
(
TITLENUM number(10) not null,
TEAM varchar2(30) not null,
B_TITLE varchar2(100) not null,
CONTENT varchar2(200) not null,
CR_DATE date default SYSDATE not null,
constraint board_team_fk foreign key(team) references member(team)
);

insert into member values ('봉선근린축구단', 'bongsoccer', '1212', '남구')
insert into member values('광주드림골', 'dreamgoal','1313','남구')
insert into member values('무등산수박즈', 'watermelons','1414','동구')
insert into member values('서석플레이어즈', 'stoneplay','1515','서구')
insert into member values('운암슛돌이', 'artsoccer','1616','북구')
insert into member values('admin', 'admin', 'admin', 'admin')

insert into game values(gamenum_seq.nextval, '봉선근린축구단', '무등산수박즈', '09:00', '문성고운동장', '20201225', null)
insert into game values(gamenum_seq.nextval, '서석플레이어즈', '봉선근린축구단','12:00', '서석고운동장', '20210107', null)
insert into game values(gamenum_seq.nextval, '광주드림골', '운암슛돌이', '20:00', '문성고운동장', '20201225',NULL)
insert into game values(gamenum_seq.nextval,'무등산수박즈',null, '12:00', '용산축구장', '20210106',NULL)
insert into game values(gamenum_seq.nextval,'운암슛돌이', null, '14:00', '운암경기장', '20210101',NULL)


insert into gameresult values('봉선근린축구단', 3, 2, '승', '20201225')
insert into gameresult values('무등산수박즈', 2, 3, '패', '20201225')
insert into gameresult values('광주드림골', 3, 3, '무', '20201229')
insert into gameresult values('운암슛돌이', 3, 3, '무', '20201229')

insert into board values(titlenum_seq.nextval, '무등산수박즈', '김무등입니다', '이번주 주말에 축구하실분?', SYSDATE)
insert into board values(titlenum_seq.nextval, '운암슛돌이', '경기참가 가능한가요?', '무등산에서 봅시다?', SYSDATE)
insert into board values(titlenum_seq.nextval, '광주드림골', '거 너무 심한거 아니오', '태클자제 부탁드립니다.', SYSDATE)
insert into board values(titlenum_seq.nextval, 'admin', '관리자입니다', '정당한 승부 부탁드립니다', SYSDATE)





