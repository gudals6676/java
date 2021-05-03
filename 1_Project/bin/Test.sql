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
constraint result_ch check(result in('��', '��', '��'))
);

create view team_rank
as
select team, sum(goal) total_goal, sum(lost) total_lost, count(case when result = '��' then 1 end) total_win
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

insert into member values ('�����ٸ��౸��', 'bongsoccer', '1212', '����')
insert into member values('���ֵ帲��', 'dreamgoal','1313','����')
insert into member values('����������', 'watermelons','1414','����')
insert into member values('�����÷��̾���', 'stoneplay','1515','����')
insert into member values('��Ͻ�����', 'artsoccer','1616','�ϱ�')
insert into member values('admin', 'admin', 'admin', 'admin')

insert into game values(gamenum_seq.nextval, '�����ٸ��౸��', '����������', '09:00', '��������', '20201225', null)
insert into game values(gamenum_seq.nextval, '�����÷��̾���', '�����ٸ��౸��','12:00', '��������', '20210107', null)
insert into game values(gamenum_seq.nextval, '���ֵ帲��', '��Ͻ�����', '20:00', '��������', '20201225',NULL)
insert into game values(gamenum_seq.nextval,'����������',null, '12:00', '����౸��', '20210106',NULL)
insert into game values(gamenum_seq.nextval,'��Ͻ�����', null, '14:00', '��ϰ����', '20210101',NULL)


insert into gameresult values('�����ٸ��౸��', 3, 2, '��', '20201225')
insert into gameresult values('����������', 2, 3, '��', '20201225')
insert into gameresult values('���ֵ帲��', 3, 3, '��', '20201229')
insert into gameresult values('��Ͻ�����', 3, 3, '��', '20201229')

insert into board values(titlenum_seq.nextval, '����������', '�蹫���Դϴ�', '�̹��� �ָ��� �౸�ϽǺ�?', SYSDATE)
insert into board values(titlenum_seq.nextval, '��Ͻ�����', '������� �����Ѱ���?', '����꿡�� ���ô�?', SYSDATE)
insert into board values(titlenum_seq.nextval, '���ֵ帲��', '�� �ʹ� ���Ѱ� �ƴϿ�', '��Ŭ���� ��Ź�帳�ϴ�.', SYSDATE)
insert into board values(titlenum_seq.nextval, 'admin', '�������Դϴ�', '������ �º� ��Ź�帳�ϴ�', SYSDATE)





