package com.shohozapps.run.injection.components;

import com.shohozapps.run.injection.modules.AudioCueServiceModule;
import com.shohozapps.run.injection.scopes.RunningActivityScope;
import com.shohozapps.run.services.AudioCueService;

import dagger.Subcomponent;

@RunningActivityScope
@Subcomponent(modules = {AudioCueServiceModule.class})
public interface AudioCueServiceComponent {
    void inject(AudioCueService audioCueService);
}
