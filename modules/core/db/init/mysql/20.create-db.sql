-- begin CALLENDER_SPEAKER
create index IDX_CALLENDER_SPEAKER on CALLENDER_SPEAKER (FIRST_NAME, LAST_NAME)^
-- end CALLENDER_SPEAKER
-- begin CALLENDER_SESSION
alter table CALLENDER_SESSION add constraint FK_CALLENDER_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references CALLENDER_SPEAKER(ID)^
create index IDX_CALLENDER_SESSION_ON_SPEAKER on CALLENDER_SESSION (SPEAKER_ID)^
-- end CALLENDER_SESSION
