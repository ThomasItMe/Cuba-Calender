package com.company.callender.web.screens.speaker;

import com.company.callender.entity.Speaker;
import com.haulmont.cuba.gui.screen.*;

@UiController("callender_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}