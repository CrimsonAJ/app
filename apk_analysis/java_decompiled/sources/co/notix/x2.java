package co.notix;

/* loaded from: classes.dex */
public abstract class x2 {
    public static String a(d3 d3Var) {
        if (d3Var instanceof y2) {
            return "Interstitial";
        }
        if (d3Var instanceof v2) {
            return "AppOpen";
        }
        if (d3Var instanceof a3) {
            return "Native";
        }
        if (d3Var instanceof w2) {
            return "Banner";
        }
        if (d3Var instanceof c3) {
            return "Push";
        }
        if (d3Var instanceof b3) {
            return "Pull";
        }
        if (d3Var instanceof z2) {
            return "LockScreenInterstitial";
        }
        throw new RuntimeException();
    }
}
