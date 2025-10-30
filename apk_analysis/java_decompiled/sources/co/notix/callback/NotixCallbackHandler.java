package co.notix.callback;

import android.content.Context;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public interface NotixCallbackHandler {
    @Keep
    void handle(Context context, NotixCallback notixCallback);
}
