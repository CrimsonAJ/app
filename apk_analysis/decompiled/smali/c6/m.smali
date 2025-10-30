.class public abstract Lc6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, LV5/f;

    .line 3
    .line 4
    const-class v2, LU5/j;

    .line 5
    .line 6
    const/16 v3, 0xb

    .line 7
    .line 8
    invoke-direct {v1, v3, v2}, LV5/f;-><init>(ILjava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    new-array v2, v2, [LV5/f;

    .line 13
    .line 14
    aput-object v1, v2, v0

    .line 15
    .line 16
    new-instance v1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    aget-object v3, v2, v0

    .line 22
    .line 23
    iget-object v4, v3, LV5/f;->a:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-object v5, v3, LV5/f;->a:Ljava/lang/Class;

    .line 30
    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    aget-object v0, v2, v0

    .line 37
    .line 38
    iget-object v0, v0, LV5/f;->a:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    sget v0, Lh6/s0;->CONFIG_NAME_FIELD_NUMBER:I

    .line 44
    .line 45
    :try_start_0
    invoke-static {}, Lc6/m;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception v0

    .line 50
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v5, v1}, Lcom/google/android/gms/internal/measurement/k1;->l(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public static a()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lc6/p;->c:Lc6/p;

    .line 3
    .line 4
    invoke-static {v1}, LU5/n;->g(LU5/m;)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lc6/i;->a:Lc6/i;

    .line 8
    .line 9
    invoke-static {v1}, LU5/n;->g(LU5/m;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lc6/c;

    .line 13
    .line 14
    invoke-direct {v1}, Lc6/c;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, LU5/n;->e(LG0/H;Z)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lc6/l;->a:Lb6/k;

    .line 21
    .line 22
    sget-object v1, Lb6/i;->b:Lb6/i;

    .line 23
    .line 24
    sget-object v2, Lc6/l;->a:Lb6/k;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lb6/i;->e(Lb6/k;)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Lc6/l;->b:Lb6/j;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lb6/i;->d(Lb6/j;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Lc6/l;->c:Lb6/c;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lb6/i;->c(Lb6/c;)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Lc6/l;->d:Lb6/a;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lb6/i;->b(Lb6/a;)V

    .line 42
    .line 43
    .line 44
    sget-object v2, Lb6/h;->b:Lb6/h;

    .line 45
    .line 46
    sget-object v3, Lc6/c;->f:Lb6/l;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lb6/h;->b(Lb6/l;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, LY5/a;->a()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    new-instance v3, Lc6/c;

    .line 59
    .line 60
    new-instance v4, LV5/f;

    .line 61
    .line 62
    const-class v5, LU5/j;

    .line 63
    .line 64
    const/16 v6, 0xa

    .line 65
    .line 66
    invoke-direct {v4, v6, v5}, LV5/f;-><init>(ILjava/lang/Class;)V

    .line 67
    .line 68
    .line 69
    new-array v5, v0, [LV5/f;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    aput-object v4, v5, v6

    .line 73
    .line 74
    const-class v4, Lh6/b;

    .line 75
    .line 76
    invoke-direct {v3, v4, v5}, Lc6/c;-><init>(Ljava/lang/Class;[LV5/f;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v3, v0}, LU5/n;->e(LG0/H;Z)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Lc6/f;->a:Lb6/k;

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Lb6/i;->e(Lb6/k;)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lc6/f;->b:Lb6/j;

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Lb6/i;->d(Lb6/j;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lc6/f;->c:Lb6/c;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Lb6/i;->c(Lb6/c;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Lc6/f;->d:Lb6/a;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Lb6/i;->b(Lb6/a;)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lc6/c;->e:Lb6/l;

    .line 103
    .line 104
    invoke-virtual {v2, v0}, Lb6/h;->b(Lb6/l;)V

    .line 105
    .line 106
    .line 107
    return-void
    .line 108
.end method
