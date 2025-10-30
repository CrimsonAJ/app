package O5;

/* loaded from: classes.dex */
public abstract class b implements j {
    public abstract boolean a(char c3);

    @Override // O5.j
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
