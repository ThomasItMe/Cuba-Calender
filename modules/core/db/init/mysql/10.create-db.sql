-- begin CALLENDER_SPEAKER
create table CALLENDER_SPEAKER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    EMAIL varchar(1024) not null,
    --
    primary key (ID)
)^
-- end CALLENDER_SPEAKER
-- begin CALLENDER_SESSION
create table CALLENDER_SESSION (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    TOPIC varchar(255) not null,
    START_DATE datetime(3) not null,
    SPEAKER_ID varchar(32) not null,
    DURATION integer not null,
    DESCRIPTION varchar(2000),
    --
    primary key (ID)
)^
-- end CALLENDER_SESSION
