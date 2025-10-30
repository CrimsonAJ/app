.class public abstract LZ5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    new-instance v3, LV5/f;

    .line 6
    .line 7
    const-class v4, LU5/c;

    .line 8
    .line 9
    invoke-direct {v3, v0, v4}, LV5/f;-><init>(ILjava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    new-array v5, v2, [LV5/f;

    .line 13
    .line 14
    aput-object v3, v5, v1

    .line 15
    .line 16
    new-instance v3, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    aget-object v6, v5, v1

    .line 22
    .line 23
    iget-object v7, v6, LV5/f;->a:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    iget-object v8, v6, LV5/f;->a:Ljava/lang/Class;

    .line 30
    .line 31
    if-nez v7, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    aget-object v5, v5, v1

    .line 37
    .line 38
    iget-object v5, v5, LV5/f;->a:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    sget v3, Lh6/s0;->CONFIG_NAME_FIELD_NUMBER:I

    .line 44
    .line 45
    :try_start_0
    sget-object v3, LZ5/c;->b:LZ5/c;

    .line 46
    .line 47
    invoke-static {v3}, LU5/n;->g(LU5/m;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, LY5/a;->a()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    new-instance v3, LV5/h;

    .line 58
    .line 59
    new-instance v5, LV5/f;

    .line 60
    .line 61
    invoke-direct {v5, v0, v4}, LV5/f;-><init>(ILjava/lang/Class;)V

    .line 62
    .line 63
    .line 64
    new-array v0, v2, [LV5/f;

    .line 65
    .line 66
    aput-object v5, v0, v1

    .line 67
    .line 68
    const-class v1, Lh6/F;

    .line 69
    .line 70
    const/16 v4, 0x8

    .line 71
    .line 72
    invoke-direct {v3, v1, v0, v4}, LV5/h;-><init>(Ljava/lang/Class;[LV5/f;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v3, v2}, LU5/n;->e(LG0/H;Z)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catch_0
    move-exception v0

    .line 80
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v2, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 91
    .line 92
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v8, v1}, Lcom/google/android/gms/internal/measurement/k1;->l(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
