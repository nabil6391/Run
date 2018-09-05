package com.shohozapps.run.services.factories;

import com.shohozapps.run.services.AudioCueService;

public interface FocusRequestBuilderFactory {
    AudioCueFocusRequestBuilder createACFRBuilder(AudioCueService audioCueService);
}
