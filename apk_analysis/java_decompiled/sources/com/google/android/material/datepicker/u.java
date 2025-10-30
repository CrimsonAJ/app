package com.google.android.material.datepicker;

import android.app.job.JobInfo;
import android.media.MediaCodec;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i9) {
        return new JobInfo.TriggerContentUri(uri, i9);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern d() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ void l() {
    }
}
