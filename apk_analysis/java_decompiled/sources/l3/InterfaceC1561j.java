package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: l3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1561j {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f20407a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    ByteBuffer b();

    void c();

    boolean d();

    void e(ByteBuffer byteBuffer);

    C1559h f(C1559h c1559h);

    void flush();

    void reset();
}
