package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum C {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC1037h.class, AbstractC1037h.f16356b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    C(Class cls, Serializable serializable) {
    }
}
