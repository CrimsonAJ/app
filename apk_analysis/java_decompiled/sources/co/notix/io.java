package co.notix;

import B7.D;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 co.notix.io, still in use, count: 1, list:
  (r0v0 co.notix.io) from 0x001b: FILLED_NEW_ARRAY (r0v0 co.notix.io), (r1v1 co.notix.io) A[WRAPPED] (LINE:28) elemType: co.notix.io
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class io {
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR,
    BAD_STATUS_CODE;


    /* renamed from: a, reason: collision with root package name */
    public static final Set f12491a;

    static {
        io ioVar = BAD_STATUS_CODE;
        f12491a = D.R(r0, ioVar);
    }

    public io() {
    }

    public static io valueOf(String str) {
        return (io) Enum.valueOf(io.class, str);
    }

    public static io[] values() {
        return (io[]) f12493c.clone();
    }
}
