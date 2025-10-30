package b0;

import B7.t;
import d0.o;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import x8.y;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.i f10464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(int i9, O7.a aVar) {
        super(0);
        this.f10463d = i9;
        switch (i9) {
            case 1:
                this.f10464e = (kotlin.jvm.internal.i) aVar;
                super(0);
                return;
            default:
                this.f10464e = (kotlin.jvm.internal.i) aVar;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.i, O7.a] */
    @Override // O7.a
    public final Object invoke() {
        ?? r0 = this.f10464e;
        switch (this.f10463d) {
            case 0:
                File file = (File) r0.invoke();
                kotlin.jvm.internal.h.e(file, "<this>");
                String name = file.getName();
                kotlin.jvm.internal.h.d(name, "getName(...)");
                if (W7.d.f0(name, '.', "").equals("preferences_pb")) {
                    String str = y.f24685b;
                    File absoluteFile = file.getAbsoluteFile();
                    kotlin.jvm.internal.h.d(absoluteFile, "file.absoluteFile");
                    return o.h(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                try {
                    return (List) r0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return t.f1135a;
                }
        }
    }
}
