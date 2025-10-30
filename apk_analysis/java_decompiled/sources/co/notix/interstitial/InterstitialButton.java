package co.notix.interstitial;

import androidx.annotation.Keep;
import co.notix.cc;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public final class InterstitialButton {
    public static final cc Companion = new cc();
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public InterstitialButton() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InterstitialButton copy$default(InterstitialButton interstitialButton, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = interstitialButton.text;
        }
        return interstitialButton.copy(str);
    }

    public final String component1() {
        return this.text;
    }

    public final InterstitialButton copy(String str) {
        return new InterstitialButton(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterstitialButton) && h.a(this.text, ((InterstitialButton) obj).text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC0953k1.p(new StringBuilder("InterstitialButton(text="), this.text, ')');
    }

    public InterstitialButton(String str) {
        this.text = str;
    }

    public /* synthetic */ InterstitialButton(String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str);
    }
}
