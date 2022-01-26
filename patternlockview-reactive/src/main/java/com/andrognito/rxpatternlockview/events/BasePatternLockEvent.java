package com.andrognito.rxpatternlockview.events;


import com.andrognito.patternlockview.PatternLockView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.annotations.Nullable;

/**
 * Created by aritraroy on 01/04/17.
 */

public abstract class BasePatternLockEvent {
    protected List<PatternLockView.Dot> mPattern;

    protected BasePatternLockEvent(List<PatternLockView.Dot> pattern) {
        mPattern = pattern;
    }

    @Nullable
    public List<PatternLockView.Dot> getPattern() {
        if (mPattern == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(mPattern);
    }
}
