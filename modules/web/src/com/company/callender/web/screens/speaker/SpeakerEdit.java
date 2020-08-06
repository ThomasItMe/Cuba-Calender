package com.company.callender.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.callender.entity.Speaker;

@UiController("callender_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}