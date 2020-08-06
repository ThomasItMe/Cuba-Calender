package com.company.callender.service;

import com.company.callender.entity.Session;

import java.time.LocalDateTime;

public interface SessionService {
    String NAME = "callender_SessionService";

    Session rescheduleSession(Session session, LocalDateTime newStartDate);
}