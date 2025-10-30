package co.notix.p000native;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface NativeData {
    String getDescription();

    Bitmap getIcon();

    Bitmap getImage();

    String getTitle();
}
